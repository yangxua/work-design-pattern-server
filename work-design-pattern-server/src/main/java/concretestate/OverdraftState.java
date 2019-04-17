package concretestate;

import context.Account;
import state.AccountState;

/**
 * @Auther: allanyang
 * @Date: 2019/4/16 21:34
 * @Description:
 */
public class OverdraftState extends AccountState {

    public OverdraftState(Account acc) {
        this.acc = acc;
    }

    public OverdraftState(AccountState state) {
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
        if (acc.getBalance() < -2000) {
            acc.setState(new RestrictedState(this));
        } else if (acc.getBalance() >= 0) {
            acc.setState(new NormalState(this));
        }
    }
}