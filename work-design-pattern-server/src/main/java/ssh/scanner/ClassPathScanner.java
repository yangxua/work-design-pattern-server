package ssh.scanner;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.util.ClassUtils;
import org.springframework.util.SystemPropertyUtils;

import java.io.IOException;
import java.util.*;

/**
 *
 * class类扫描帮助类
 *
 * @author ssh
 */
public class ClassPathScanner
{
    private static final Log logger = LogFactory.getLog(ClassPathScanner.class);

    private static final String DEFAULT_RESOURCE_PATTERN = "**/*.class";

    /**
     * ResourcePatternResolver 扩展 ResourceLoader接口,ResourceLoader可以根据一个资源地址来加载文件 DefaultResourceLoader
     * 是spring为ResourceLoader提供的实现 资源地址仅仅支持带资源类型前缀的表达式(classpath:com/goodluck/common/text.xml),不支持ant风格的表达式
     * ResourcePatternResolver 可以支持ant风格的表达式(classpath:com/goodluck/common/*.xml) PathMatchingResourcePatternResolver
     * 是spring为ResourcePatternResolver提供的标准实现
     */
    private ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

    private MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(
            this.resourcePatternResolver);

    private final List<TypeFilter> includeFilters = new LinkedList<TypeFilter>();

    private final List<TypeFilter> excludeFilters = new LinkedList<TypeFilter>();

    public void addIncludeFilter(TypeFilter includeFilter)
    {
        this.includeFilters.add(includeFilter);
    }

    public void addExcludeFilter(TypeFilter excludeFilter)
    {
        this.excludeFilters.add(0, excludeFilter);
    }

    public void resetFilters()
    {
        this.includeFilters.clear();
        this.excludeFilters.clear();
    }

    protected boolean isCandidateComponent(MetadataReader metadataReader) throws IOException
    {
        for (TypeFilter tf : this.excludeFilters)
        {
            if (tf.match(metadataReader, this.metadataReaderFactory))
            {
                return false;
            }
        }
        for (TypeFilter tf : this.includeFilters)
        {
            if (tf.match(metadataReader, this.metadataReaderFactory))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * <pre>
     * 扫描basePackage包下的所有class文件
     * </pre>
     * @param basePackage
     * @return
     */
    public List<Resource> findResources(String basePackage)
    {
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
                + ClassUtils.convertClassNameToResourcePath(SystemPropertyUtils.resolvePlaceholders(basePackage)) + "/"
                + DEFAULT_RESOURCE_PATTERN;
        try
        {
            Resource[] resources = resourcePatternResolver.getResources(packageSearchPath);
            return Arrays.asList(resources);
        }
        catch (IOException e)
        {
            logger.error(e);
            //throw new Exception("扫描类路径异常", e);
        }

        return null;
    }

    public Set<MetadataReader> findCandidateClasss(String basePackage)
    {
        Set<MetadataReader> candidates = new LinkedHashSet<MetadataReader>();
        List<Resource> resources = findResources(basePackage);
        for (Resource resource : resources)
        {
            if (resource.isReadable())
            {
                try
                {
                    MetadataReader metadataReader = this.metadataReaderFactory.getMetadataReader(resource);
                    if (isCandidateComponent(metadataReader))
                    {
                        candidates.add(metadataReader);
                        logger.info("扫描类路径{" + metadataReader.getClassMetadata().getClassName() + "}成功");
                    }
                }
                catch (IOException e)
                {
                    logger.error(e);
                    //throw new SystemException("扫描类路径异常", e);
                }
            }
        }
        return candidates;
    }

    /*
    public static void main(String[] args)
    {
        // ClassPathScaner scanner = new ClassPathScaner();
        // Set<MetadataReader> result = scanner.findCandidateClasss("com.lottery.common.event");
        System.out.println("success");
    }
    */
}

