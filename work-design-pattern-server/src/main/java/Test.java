import factorymethod.factory.LoggerFactory;
import factorymethod.product.Logger;
import org.xml.sax.SAXException;
import utils.XMLUtil;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 12:49
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws SAXException, IllegalAccessException, IOException, InstantiationException, ParserConfigurationException, ClassNotFoundException {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory) XMLUtil.getChartType();
        logger = factory.createLogger();
        logger.writeLog();
    }
}