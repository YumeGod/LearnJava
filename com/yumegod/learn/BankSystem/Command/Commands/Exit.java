package com.yumegod.learn.BankSystem.Command.Commands;

import com.yumegod.learn.BankSystem.Command.Command;
import com.yumegod.learn.BankSystem.User;

public class Exit extends Command {

    public Exit() {
        super("Exit");
    }

    @Override
    public void run(User user) {
        System.out.println("\n*******************************");
        System.out.println("GoodBye, " + user.getUsername());
        System.out.println("*******************************\n");
        System.exit(-1);
    }
}