package simplefactory.concreteproduct;

import simplefactory.product.Chart;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:03
 * @Description: 柱状图产品类
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}