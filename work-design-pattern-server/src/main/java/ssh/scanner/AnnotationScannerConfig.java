package ssh.scanner;

/**
 * Created by ssh on 2017/3/7.
 * 此类等同于在spring配置中指定初始化项
 */

//@Configuration
//@Slf4j
//@Lazy(value = false)
//public class AnnotationScannerConfig {
//    @Bean
//    public AnnotationScanner getAnnotationScanner(){
//
//        Set<String> annotationPathList = new HashSet<String>();
//        annotationPathList.add("com.fenqile.work.common.event.annotation.Listener");
//
//        AnnotationScanner scanner = new AnnotationScanner();
//
//        scanner.setBasePackage("com.fenqile.work.trade");
//        scanner.setAnnotationPathList(annotationPathList);
//
//        try {
//            scanner.init();
//        } catch (Exception e) {
//            log.info("AnnotationScanner init fail, exception:{}", e.getMessage());
//            return null;
//        }
//
//        return scanner;
//    }
//}

public class AnnotationScannerConfig {

}

