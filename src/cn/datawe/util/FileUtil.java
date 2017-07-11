package cn.datawe.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 工具类:文件
 * 
 * @author LiuJiaLe
 *
 */
public final class FileUtil {
	
	private static final Log logger = LogFactory.getLog(FileUtil.class);
	
	public static final int BUFFER_SIZE = 1024;
	
	public static final String CHARSET = "UTF-8";
	
	public static final String BOM = "\uFEFF";
	
	public static final boolean CREATE_DIR = true;
	
	public static final boolean COVER = true;
	
	public static final Map<String, String> FILE_TYPE_MAP = new HashMap<String, String>();
	
	static {
		
		/**图片文件*/
		FILE_TYPE_MAP.put("FFD8FF", "jpg");
		FILE_TYPE_MAP.put("FFD8FFE0", "jpg");
		FILE_TYPE_MAP.put("FFD8FFE1", "jpg");
		FILE_TYPE_MAP.put("47494638", "gif");
		FILE_TYPE_MAP.put("89504E47", "png");
		FILE_TYPE_MAP.put("424D", "bmp");
		
		/**影音文件*/
		FILE_TYPE_MAP.put("57415645", "wav");
		FILE_TYPE_MAP.put("41564920", "avi");
		FILE_TYPE_MAP.put("000001BA", "mpg");
		FILE_TYPE_MAP.put("000001B3", "mpg");
		FILE_TYPE_MAP.put("2E524D46", "rm");
		FILE_TYPE_MAP.put("2E7261FD", "ram");
		FILE_TYPE_MAP.put("3026B2758E66CF11", "asf");
		FILE_TYPE_MAP.put("4D546864", "mid");
		
		/**其他文件*/
		FILE_TYPE_MAP.put("4D5A5000", "exe");
		FILE_TYPE_MAP.put("4D5A9000", "exe");
		FILE_TYPE_MAP.put("3C3F786D6C", "xml");
		FILE_TYPE_MAP.put("68746D6C3E", "html");
		FILE_TYPE_MAP.put("48544D4C207B0D0A0942", "css");
		FILE_TYPE_MAP.put("696B2E71623D696B2E71", "js");
		FILE_TYPE_MAP.put("504B0304", "zip");
		FILE_TYPE_MAP.put("52617221", "rar");
		FILE_TYPE_MAP.put("1F8B08", "gz");
		FILE_TYPE_MAP.put("38425053", "psd");
		FILE_TYPE_MAP.put("255044462D312E", "pdf");
		FILE_TYPE_MAP.put("75736167", "txt");
		FILE_TYPE_MAP.put("D0CF11E0", "doc");
		FILE_TYPE_MAP.put("504B0304", "docx");
	}
	
	/**
	 * 获取文件类型
	 * 
	 * @param filePath
	 * @return
	 */
	public static final String getFileType(String filePath) {
		
		return getFileType(new File(filePath));
	}
	
	/**
	 * 获取文件类型
	 * 
	 * @param file
	 * @return
	 */
	public static final String getFileType(File file) {
		
		String fileType = null;
		if (isFile(file)) {
			
			try {
				
				fileType = getFileType(new FileInputStream(file));
			} catch (Exception e) {
				
				logger.warn(e);
			}
		}
		return fileType;
	}
	
	/**
	 * 获取文件类型
	 * 
	 * @param in
	 * @return
	 */
	public static final String getFileType(InputStream in) {
		
		String result = null;
		if (null != in) {
			
			byte[] buffer = new byte[30];
			try {
				
				in.read(buffer);
				result = getFileType(buffer);
			} catch (Exception e) {
				
				logger.warn(e);
			} finally {
				
				if (null != in) {
					
					try {
						
						in.close();
					} catch (IOException e) {
						
						logger.warn(e);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * 获取文件类型
	 * 
	 * @param array
	 * @return
	 */
	public static final String getFileType(byte[] array) {
		
		String fileTypeHex = toHexString(array);
		if (null != fileTypeHex) {
			
			for (Map.Entry<String, String> entry : FILE_TYPE_MAP.entrySet()) {
				
				if (fileTypeHex.startsWith(entry.getKey())) {
					
					return entry.getValue();
				}
			}
		}
		return null;
	}
	
	/**
	 * 获取文件类型
	 * 
	 * @param buffer
	 * @return
	public static String getFileType(byte[] array) {
		
		String type = null;
		if (array[1] == 'P' && array[2] == 'N' && array[3] == 'G') {
			
			type = "png";
		} else if (array[6] == 'J' && array[7] == 'F' && array[8] == 'I' && array[9] == 'F') {
			
			type = "jpg";
		} else if (array[6] == 'E' && array[7] == 'x' && array[8] == 'i' && array[9] == 'f') {
			
			type = "jpeg";
		} else if (array[0] == 'G' && array[1] == 'I' && array[2] == 'F') {
			
			type = "gif";
		} else if (array[0] == 'B' && array[1] == 'M') {
			
			type = "bmp";
		} else if (array[0] == 'M' && array[1] == 'Z' && array[1] == 'P') {
			
			type = "exe";
		}
		return type;
	}
	*/
	
	/**
	 * 将字节数组转换为十六进制字符串
	 * 
	 * @param buffer
	 * @return
	 */
	public static String toHexString(byte[] buffer) {
		
		if (null == buffer || buffer.length < 1) {
			
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for (byte b : buffer) {
			
			//sb.append(Integer.toHexString(b & 0xFF));
			sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString().toUpperCase();
	}
	
	/**
	 * 获取文件MD5
	 * 
	 * @param filePath
	 * @return
	 */
	public static String getMD5(String filePath) {
		
		return getMD5(filePath, BUFFER_SIZE);
	}
	
	/**
	 * 获取文件MD5
	 * 
	 * @param filePath
	 * @param bufferSize
	 * @return
	 */
	public static String getMD5(String filePath, int bufferSize) {
		
		String result = null;
		InputStream in = null;
		try {
			
			File file = new File(filePath);
			MessageDigest md = MessageDigest.getInstance("MD5");
			int len = 0;
			byte[] buffer = new byte[bufferSize];
			in = new FileInputStream(file);
			while ((len=in.read(buffer)) > 0) {
				
				md.update(buffer, 0, len);
			}
			result = toHexString(md.digest());
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != in) {
				
				try {
					
					in.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	/**
	 * 删除文件或目录
	 * 
	 * @param filePath
	 */
	public static boolean delete(String filePath) {
		
		boolean flag = false;
		try {
			
			File file = new File(filePath);
			if (file.isFile()) {
				
				flag = file.delete();
			} else if (file.isDirectory()) {
				
				File[] fileArray = file.listFiles();
				for (File f : fileArray) {
					// 递归删除
					filePath = f.getAbsolutePath();
					flag = delete(filePath);
				}
				flag = file.delete();
			}
		} catch (Exception e) {
			
			logger.warn(e);
		}
		return flag;
	}
	
	/**
	 * 批量删除文件或目录
	 * 
	 * @param filePaths
	 */
	public static void delete(String... filePaths) {
		
		for (String filePath : filePaths) {
			
			delete(filePath);
		}
	}
	
	/**
	 * 移动文件
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 */
	public static void move(String srcFilePath, String destFilePath) {
		
		move(srcFilePath, destFilePath, CREATE_DIR, COVER);
	}
	
	/**
	 * 移动文件
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param createDir
	 * @param cover
	 */
	public static void move(String srcFilePath, String destFilePath, boolean createDir, boolean cover) {
		
		try {
			
			File srcFile = new File(srcFilePath);
			if (!srcFilePath.equals(destFilePath)) {
				
				File destFile = new File(destFilePath);
				File destDir = destFile.getParentFile();
				if (!cover && destFile.exists()) {
					
					return ;
				}
				if (!destDir.exists()) {
					
					if (!createDir) {
						
						return ;
					}
					destDir.mkdirs();
				}
				srcFile.renameTo(destFile);
			}
		} catch (Exception e) {
			
			logger.warn(e);
		}
	}

	/**
	 * 复制文件
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 */
	public static void copy(String srcFilePath, String destFilePath) {
		
		copy(srcFilePath, destFilePath, BUFFER_SIZE, CREATE_DIR, COVER);
	}
	
	/**
	 * 复制文件
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param bufferSize
	 * @param createDir
	 * @param cover
	 */
	public static void copy(String srcFilePath, String destFilePath, int bufferSize, boolean createDir, boolean cover) {
		
		if (ValidatorUtil.isNotEquals(srcFilePath, destFilePath)) {
			
			InputStream in = null;
			OutputStream out = null;
			try {
				
				File destFile = new File(destFilePath);
				File destDir = destFile.getParentFile();
				if (!cover && destFile.exists()) {
					
					return ;
				}
				if (!destDir.exists()) {
					
					if (!createDir) {
						
						return ;
					}
					destDir.mkdirs();
				}
				in = new FileInputStream(srcFilePath);
				out = new FileOutputStream(destFilePath);
				byte[] buffer = new byte[bufferSize];
				int len;
				while ((len=in.read(buffer)) > 0) {
					
					out.write(buffer, 0, len);
				}
			} catch (Exception e) {
				
				logger.warn(e);
			} finally {
				
				if (null != in) {
					
					try {
						
						in.close();
					} catch (IOException e) {
						
						logger.warn(e);
					}
				}
				if (null != out) {
					
					try {
						
						out.close();
					} catch (IOException e) {
						
						logger.warn(e);
					}
				}
			}
		}
	}
	
	/**
	 * 读取文本文件
	 * 
	 * @param filePath
	 * @return
	 */
	public static String readText(String filePath) {
		
		return readText(filePath, CHARSET, "");
	}
	
	/**
	 * 读取文本文件
	 * 
	 * @param filePath
	 * @param charset
	 * @return
	 */
	public static String readText(String filePath, String charset) {
		
		return readText(filePath, charset, "");
	}
	
	/**
	 * 读取文本文件
	 * 
	 * @param filePath
	 * @param charset
	 * @param separator
	 * @return
	 */
	public static String readText(String filePath, String charset, String separator) {
		
		String result = null;
		BufferedReader reader = null;
		try {
			
			File file = new File(filePath);
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
			StringBuilder sb = new StringBuilder();
			String line = reader.readLine();
			if (line.startsWith(BOM)) {
				
				line = line.substring(1);
			}
			while (null != line) {
				
				sb.append(line).append(separator);
				line = reader.readLine();
			}
			sb.setLength(sb.length()-separator.length());
			result = sb.toString();
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != reader) {
				
				try {
					
					reader.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	/**
	 * 读取文本文件
	 * 
	 * @param filePath
	 * @param charset
	 * @return
	 */
	public static List<String> readTextToList(String filePath, String charset) {
		
		List<String> result = null;
		BufferedReader reader = null;
		try {
			
			result = new ArrayList<String>();
			File file = new File(filePath);
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
			String line = reader.readLine();
			if (line.startsWith(BOM)) {
				
				line = line.substring(1);
			}
			while (null != line) {
				
				result.add(line);
				line = reader.readLine();
			}
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != reader) {
				
				try {
					
					reader.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	/**
	 * 读取文本文件
	 * 
	 * @param filePath
	 * @param charset
	 * @return
	 */
	public static List<Integer> readTextToIntegerList(String filePath, String charset) {
		
		List<Integer> result = null;
		BufferedReader reader = null;
		try {
			
			result = new ArrayList<Integer>();
			File file = new File(filePath);
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
			String line = reader.readLine();
			if (line.startsWith(BOM)) {
				
				line = line.substring(1);
			}
			while (ValidatorUtil.isInteger(line)) {
				
				result.add(Integer.parseInt(line));
				line = reader.readLine();
			}
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != reader) {
				
				try {
					
					reader.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	/**
	 * 读取文本文件
	 * 
	 * @param filePath
	 * @param charset
	 * @return
	 */
	public static List<Long> readTextToLongList(String filePath, String charset) {
		
		List<Long> result = null;
		BufferedReader reader = null;
		try {
			
			result = new ArrayList<Long>();
			File file = new File(filePath);
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
			String line = reader.readLine();
			if (line.startsWith(BOM)) {
				
				line = line.substring(1);
			}
			while (ValidatorUtil.isInteger(line)) {
				
				result.add(Long.parseLong(line));
				line = reader.readLine();
			}
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != reader) {
				
				try {
					
					reader.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	/**
	 * 读取文本文件
	 * 
	 * @param filePath
	 * @param charset
	 * @param separator
	 * @return
	 */
	public static List<String[]> readTextToList(String filePath, String charset, String separator) {
		
		List<String[]> result = null;
		BufferedReader reader = null;
		try {
			
			result = new ArrayList<String[]>();
			File file = new File(filePath);
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
			String line = reader.readLine();
			if (line.startsWith(BOM)) {
				
				line = line.substring(1);
			}
			String[] array = null;
			while (null != line) {
				
				array = line.split(separator);
				result.add(array);
				line = reader.readLine();
			}
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != reader) {
				
				try {
					
					reader.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	/**
	 * 写入文本文件
	 * 
	 * @param text
	 * @param filePath
	 * @param append
	 * @param newLine
	 */
	public static void writeText(String text, String filePath, boolean append, boolean newLine) {
		
		
		FileWriter writer = null;
		try {
			
			writer = new FileWriter(filePath, append);
			writer.write(text.concat(newLine ? System.getProperty("line.separator") : ""));
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != writer) {
				
				try {
					
					writer.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
	}
	
	/**
	 * 创建文件
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @return
	 */
	public static File create(String srcFilePath, String destFilePath) {
		
		return create(srcFilePath, destFilePath, BUFFER_SIZE, CREATE_DIR);
	}
	
	/**
	 * 创建文件
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param bufferSize
	 * @param createDir
	 * @return
	 */
	public static File create(String srcFilePath, String destFilePath, int bufferSize, boolean createDir) {
		
		File file = null;
		InputStream in = null;
		OutputStream out = null;
		try {
			
			int index = destFilePath.lastIndexOf(File.separator);
			String destDirPath = destFilePath.substring(0, index);
			File destDir = new File(destDirPath);
			if (!destDir.exists()) {
				
				if (!createDir) {
					
					return file;
				}
				destDir.mkdirs();
			}
			in = new FileInputStream(srcFilePath);
			out = new FileOutputStream(destFilePath);
			byte[] buffer = new byte[bufferSize];
			int len;
			while ((len=in.read(buffer)) > 0) {
				
				out.write(buffer, 0, len);
			}
			file = new File(destFilePath);
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != in) {
				
				try {
					
					in.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
			if (null != out) {
				
				try {
					
					out.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return file;
	}
	
	/**
	 * 创建文件(文件名唯一)
	 * 
	 * @param srcFilePath
	 * @param destDirPath
	 * @return
	 */
	public static File createUnique(String srcFilePath, String destDirPath) {
		
		return createUnique(srcFilePath, destDirPath, BUFFER_SIZE, CREATE_DIR);
	}
	
	/**
	 * 创建文件(文件名唯一)
	 * 
	 * @param srcFilePath
	 * @param destDirPath
	 * @param bufferSize
	 * @param createDir
	 * @return
	 */
	public static File createUnique(String srcFilePath, String destDirPath, int bufferSize, boolean createDir) {
		
		File file = null;
		InputStream in = null;
		OutputStream out = null;
		try {
			
			File destDir = new File(destDirPath);
			if (!destDir.exists()) {
				
				if (!createDir) {
					
					return file;
				}
				destDir.mkdirs();
			}
			
			String fileName = getUniqueFileName(srcFilePath);
			String destFilePath = null;
			if (destDirPath.endsWith(File.separator)) {
				
				destFilePath = destDirPath.concat(fileName);
			} else {
				
				destFilePath = destDirPath.concat(File.separator).concat(fileName);
			}
			in = new FileInputStream(srcFilePath);
			out = new FileOutputStream(destFilePath);
			byte[] buffer = new byte[bufferSize];
			int len;
			while ((len=in.read(buffer)) > 0) {
				
				out.write(buffer, 0, len);
			}
			file = new File(destFilePath);
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != in) {
				
				try {
					
					in.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
			if (null != out) {
				
				try {
					
					out.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return file;
	}
	
	public static String getName(String filePath) {
		
		int index = filePath.lastIndexOf(File.separator);
		String fileName = filePath.substring(index+1, filePath.length());
		return fileName;
	}
	
	public static String getDotSuffixByName(String filePath) {
		
		int index = filePath.lastIndexOf(".");
		String fileExt = filePath.substring(index);
		return fileExt;
	}
	
	public static String getSuffixByName(String filePath) {
		
		return getDotSuffixByName(filePath).substring(1);
	}
	
	public static String getUniqueFileName(String filePath) {
		
		String uniqueFileName = getUUID().concat(getDotSuffixByName(filePath));
		return uniqueFileName;
	}
	
	public static String getUUID() {
		
		return java.util.UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}
	
	/**
	 * 获取文件字节数组
	 * 
	 * @param filePath
	 * @return
	 */
	public static byte[] getByteArray(String filePath) {
		
		return getByteArray(filePath, BUFFER_SIZE);
	}
	
	/**
	 * 获取文件字节数组
	 * 
	 * @param filePath
	 * @param bufferSize
	 * @return
	 */
	public static byte[] getByteArray(String filePath, int bufferSize) {
		
		byte[] result = null;
		InputStream in = null;
		ByteArrayOutputStream out = null;
		try {
			
			File file = new File(filePath);
			in = new FileInputStream(file);
			out = new ByteArrayOutputStream();
			byte[] buffer = new byte[bufferSize];
			int len;
			while ((len=in.read(buffer)) > 0) {
				
				out.write(buffer, 0, len);
			}
			result = out.toByteArray();
		} catch (IOException e) {
			
			logger.warn(e);
		} finally {
			
			if (null != in) {
				
				try {
					
					in.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
			if (null != out) {
				
				try {
					
					out.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	/**
	 * 获取文件输入流
	 * 
	 * @param filePath
	 * @return
	 */
	public static InputStream getInputStream(String filePath) {
		
		FileInputStream in = null;
		File file = new File(filePath);
		try {
			
			in = new FileInputStream(file);
		} catch (Exception e) {
			
			logger.warn(e);
		}
		return in;
	}
	
	/**
	 * 文件转Base64编码
	 * 
	 * @param filePath
	 * @return
	 */
	public static String toBase64(String filePath) {
		
		return toBase64(new File(filePath));
	}
	
	/**
	 * 文件转Base64编码
	 * 
	 * @param file
	 * @return
	 */
	public static String toBase64(File file) {
		
		String result = null;
		InputStream in = null;
		ByteArrayOutputStream out = null;
		try {
			
			in = new FileInputStream(file);
			out = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len;
			while ((len=in.read(buffer)) > 0) {
				
				out.write(buffer, 0, len);
			}
			result = org.apache.commons.codec.binary.Base64.encodeBase64String(out.toByteArray());
		} catch (Exception e) {
			
			logger.warn(e);
		} finally {
			
			if (null != in) {
				
				try {
					
					in.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
			if (null != out) {
				
				try {
					
					out.close();
				} catch (IOException e) {
					
					logger.warn(e);
				}
			}
		}
		return result;
	}
	
	public static String getCharset(InputStream in) throws Exception{
		
		String code = null;  
		BufferedInputStream bin = null; 
		try{
			
			bin = new BufferedInputStream(in); 
			
			int p = (bin.read() << 8) + bin.read();  
	        
	        switch (p) {  
	            case 0xefbb:  
	                code = "UTF-8";  
	                break;  
	            case 0xfffe:  
	                code = "Unicode";  
	                break;  
	            case 0xfeff:  
	                code = "UTF-16BE";  
	                break;  
	            default:  
	                code = "GBK";  
	        } 
		}catch(Exception e){
			throw new Exception(e);
		}finally{
			if(bin != null){
				bin.close();
			}
		}
        return code;
	}
	
	/**
	 * 获取文件中的文本编码,针对txt,log等文件有效
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static String getCharset(String fileName) throws Exception{
		String code = null;  
		
		FileInputStream fin = null;
		BufferedInputStream bin = null; 
		
		try{
			fin = new FileInputStream(fileName);
			bin = new BufferedInputStream(fin); 
			
			int p = (bin.read() << 8) + bin.read();  
	        
	        switch (p) {  
	            case 0xefbb:  
	                code = "UTF-8";  
	                break;  
	            case 0xfffe:  
	                code = "Unicode";  
	                break;  
	            case 0xfeff:  
	                code = "UTF-16BE";  
	                break;  
	            default:  
	                code = "GBK";  
	        } 
		}catch(Exception e){
			throw new Exception(e);
		}finally{
			if(bin != null){
				bin.close();
			}
		}
        
        return code;
	}
	
	/***********************************************/
	
	public static boolean isExists(String filePath) {
		
		File file = new File(filePath);
		return file.exists();
	}
	
	public static boolean isNotExists(String filePath) {
		
		return !isExists(filePath);
	}
	
	public static boolean isExists(File file) {
		
		return null != file && file.exists();
	}
	
	public static boolean isNotExists(File file) {
		
		return !isExists(file);
	}
	
	public static boolean isFile(String filePath) {
		
		File file = new File(filePath);
		return file.isFile();
	}
	
	public static boolean isNotFile(String filePath) {
		
		return !isFile(filePath);
	}
	
	public static boolean isFile(File file) {
		
		return null != file && file.isFile();
	}
	
	public static boolean isNotFile(File file) {
		
		return !isFile(file);
	}
	
	public static boolean isDir(String filePath) {
		
		File file = new File(filePath);
		return file.isDirectory();
	}
	
	public static boolean isNotDir(String filePath) {
		
		return !isDir(filePath);
	}
	
	public static boolean isDir(File file) {
		
		return null != file && file.isDirectory();
	}
	
	public static boolean isNotDir(File file) {
		
		return !isDir(file);
	}
	
	private FileUtil() {}
}