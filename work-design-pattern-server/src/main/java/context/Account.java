package context;

import concretestate.NormalState;
import state.AccountState;

/**
 * @Auther: allanyang
 * @Date: 2019/4/16 21:04
 * @Description:
 */
public class Account {
    private AccountState state;
    private String owner;
    private double balance = 0;

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposite(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount);
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void computeInterest() {
        state.computeInterest();
    }
}