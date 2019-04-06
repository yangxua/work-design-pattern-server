package abstractfactory.concretefactory;

import abstractfactory.abstractfactory.SkinFactory;
import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ComboBox;
import abstractfactory.abstractproduct.TextField;
import abstractfactory.concreteproduct.SpringButton;
import abstractfactory.concreteproduct.SpringComboBox;
import abstractfactory.concreteproduct.SpringTextField;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 14:04
 * @Description:
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}