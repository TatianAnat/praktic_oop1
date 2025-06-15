package com.skypro.account.bonus;

import com.skypro.account.Account;

public class BonusAccount extends Account {

    private int bonuses;

    public int priority = 10;

    public BonusAccount(String name, int balance, int bonuses) {
        super(name,balance);
        this.bonuses = bonuses;
    }
 // переопределяем родительский метод сколько денег потратил, столько бонусов получил

    @Override
    public void changeBalance(int amount) {
        super.changeBalance(amount);
        bonuses = bonuses - amount;
    }

    public static void diskription() {
        System.out.println("Банусный аккаунт");
    }

    @Override
    public void getAllFunds() {
        System.out.println("Аккаунт " + name + " может потратить " + (balance +  bonuses));
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance + " и " + bonuses + " бонусов";
    }
}
