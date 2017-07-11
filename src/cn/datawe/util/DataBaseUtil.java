package cn.datawe.util;

import java.io.BufferedReader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 工具类:数据库
 * 
 * @author LiuJiaLe
 *
 */
public final class DataBaseUtil {
	
	private static final Log logger = LogFactory.getLog(DataBaseUtil.class);

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String URL = "jdbc:mysql://120.76.203.87:3356/dafy_dev?useUnicode=true&characterEncoding=UTF-8";
	
	private static final String USERNAME = "dafy1";
	
	private static final String PASSWORD = "dev778899";
	
	private static Connection conn = null;
	
	private static PreparedStatement sta = null;
	
	private static ResultSet rs = null;
	
	static {
		
		try {
			
			Class.forName(DRIVER);
		} catch (Exception e) {
			
			logger.error(e);
		}
	}
	
	
	public static Connection getConnection() {
		
		try {
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			
			logger.error(e);
		}
		return conn;
	}
	
	
	public static ResultSet query(String sql, Object... obj) {
		
		conn = getConnection();
		try {
			
			sta = conn.prepareStatement(sql);
			if (null != obj) {
				
				for (int i=0; i<obj.length; i++) {
					
					sta.setObject(i+1, obj[i]);
				}
			}
			rs = sta.executeQuery();
		} catch (Exception e) {
			
			logger.error(e);
		}
		return rs;
	}
	
	
	public static int update(String sql, Object... obj) {
		
		int count = 0;
		conn = getConnection();
		try {
			
			sta = conn.prepareStatement(sql);
			if (null != obj) {
				
				for (int i=0; i<obj.length; i++) {
					
					sta.setObject(i+1, obj[i]);
				}
			}
			count = sta.executeUpdate();
		} catch (Exception e) {
			
			logger.error(e);
		} finally {
			
			close();
		}
		return count;
	}
	
	
	public static Map<Object, Object> queryMap(String sql, Object... obj) {
		
		return toMap(query(sql, obj));
	}
	
	
	public static List<Map<Object, Object>> queryList(String sql, Object... obj) {
		
		return toList(query(sql, obj));
	}
	
	
	public static void close() {
		
		try {
			
			if (null != rs) {
				
				rs.close();
			}
		} catch (Exception e) {
			
			logger.error(e);
		} finally {
			
			try {
				
				if (null != sta) {
					
					sta.close();
				}
			} catch (Exception e) {
				
				logger.error(e);
			} finally {
				
				try {
					
					if (null != conn) {
						
						conn.close();
					}
				} catch (Exception e) {
					
					logger.error(e);
				}
			}
		}
	}
	
	
	public static Map<Object, Object> toMap(ResultSet rs) {
		
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		try {
			
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			while (rs.next()) {
				
				for (int i=1; i<=columnCount; i++) {
					
					map.put(md.getColumnName(i).toLowerCase(), toString(rs.getObject(i)));
				}
			}
		} catch (Exception e) {
			
			logger.error(e);
		} finally {
			
			try {
				
				if (null != rs) {
					
					rs.close();
				}
			} catch (Exception e) {
				
				logger.error(e);
			}
		}
		return map;
	}
	
	
	public static List<Map<Object, Object>> toList(ResultSet rs) {
		
		List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
		try {
			
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			Map<Object, Object> map = null;
			while (rs.next()) {
				
				map = new LinkedHashMap<Object, Object>();
				for (int i=1; i<=columnCount; i++) {
					
					map.put(md.getColumnName(i).toLowerCase(), toString(rs.getObject(i)));
				}
				list.add(map);
			}
		} catch (Exception e) {
			
			logger.error(e);
		} finally {
			
			try {
				
				if (null != rs) {
					
					rs.close();
				}
			} catch (Exception e) {
				
				logger.error(e);
			}
		}
		return list;
	}
	
	
	public static String toString(Object obj) {
		
		if (null == obj) {
			
			return null;
		}
		if (isClob(obj)) {
			
			StringBuilder sb = new StringBuilder();
			try {
				
				BufferedReader buffer = new BufferedReader(((Clob) obj).getCharacterStream());
				String line = buffer.readLine();
				while (null != line) {
					
					sb.append(line);
					line = buffer.readLine();
				}
			} catch (Exception e) {
				
				logger.error(e);
			}
			return sb.toString();
		}
		return obj.toString();
	}
	
	
	public static boolean isClob(Object obj) {
		
		return null == obj ? false : Clob.class.isAssignableFrom(obj.getClass());
	}
	
	private DataBaseUtil() {}
	
	public static void main(String[] args) {
		
		String sql = "select * from t_client";
		ResultSet rs = query(sql);
		List<Map<Object, Object>> list = toList(rs);
		for (Map<Object, Object> map : list) {
			
			System.out.println(map);
		}
		
//		String sql = "insert into t_client(code, name, type, status, username, password, create_time, update_time)" +
//				"values(?, ?, ?, ?, ?, ?, now(), now())";
//		System.out.println("sql: " + sql);
//		int rows = update(sql, "333", "name333", 3, 3, "username333", "password333");
//		System.out.println(rows);
	}
}
