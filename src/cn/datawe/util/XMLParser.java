package cn.datawe.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;

import cn.datawe.constant.CommonConstant;

/**
 * 工具类:XML解析器
 * 
 * @author LiuJiaLe
 *
 */
public class XMLParser {
	
	private static final Log logger = LogFactory.getLog(XMLParser.class);

	public static Map<Object, Object> parseXML(Object obj, String nodePath) throws DocumentException {
		
		if (isString(obj)) {
			
			LoggerUtil.debug(logger, "xml is String");
			return parseXML(obj.toString(), nodePath);
		} else if (isDom(obj)) {
			
			LoggerUtil.debug(logger, "xml is org.w3c.dom.Document");
			org.w3c.dom.Document dom = (org.w3c.dom.Document) obj;
			LoggerUtil.debug(logger, "org.w3c.dom.Document to org.dom4j.Document");
			return parseXML(toDom4j(dom), nodePath);
		}
		return null;
	}
	
	public static Map<Object, Object> parseXML(Document dom, String nodePath) throws DocumentException {
		
		if (null == dom) {
			
			return null;
		}
		return parseXML(dom.getStringValue(), nodePath);
	}
	
	public static Map<Object, Object> parseXML(String xml, String nodePath) throws DocumentException {
		
		if (ValidatorUtil.isEmptyIgnoreBlank(xml)) {
			
			return null;
		}
		LoggerUtil.debug(logger, "xml is String");
		Map<Object, Object> returnMap = new HashMap<Object, Object>();
		Map<Object, Object> dataMap = new LinkedHashMap<Object, Object>();
		
		//Document dom = DocumentHelper.parseText(xml);
		Element root = getRootElement(xml);
		dataMap.put(root.getName(), getElementMap(root));
		dataMap.put("xml", xml);
		returnMap.put(CommonConstant.RETURN_DATA, dataMap);
		return returnMap;
	}
	
	/**
	 * 解析XML
	 * 
	 * @param obj
	 * @return
	 * @throws DocumentException
	 */
	public static Map<Object, Object> parseXML(Object obj) throws DocumentException {
		
		if (isString(obj)) {
			
			LoggerUtil.debug(logger, "xml is String");
			return parseXML(obj.toString());
		} else if (isDom(obj)) {
			
			LoggerUtil.debug(logger, "xml is org.w3c.dom.Document");
			org.w3c.dom.Document dom = (org.w3c.dom.Document) obj;
			LoggerUtil.debug(logger, "org.w3c.dom.Document to org.dom4j.Document");
			return parseXML(toDom4j(dom));
		}
		return null;
	}
	
	/**
	 * 解析XML
	 * 
	 * @param dom
	 * @return
	 * @throws DocumentException
	 */
	public static Map<Object, Object> parseXML(Document dom) throws DocumentException {
		
		if (null == dom) {
			
			return null;
		}
		return parseXML(dom.getStringValue());
	}
	
	/**
	 * 解析XML格式的字符串(是否解压缩)
	 * 
	 * @param xml
	 * @param isDecompress
	 * @return
	 * @throws Exception 
	 */
	public static Map<Object, Object> parseXML(String xml, boolean isDecompress) throws Exception {
		
		if (isDecompress) {
			
			xml = CompressStringUtil.decompress(xml);
		}
		return parseXML(xml);
	}
	
	/**
	 * 解析XML
	 * 
	 * @param obj
	 * @return
	 * @throws DocumentException
	 */
	public static Map<Object, Object> parseXML2(Object obj) throws DocumentException {
		
		if (isString(obj)) {
			
			LoggerUtil.debug(logger, "xml is String");
			return parseXML2(obj.toString());
		} else if (isDom(obj)) {
			
			LoggerUtil.debug(logger, "xml is org.w3c.dom.Document");
			org.w3c.dom.Document dom = (org.w3c.dom.Document) obj;
			LoggerUtil.debug(logger, "org.w3c.dom.Document to org.dom4j.Document");
			return parseXML2(toDom4j(dom));
		}
		return null;
	}
	
	/**
	 * 解析XML
	 * 
	 * @param dom
	 * @return
	 * @throws DocumentException
	 */
	public static Map<Object, Object> parseXML2(Document dom) throws DocumentException {
		
		if (null == dom) {
			
			return null;
		}
		return parseXML2(dom.getStringValue());
	}
	
	/**
	 * 解析XML格式的字符串
	 * 
	 * @param xml
	 * @return
	 * @throws DocumentException
	 */
	public static Map<Object, Object> parseXML2(String xml) throws DocumentException {
		
		if (ValidatorUtil.isEmptyIgnoreBlank(xml)) {
			
			return null;
		}
		Map<Object, Object> resultMap = new HashMap<Object, Object>();
		Map<Object, Object> dataMap = new LinkedHashMap<Object, Object>();
		
		Element root = getRootElement(xml);
		dataMap.put(root.getName(), getElementMap(root));
		dataMap.put("xml", xml);
		resultMap.put(CommonConstant.RETURN_DATA, dataMap);
		return resultMap;
	}
	
	/**
	 * 解析XML格式的字符串(是否解压缩)
	 * 
	 * @param xml
	 * @param isDecompress
	 * @return
	 * @throws Exception 
	 */
	public static Map<Object, Object> parseXML2(String xml, boolean isDecompress) throws Exception {

		if (isDecompress) {
			
			xml = CompressStringUtil.decompress(xml);
		}
		return parseXML2(xml);
	}
	
	// 获取XML根元素
	private static Element getRootElement(String xml) throws DocumentException {
		
		if (ValidatorUtil.isEmptyIgnoreBlank(xml)) {
			
			return null;
		}
		Document dom = DocumentHelper.parseText(xml);
		return getRootElement(dom);
	}
	
	// 获取XML根元素
	private static Element getRootElement(Document dom) throws DocumentException {
		
		if (null == dom) {
			
			return null;
		}
		LoggerUtil.debug(logger, "-----------------------------------------XML Begin");
		LoggerUtil.debug(logger, dom.asXML());
		LoggerUtil.debug(logger, "-----------------------------------------XML End");
		Element elem = dom.getRootElement();
		return elem;
	}
	
	// 获取指定元素的特定属性(只适用于信用报告类XML)
	private static Map<Object, Object> getAttributeMap(Element element) {
		
		if (null == element) {
			
			return null;
		}
		Map<Object, Object> resultMap = new LinkedHashMap<Object, Object>();
		Iterator<?> it = element.attributeIterator();
		Attribute attr = null;
		while (it.hasNext()) {
			
			attr = (Attribute) it.next();
			resultMap.put(attr.getName(), attr.getText());
		}
		return resultMap;
	}
	
	// 递归遍历整个XML(所有元素及属性)(只适用于信用报告类XML)
	@SuppressWarnings("unchecked")
	private static Map<Object, Object> getElementMap(Element element) {
		
		if (null == element) {
			
			return null;
		}
		Map<Object, Object> resultMap = new LinkedHashMap<Object, Object>();
		List<Element> elementList = element.elements();
		int len = (null == elementList) ? 0 : elementList.size();
		Object obj = null;
		Element elem = null;
		Map<Object, Object> map = null;
		String elemName = null;
		String elemPath = null;
		String elemText = null;
		if (element.attributeCount() > 0) {
			
			resultMap.put("attrMap", getAttributeMap(element));
		}
		if (len > 0) {
			
			for (int i=0; i<len; i++) {
				
				elem = elementList.get(i);
				elemName = elem.getName();
				elemPath = elem.getUniquePath();
				elemText = elem.getTextTrim();
				if (elem.elements().size() > 0) {
					
					map = getElementMap(elem);
					obj = resultMap.get(elemName);
					if (null == obj) {
						
						resultMap.put(elemName, getResult(elemName, map));
					} else {
						
						resultMap.put(elemName, getResultList(obj, map));
					}
				} else {
					
					obj = resultMap.get(elemName);
					if (null == obj) {
						
						resultMap.put(elemName, getResult(elem));
					} else {
						
						resultMap.put(elemName, getResultList(obj, elem.getTextTrim()));
					}
				}
			}
		} else {
			
			resultMap.put(element.getName(), element.getTextTrim());
		}
		return resultMap;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Object getResult(Element element) {
		
		String value = element.getTextTrim();
		if ("item".equals(element.getName())) {
			
			List list = new ArrayList();
			list.add(value);
			return list;
		}
		if (element.attributeCount()>0 && ValidatorUtil.isEmptyIgnoreBlank(value)) {
			
			Map map = new HashMap();
			map.put("attrMap", getAttributeMap(element));
			return map;
		}
		return value;
	}
	
	// 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Object getResult(String name, Object value) {
		
		if ("item".equals(name)) {
			
			List list = new ArrayList();
			list.add(value);
			return list;
		}
		return value;
	}
	
	// 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static List getResultList(Object obj, Object value) {
		
		List resultList = null;
		if ("java.util.ArrayList".equals(obj.getClass().getName())) {
			
			resultList = (List) obj;
			resultList.add(value);
		} else {
			
			resultList = new ArrayList();
			resultList.add(obj);
			resultList.add(value);
		}
		return resultList;
	}
	
	/**
	 * 将org.w3c.dom.Document转换为org.dom4j.Document
	 * 
	 * @param dom
	 * @return
	 */
	public static Document toDom4j(org.w3c.dom.Document dom) {
		
		if (null == dom) {
			
			return null;
		}
		return new DOMReader().read(dom);
	}
	
	/**
	 * 将XML格式的字符串转换为Map(必须保证有根节点)
	 * 
	 * @param xml
	 * @return
	 * @throws DocumentException
	 */
	@SuppressWarnings("rawtypes")
	public static Map toMap(String xml) throws DocumentException {
		
		if (ValidatorUtil.isEmptyIgnoreBlank(xml)) {
			
			return null;
		}
		return toMap(getRootElement(xml));
	}
	
	/**
	 * 将XML中的节点转换为Map
	 * 
	 * @param element
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map toMap(Element element) {
		
		if (null == element) {
			
			return null;
		}
		Map map = new LinkedHashMap();
		List list = element.elements();
		int size = list.size();
		if (size > 0) {
			
			for (int i=0; i<size; i++) {
				
				Element tmpElement = (Element) list.get(i);
				List tmpList = new ArrayList();
				
				if (tmpElement.elements().size() > 0) {
					
					Map tmpMap = toMap(tmpElement);
					if (null == map.get(tmpElement.getName())) {
						
						map.put(tmpElement.getName(), tmpMap);
					} else {
						
						Object obj = map.get(tmpElement.getName());
						if (isArrayList(obj)) {
							
							tmpList = (List) obj;
							tmpList.add(tmpMap);
						} else {
							
							tmpList = new ArrayList();
							tmpList.add(obj);
							tmpList.add(tmpMap);
						}
						map.put(tmpElement.getName(), tmpList);
					}
				} else {
					
					if (null == map.get(tmpElement.getName())) {
						
						map.put(tmpElement.getName(), tmpElement.getTextTrim());
					} else {
						
						Object obj = map.get(tmpElement.getName());
						if (isArrayList(obj)) {
							
							tmpList = (List) obj;
							tmpList.add(tmpElement.getTextTrim());
						} else {
							
							tmpList = new ArrayList();
							tmpList.add(obj);
							tmpList.add(tmpElement.getTextTrim());
						}
						map.put(tmpElement.getName(), tmpList);
					}
				}
			}
		} else {
			
			map.put(element.getName(), element.getTextTrim());
		}
		return map;
	}
	
	// 判断对象是否为ArrayList
	private static boolean isArrayList(Object obj) {
		
		return null == obj ? false : ArrayList.class.isAssignableFrom(obj.getClass());
	}
	
	// 判断对象是否为字符串
	private static boolean isString(Object obj) {
		
		return null == obj ? false : String.class.isAssignableFrom(obj.getClass());
	}
	
	// 判断对象是否为org.w3c.dom.Document
	private static boolean isDom(Object obj) {
		
		return null == obj ? false : org.w3c.dom.Document.class.isAssignableFrom(obj.getClass());
	}
}
