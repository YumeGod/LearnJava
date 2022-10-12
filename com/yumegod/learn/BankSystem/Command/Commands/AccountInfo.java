package com.yumegod.learn.BankSystem.Command.Commands;

import com.yumegod.learn.BankSystem.Command.Command;
import com.yumegod.learn.BankSystem.User;

public class AccountInfo extends Command {

    public AccountInfo() {
        super("AccountInfo");
    }

    @Override
    public void run(User user) {
        try{
            System.out.println("\n*******************************");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println("Balance: " + user.getBalance());
            System.out.println("*******************************\n");

            System.out.println("[Command] Execute success!");
        }catch (Exception e){
            System.out.println("[Command] Failed to execute");
        }
    }
}
