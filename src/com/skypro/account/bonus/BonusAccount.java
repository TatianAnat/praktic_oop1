package com.skypro.account.bonus;

import com.skypro.account.Account;

public class BonusAccount extends Account {

    private int bonuses;

    public BonusAccount(String name, int balance, int bonuses) {
        super(name,balance);
        this.bonuses = bonuses;
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance + " и " + bonuses + " бонусов";
    }
}
