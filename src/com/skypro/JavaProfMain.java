package com.skypro;

import com.skypro.account.Account;
import com.skypro.account.bonus.BonusAccount;

public class JavaProfMain {

    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");

        Account ivan = new Account("Ivan",100);
        System.out.println(ivan);
        //ivan.diskription();
        Account.diskription();
        System.out.println("Приоритет " + ivan.priority);

        BonusAccount petr = new BonusAccount("Petr",70,150);
        System.out.println(petr);
        //petr.diskription();
        BonusAccount.diskription();
        System.out.println("Приоритет " + petr.priority);

        Account[] accounts = {ivan,petr};
        for (Account acc: accounts) {
            acc.changeBalance(10);
        }

        System.out.println(ivan);
        System.out.println(petr);
    }

}
