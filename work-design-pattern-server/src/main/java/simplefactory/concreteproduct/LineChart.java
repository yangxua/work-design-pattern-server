package simplefactory.concreteproduct;

import simplefactory.product.Chart;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:04
 * @Description: 折线图产品类
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}