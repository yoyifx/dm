package cn.datawe.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ClassUtils;

/**
 * 重写SqlSessionFactory，使typeAliasesPackage支持通配符和正则
 * 
 * @author LiuJiaLe
 * 
 */
public class CustomSqlSessionFactory extends SqlSessionFactoryBean {

	private static final Log logger = LogFactory.getLog(CustomSqlSessionFactory.class);

	private static final String DEFAULT_RESOURCE_PATTERN = "**/*.class";

	@Override
	public void setTypeAliasesPackage(String typeAliasesPackage) {
		
		ResourcePatternResolver resolver = (ResourcePatternResolver) new PathMatchingResourcePatternResolver();
		MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(resolver);
		typeAliasesPackage = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
				+ ClassUtils.convertClassNameToResourcePath(typeAliasesPackage)
				+ "/"
				+ DEFAULT_RESOURCE_PATTERN;

		// 将加载多个绝对匹配的所有Resource
		// 将首先通过ClassLoader.getResource("META-INF")加载非模式路径部分
		// 然后进行遍历模式匹配
		try {
			
			List<String> result = new ArrayList<String>();
			Resource[] resources = resolver.getResources(typeAliasesPackage);
			if (resources != null && resources.length > 0) {
				
				MetadataReader metadataReader = null;
				for (Resource resource : resources) {
					
					if (resource.isReadable()) {
						
						metadataReader = metadataReaderFactory.getMetadataReader(resource);
						try {
							
							result.add(Class.forName(metadataReader.getClassMetadata().getClassName()).getPackage().getName());
						} catch (ClassNotFoundException e) {
							
							logger.error(e);
						}
					}
				}
			}
			if (result.size() > 0) {
				
				super.setTypeAliasesPackage(StringUtils.join(result.toArray(), ","));
			} else {
				
				logger.warn("参数typeAliasesPackage:" + typeAliasesPackage + "，未找到任何包");
			}
		} catch (IOException e) {
			
			logger.error(e);
		}
	}
}
