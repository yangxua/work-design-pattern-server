package simplefactory.concreteproduct;

import simplefactory.product.Chart;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:03
 * @Description: 饼状图产品类
 */
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("饼状折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}