package com.skypro.account.credit;

import com.skypro.account.Account;

public class CreditAccount extends Account {

    private int credit;

    public CreditAccount(String name, int balance, int credit) {
        super(name, balance);
        this.credit = credit;
    }

    @Override
    public void changeBalance(int amount) {
        if (balance + amount < credit) {
            throw new IllegalArgumentException("денег нет!");
        }
        this.balance = balance + amount;
    }

    @Override
    public void getAllFunds() {
        System.out.println("Аккаунт " + name + " может потратить " + (balance - credit));
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance + " и " + credit + " возможный кредит";
    }
}


