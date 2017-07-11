package cn.datawe.util;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 工具类:集合
 * 
 * @author LiuJiaLe
 * 
 */
public final class CollectionUtil {

	/** 覆盖已存在的值 */
	public static final int COVER_VALUE = 1;

	/** 不覆盖已存在的值 */
	public static final int NOT_COVER_VALUE = 2;

	/** 与已存在值合并成数组 */
	public static final int MERGE_VALUE_TO_ARRAY = 3;

	/**
	 * 获取(嵌套)Map中指定Key对应的Value
	 * 
	 * @param map
	 * @param keys
	 * @return
	 */
	public static String getValue(Map<Object, Object> map, String... keys) {

		Object obj = getResult(map, keys);
		return null == obj ? null : String.valueOf(obj);
	}

	/**
	 * 获取List中的第一个(嵌套)Map中指定Key对应的Value
	 * 
	 * @param list
	 * @param keys
	 * @return
	 */
	public static String getValue(List<Map<Object, Object>> list, String... keys) {

		Object obj = getResult(list, keys);
		return null == obj ? null : String.valueOf(obj);
	}

	/**
	 * 获取所有Map中指定Key对应的Value
	 * 
	 * @param list
	 * @param key
	 * @return
	 */
	public static List<Object> getValueList(List<Map<Object, Object>> list, String key) {

		List<Object> resultList = null;
		if (ValidatorUtil.isNotEmpty(list) && ValidatorUtil.isNotEmptyIgnoreBlank(key)) {

			resultList = new ArrayList<Object>();
			for (Map<Object, Object> map : list) {

				resultList.add(map.get(key));
			}
		}
		return resultList;
	}

	/**
	 * 获取集合类对象中指定Key对应的结果
	 * 
	 * @param obj
	 * @param keys
	 * @return
	 */
	public static Object getResult(Object obj, String... keys) {

		return getResult(toMap(obj), keys);
	}

	/**
	 * 获取(嵌套)Map中指定Key对应的结果
	 * 
	 * @param map
	 * @param keys
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Object getResult(Map<Object, Object> map, String... keys) {

		if (ValidatorUtil.isNotEmpty(map) && ValidatorUtil.isNotAllEmpty(keys)) {

			Map<Object, Object> resultMap = map;
			Map<Object, Object> tmpMap = null;
			String key = null;
			int len = keys.length;
			for (int i = 0; i < len; i++) {

				key = keys[i];
				if (i != (len - 1) && ValidatorUtil.isMap(resultMap.get(key))) {

					tmpMap = (Map<Object, Object>) resultMap.get(key);
					resultMap = tmpMap;
					continue;
				}
				return resultMap.get(key);
			}
		}
		return null;
	}

	/**
	 * 获取List中的第一个(嵌套)Map中指定Key对应的结果
	 * 
	 * @param list
	 * @param keys
	 * @return
	 */
	public static Object getResult(List<Map<Object, Object>> list, String... keys) {

		if (ValidatorUtil.isNotEmpty(list) && ValidatorUtil.isNotAllEmpty(keys)) {

			getResult(list.get(0), keys);
		}
		return ValidatorUtil.isNotEmpty(list) && ValidatorUtil.isNotAllEmpty(keys) ? getResult(list.get(0), keys) : null;
	}

	/**
	 * 获取集合类对象中指定Key对应的结果，并将结果转换为List&lt;Map&gt;
	 * 
	 * @param obj
	 * @param keys
	 * @return
	 */
	public static List<Map<Object, Object>> getResultAndToList(Object obj, String... keys) {

		return toList(getResult(obj, keys));
	}

	/**
	 * 获取(嵌套)Map中指定Key对应的结果，并将结果转换为List&lt;Map&gt;
	 * 
	 * @param map
	 * @param keys
	 * @return
	 */
	public static List<Map<Object, Object>> getResultAndToList(Map<Object, Object> map, String... keys) {

		return toList(getResult(map, keys));
	}

	/**
	 * 获取集合类对象中指定Key对应的结果，并将结果转换为Map
	 * 
	 * @param obj
	 * @param keys
	 * @return
	 */
	public static Map<Object, Object> getResultAndToMap(Object obj, String... keys) {

		return toMap(getResult(toMap(obj), keys));
	}

	/**
	 * 获取(嵌套)Map中指定Key对应的结果，并将结果转换为Map
	 * 
	 * @param map
	 * @param keys
	 * @return
	 */
	public static Map<Object, Object> getResultAndToMap(Map<Object, Object> map, String... keys) {

		return toMap(getResult(map, keys));
	}

	/**
	 * 将Map中的Key转换为List
	 * 
	 * @param map
	 * @return
	 */
	public static List<Object> keyToList(Map<Object, Object> map) {

		return new ArrayList<Object>(map.keySet());
	}

	/**
	 * 将Map中的Value转换为List
	 * 
	 * @param map
	 * @return
	 */
	public static List<Object> valueToList(Map<Object, Object> map) {

		return new ArrayList<Object>(map.values());
	}

	/**
	 * 将集合类对象转换为List
	 * 
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<Map<Object, Object>> toList(Object obj) {

		List<Map<Object, Object>> list = null;
		if (ValidatorUtil.isMap(obj)) {

			list = new ArrayList<Map<Object, Object>>();
			list.add((Map<Object, Object>) obj);
		} else if (ValidatorUtil.isList(obj)) {

			list = (List<Map<Object, Object>>) obj;
		}
		return list;
	}

	/**
	 * 将集合类对象转换为Map
	 * 
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<Object, Object> toMap(Object obj) {

		Map<Object, Object> map = null;
		if (ValidatorUtil.isMap(obj)) {

			map = (Map<Object, Object>) obj;
		} else if (ValidatorUtil.isList(obj)) {

			List<Map<Object, Object>> list = (List<Map<Object, Object>>) obj;
			if (ValidatorUtil.isNotEmpty(list)) {

				map = list.get(0);
			}
		}
		return map;
	}

	/**
	 * 将List转换为Map
	 * 
	 * @param list
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<Object, Object> toMap(List<Map<Object, Object>> list, String name) {

		Map<Object, Object> resultMap = new HashMap<Object, Object>(list.size());
		List<Map<Object, Object>> tmpList = null;
		String key = null;
		for (Map<Object, Object> map : list) {

			key = String.valueOf(map.get(name));
			tmpList = (List<Map<Object, Object>>) resultMap.get(key);
			if (null == tmpList) {

				tmpList = new ArrayList<Map<Object, Object>>();
				resultMap.put(key, tmpList);
			}
			tmpList.add(map);
		}
		return resultMap;
	}

	/**
	 * 重命名Map的key
	 * 
	 * @param map
	 * @param oldKey
	 * @param newKey
	 * @return
	 */
	public static Map<Object, Object> rename(Map<Object, Object> map, String oldKey, String newKey) {

		if (map.containsKey(oldKey)) {

			Object obj = map.get(oldKey);
			map.remove(oldKey);
			map.put(newKey, obj);
		}
		return map;
	}

	/**
	 * 重命名List中Map的key
	 * 
	 * @param list
	 * @param oldKey
	 * @param newKey
	 * @return
	 */
	public static List<Map<Object, Object>> rename(List<Map<Object, Object>> list, String oldKey, String newKey) {

		List<Map<Object, Object>> resultList = new ArrayList<Map<Object, Object>>();
		for (Map<Object, Object> map : list) {

			resultList.add(rename(map, oldKey, newKey));
		}
		return resultList;
	}

	/**
	 * 数组内元素内容升序排列(汉字的拼音字母排序)
	 * 
	 * @param array
	 */
	public static void sortASC(String[] array) {

		Comparator<Object> comparator = Collator.getInstance(java.util.Locale.CHINA);
		Arrays.sort(array, comparator);
	}

	/**
	 * 数组内元素内容降序排列(汉字的拼音字母排序)
	 * 
	 * @param array
	 */
	public static void sortDESC(String[] array) {

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {

				Collator collator = Collator.getInstance(java.util.Locale.CHINA);
				return collator.getCollationKey(str2).compareTo(collator.getCollationKey(str1));
			}
		};
		Arrays.sort(array, comparator);
	}

	/**
	 * 根据List中的元素内容升序排列(汉字的拼音字母排序)
	 * 
	 * @param list
	 */
	public static void sortASC(List<String> list) {

		Comparator<Object> comparator = Collator.getInstance(java.util.Locale.CHINA);
		Collections.sort(list, comparator);
	}

	/**
	 * 根据List中的元素内容降序排列(汉字的拼音字母排序)
	 * 
	 * @param list
	 */
	public static void sortDESC(List<String> list) {

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {

				Collator collator = Collator.getInstance(java.util.Locale.CHINA);
				return collator.getCollationKey(str2).compareTo(collator.getCollationKey(str1));
			}
		};
		Collections.sort(list, comparator);
	}

	/**
	 * 根据List中的指定字段内容升序排列(数值大小排序)
	 * 
	 * @param list
	 * @param key
	 */
	public static void sortASC(List<Map<Object, Object>> list, final String key) {

		Collections.sort(list, new Comparator<Map<Object, Object>>() {
			@Override
			public int compare(Map<Object, Object> map1, Map<Object, Object> map2) {

				BigDecimal v1 = new BigDecimal(map1.get(key).toString());
				BigDecimal v2 = new BigDecimal(map2.get(key).toString());
				return v1.compareTo(v2);
			}
		});
	}

	/**
	 * 根据List中的指定字段内容降序排列(数值大小排序)
	 * 
	 * @param list
	 * @param key
	 */
	public static void sortDESC(List<Map<Object, Object>> list, final String key) {

		Collections.sort(list, new Comparator<Map<Object, Object>>() {
			@Override
			public int compare(Map<Object, Object> map1, Map<Object, Object> map2) {

				BigDecimal v1 = new BigDecimal(map1.get(key).toString());
				BigDecimal v2 = new BigDecimal(map2.get(key).toString());
				return v2.compareTo(v1);
			}
		});
	}

	/**
	 * 根据List中的指定日期字段内容升序排列(数值大小排序)
	 * @param list
	 * @param key
	 * @param format
	 */
	public static void sortByDateASC(List<Map<Object, Object>> list, final String key, final String format) {

		Collections.sort(list, new Comparator<Map<Object, Object>>() {
			@Override
			public int compare(Map<Object, Object> map1, Map<Object, Object> map2) {
				
				Long v1 = DateUtil.toMilliseconds(map1.get(key).toString(), format);
				Long v2 = DateUtil.toMilliseconds(map2.get(key).toString(), format);
				return v1.compareTo(v2);
			}
		});
	}
	
	/**
	 * 根据List中的指定日期字段内容升序排列(数值大小排序)
	 * @param list
	 * @param key
	 * @param format
	 */
	public static void sortByDateDESC(List<Map<Object, Object>> list, final String key, final String format) {

		Collections.sort(list, new Comparator<Map<Object, Object>>() {
			@Override
			public int compare(Map<Object, Object> map1, Map<Object, Object> map2) {
				
				Long v1 = DateUtil.toMilliseconds(map1.get(key).toString(), format);
				Long v2 = DateUtil.toMilliseconds(map2.get(key).toString(), format);
				return v2.compareTo(v1);
			}
		});
	}
	
	/**
	 * map中Value升序
	 * 
	 * @param <K>
	 * @param <V>
	 * @param map
	 * @return
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueASC(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	/**
	 * 获取List中的指定字段内容升序排列后的第一条数据
	 * 
	 * @param list
	 * @param key
	 * @return
	 */
	public static Map<Object, Object> getFirstASC(List<Map<Object, Object>> list, final String key) {

		sortASC(list, key);
		return list.get(0);
	}

	/**
	 * 获取List中的指定字段内容降序排列后的第一条数据
	 * 
	 * @param list
	 * @param key
	 * @return
	 */
	public static Map<Object, Object> getFirstDESC(List<Map<Object, Object>> list, final String key) {

		sortDESC(list, key);
		return list.get(0);
	}

	/**
	 * 获取指定范围内的List
	 * 
	 * @param list
	 * @param max
	 * @return
	 */
	public static List<Map<Object, Object>> getSubList(List<Map<Object, Object>> list, int max) {

		if (null == list || max < 1 || list.size() < max) {

			return list;
		}
		return list.subList(0, max);
	}

	/**
	 * 获取指定范围内的List
	 * 
	 * @param list
	 * @param max
	 * @param defaultMax
	 * @return
	 */
	public static List<Map<Object, Object>> getSubList(List<Map<Object, Object>> list, int max, int defaultMax) {

		if (ValidatorUtil.isEmpty(list) || defaultMax < 1 || max <= defaultMax) {

			return list;
		}
		int size = list.size();
		return size >= max ? list.subList(0, max) : size >= defaultMax ? list.subList(0, defaultMax) : list;
	}

	/**
	 * 获取List中的第一个元素
	 * 
	 * @param list
	 * @return
	 */
	public static Object getFirst(List<?> list) {

		return getFirst(list, null);
	}

	/**
	 * 获取List中的第一个元素(如果第一个元素为空，则返回默认值)
	 * 
	 * @param list
	 * @param defaultValue
	 * @return
	 */
	public static Object getFirst(List<?> list, Object defaultValue) {

		return null == list || list.size() < 1 ? defaultValue : list.get(0);
	}

	/**
	 * 获取List中的最后一个元素
	 * 
	 * @param list
	 * @return
	 */
	public static Object getLast(List<?> list) {

		return getLast(list, null);
	}

	/**
	 * 获取List中的最后一个元素(如果最后一个元素为空，则返回默认值)
	 * 
	 * @param list
	 * @param defaultValue
	 * @return
	 */
	public static Object getLast(List<?> list, Object defaultValue) {

		return null == list || list.size() < 1 ? defaultValue : list.get(list.size() - 1);
	}

	/**
	 * 合并多个字符串
	 * 
	 * @param array
	 * @return
	 */
	public static String mergeToString(String... args) {

		StringBuilder sb = new StringBuilder();
		for (String str : args) {

			sb.append(str);
		}
		return sb.toString();
	}

	/**
	 * 合并多个Map(覆盖已存在的值)
	 * 
	 * @param maps
	 * @return
	 */
	public static Map<Object, Object> mergeToMap(Map<Object, Object>... maps) {

		return mergeToMap(COVER_VALUE, maps);
	}

	/**
	 * 合并多个Map(1:覆盖已存在的值, 2:不覆盖已存在的值, 3:与已存在值合并成数组)
	 * 
	 * @param type
	 * @param maps
	 * @return
	 */
	public static Map<Object, Object> mergeToMap(int type, Map<Object, Object>... maps) {

		if (ValidatorUtil.isAllEmpty(maps) || (type != COVER_VALUE && type != NOT_COVER_VALUE && type != MERGE_VALUE_TO_ARRAY)) {

			return null;
		}
		if (maps.length == 1) {

			return maps[0];
		}
		Map<Object, Object> resultMap = new HashMap<Object, Object>();
		Object key = null;
		Object value = null;
		for (Map<Object, Object> map : maps) {

			if (ValidatorUtil.isEmpty(map)) {

				continue;
			}
			if (type == COVER_VALUE) {

				resultMap.putAll(map);
			} else {

				for (Map.Entry<Object, Object> entry : map.entrySet()) {

					key = entry.getKey();
					value = entry.getValue();
					if (resultMap.containsKey(key)) {

						if (type == NOT_COVER_VALUE) {

							continue;
						}
						if (type == MERGE_VALUE_TO_ARRAY) {

							value = new Object[] { resultMap.get(key), entry.getValue() };
						}
					}
					resultMap.put(key, value);
				}
			}
		}
		return resultMap;
	}

	/**
	 * 合并多个Map
	 * 
	 * @param maps
	 * @return
	 */
	public static List<Map<Object, Object>> mergeToList(Map<Object, Object>... maps) {

		if (ValidatorUtil.isAllEmpty(maps)) {

			return null;
		}
		List<Map<Object, Object>> resultList = new ArrayList<Map<Object, Object>>();
		for (Map<Object, Object> map : maps) {

			if (ValidatorUtil.isNotEmpty(map)) {

				resultList.add(map);
			}
		}
		return resultList;
	}

	/**
	 * 合并多个List(去重复)
	 * 
	 * @param lists
	 * @return
	 */
	public static List<Map<Object, Object>> mergeToList(List<Map<Object, Object>>... lists) {

		return mergeToList(true, lists);// 默认去重复
	}

	/**
	 * 合并多个List(可选择是否去重复)
	 * 
	 * @param flag
	 * @param lists
	 * @return
	 */
	public static List<Map<Object, Object>> mergeToList(boolean flag, List<Map<Object, Object>>... lists) {

		if (ValidatorUtil.isAllEmpty(lists)) {

			return null;
		}
		if (lists.length == 1) {

			return lists[0];
		}
		List<Map<Object, Object>> resultList = new ArrayList<Map<Object, Object>>();
		for (List<Map<Object, Object>> list : lists) {

			if (ValidatorUtil.isNotEmpty(list)) {

				if (flag) {// 是否去重复

					resultList.removeAll(list);
				}
				resultList.addAll(list);
			}
		}
		return resultList;
	}

	/**
	 * 统计数组元素重复次数
	 * 
	 * @param <T>
	 * @param t
	 * @return
	 */
	public static <T> String statFrequency(T... t) {

		List<T> list = new ArrayList<T>();
		list.addAll(Arrays.asList(t));

		Set<T> set = new HashSet<T>(list);
		for (T tmp : set) {

			System.out.println(tmp + ": " + Collections.frequency(list, tmp));
		}
		return null;
	}
	
	/**
	 * List去重
	 * 
	 * @param <T>
	 * @param list
	 * @return
	 */
	public static <T> List<T> removeRepeat(List<T> list) {
		
		List<T> result = list;
		Set<T> set = new HashSet<T>(result);
		result.clear();
		result.addAll(set);
		return result;
	}
	
	/**
	 * 合并数组
	 * */
	@SuppressWarnings("unchecked")
	public static <T> T[] concat(T[] a, T[] b) {  
	    final int alen = a.length;  
	    final int blen = b.length;  
	    if (alen == 0) {  
	        return b;  
	    }  
	    if (blen == 0) {  
	        return a;  
	    }  
	    final T[] result = (T[]) Array.newInstance(a.getClass().getComponentType(), alen + blen);  
	    System.arraycopy(a, 0, result, 0, alen);  
	    System.arraycopy(b, 0, result, alen, blen);  
	    return result;  
	} 

	private CollectionUtil() {
	}

}