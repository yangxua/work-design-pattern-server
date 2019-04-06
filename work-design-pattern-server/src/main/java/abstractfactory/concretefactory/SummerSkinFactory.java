package abstractfactory.concretefactory;

import abstractfactory.abstractfactory.SkinFactory;
import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ComboBox;
import abstractfactory.abstractproduct.TextField;
import abstractfactory.concreteproduct.SummerButton;
import abstractfactory.concreteproduct.SummerComboBox;
import abstractfactory.concreteproduct.SummerTextField;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 14:04
 * @Description:
 */
public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}