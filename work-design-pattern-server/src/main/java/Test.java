import adaptor.target.ScoreOperation;
import utils.XMLUtil;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 12:49
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ScoreOperation operation;
        operation = (ScoreOperation) XMLUtil.getBean();
        int[] scores = {10,20,30,50,40,100,90,92};
        int[] res ;

        res = operation.sort(scores);
        for (int i : res) {
            System.out.print(i + ",");
        }

        System.out.println();

        int search = operation.search(scores, 55);
        if (search != -1) {
            System.out.println("ok");
        } else {
            System.out.println("nono");
        }

        int search1 = operation.search(scores, 90);
        if (search1 != -1 ) {
            System.out.println("ok");
        } else {
            System.out.println("nono");
        }
    }
}