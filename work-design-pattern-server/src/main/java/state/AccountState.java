package state;

import context.Account;

/**
 * @Auther: allanyang
 * @Date: 2019/4/16 21:05
 * @Description:
 */
public abstract class AccountState {
    public Account acc;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}