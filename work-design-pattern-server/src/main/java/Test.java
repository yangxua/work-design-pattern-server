import simplefactory.factory.ChartFactory;
import simplefactory.product.Chart;
import simplefactory.utils.XMLUtil;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 12:49
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart(XMLUtil.getChartType());
        chart.display();
    }
}