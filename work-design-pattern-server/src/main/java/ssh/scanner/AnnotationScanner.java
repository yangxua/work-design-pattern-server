package ssh.scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import utils.StringUtil;

import java.lang.annotation.Annotation;
import java.util.*;

/**
 *
 * 注解扫描帮助类,必须在spring容器中注册扫描，并且ID要为annotationScanner
 *
 * @author ssh
 */
public class AnnotationScanner
{
    private static final Log logger = LogFactory.getLog(AnnotationScanner.class);

    private String basePackage;

    private Set<String> annotationPathList;

    private Set<MetadataReader> scanAnnotationClassSet;

    private Map<String, List<Class<?>>> annotationMap = new HashMap<String, List<Class<?>>>();

    /**
     * <pre>
     * 是否在spring容器中注册
     * </pre>
     * @param applicationContext
     * @return
     */
    public static boolean isExists(ApplicationContext applicationContext)
    {
        return applicationContext.containsBean("annotationScanner");
    }

    @SuppressWarnings("unchecked")
    public void init() throws ClassNotFoundException
    {
        ClassPathScanner classPathScanner = new ClassPathScanner();
        for (String annotation : annotationPathList)
        {
            logger.info("开始扫描系统注解{" + annotation + "}");
            if (StringUtil.isNotEmpty(annotation))
            {
                classPathScanner.addIncludeFilter(new AnnotationTypeFilter((Class<? extends Annotation>) Class.forName(annotation)));
            }
        }
        scanAnnotationClassSet = classPathScanner.findCandidateClasss(basePackage);
        for (MetadataReader metadataReader : scanAnnotationClassSet)
        {
            AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
            for (String name : annotationPathList)
            {
                if (annotationMetadata.hasAnnotation(name))
                {
                    List<Class<?>> list = annotationMap.get(name);
                    if (list == null)
                    {
                        list = new ArrayList<Class<?>>();
                        annotationMap.put(name, list);
                    }
                    list.add(Class.forName(metadataReader.getClassMetadata().getClassName()));
                }
            }
        }
    }

    public String getBasePackage()
    {
        return basePackage;
    }

    public void setBasePackage(String basePackage)
    {
        this.basePackage = basePackage;
    }

    public Set<String> getAnnotationPathList()
    {
        return annotationPathList;
    }

    public void setAnnotationPathList(Set<String> annotationPathList)
    {
        this.annotationPathList = annotationPathList;
    }

    public Map<String, List<Class<?>>> getAnnotationMap()
    {
        return annotationMap;
    }
}
