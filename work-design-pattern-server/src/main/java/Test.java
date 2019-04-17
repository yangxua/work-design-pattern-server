import context.Account;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 12:49
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Account acc = new Account("段誉", 0.0);
        acc.deposite(1000);
        acc.withdraw(2000);
        acc.deposite(3000);
        acc.withdraw(4000);
        acc.computeInterest();
    }
}