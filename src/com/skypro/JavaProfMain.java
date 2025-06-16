package com.skypro;

import com.skypro.account.Account;
import com.skypro.account.bonus.BonusAccount;
import com.skypro.account.credit.CreditAccount;

public class JavaProfMain {

    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");

        Account ivan = new CreditAccount("Ivan",100, -50);
        System.out.println(ivan);
        System.out.println("Приоритет " + ivan.priority);

        BonusAccount petr = new BonusAccount("Petr",70,150);
        System.out.println(petr);
        System.out.println("Приоритет " + petr.priority);

        Account[] accounts = {ivan,petr};
        for (Account acc: accounts) {
            acc.validateAccount();
        }

        ivan.getAllFunds();
        petr.getAllFunds();
    }

}
