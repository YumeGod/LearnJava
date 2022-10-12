package com.yumegod.learn.BankSystem.Command.Commands;

import com.yumegod.learn.BankSystem.BankSystem;
import com.yumegod.learn.BankSystem.Command.Command;
import com.yumegod.learn.BankSystem.User;

public class AddBalance extends Command {

    public AddBalance() {
        super("AddBalance");
    }

    @Override
    public void run(User user) {
        try{
            System.out.println("[Command] Please enter the amount of money you want to add:");
            long amountMoney = Long.parseLong(BankSystem.in.nextLine());

            System.out.println("\n*******************************");
            System.out.println(user.getUsername() + "'s current balance: " + user.getBalance());
            user.setBalance(user.getBalance() + amountMoney);
            System.out.println(user.getUsername() + "'s new balance: " + user.getBalance());
            System.out.println("*******************************\n");

            System.out.println("[Command] Execute success!");
        }catch (Exception e){
            System.out.println("[Command] Failed to execute");
        }
    }
}
