package simplefactory.factory;

import simplefactory.concreteproduct.HistogramChart;
import simplefactory.concreteproduct.LineChart;
import simplefactory.concreteproduct.PieChart;
import simplefactory.product.Chart;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:07
 * @Description: 图表工厂类
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equalsIgnoreCase(type)) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        } else if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        } else if ("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}