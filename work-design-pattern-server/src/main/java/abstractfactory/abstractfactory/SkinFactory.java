package abstractfactory.abstractfactory;

import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ComboBox;
import abstractfactory.abstractproduct.TextField;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 14:02
 * @Description:
 */
public interface SkinFactory {

    Button createButton();
    ComboBox createComboBox();
    TextField createTextField();
}