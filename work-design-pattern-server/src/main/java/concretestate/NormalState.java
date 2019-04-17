package concretestate;

import context.Account;
import state.AccountState;

/**
 * @Auther: allanyang
 * @Date: 2019/4/16 21:09
 * @Description:
 */
public class NormalState extends AccountState {

    public NormalState(Account acc) {
        this.acc = acc;
    }

    public NormalState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("正常状态，无须支付利息！");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > -2000 && acc.getBalance() <= 0) {
            acc.setState(new OverdraftState(this));
        } else if (acc.getBalance() == -2000) {
            acc.setState(new RestrictedState(this));
        } else {
            System.out.println("操作受限!");
        }
    }
}