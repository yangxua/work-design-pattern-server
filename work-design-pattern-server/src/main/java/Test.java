import abstractfactory.abstractfactory.SkinFactory;
import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ComboBox;
import abstractfactory.abstractproduct.TextField;
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
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory)XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}