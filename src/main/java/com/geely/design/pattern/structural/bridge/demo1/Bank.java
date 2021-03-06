package com.geely.design.pattern.structural.bridge.demo1;

/**
 * Created by geely
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
