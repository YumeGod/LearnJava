package com.yumegod.learn.BankSystem.Command.Commands;

import com.yumegod.learn.BankSystem.BankSystem;
import com.yumegod.learn.BankSystem.Command.Command;
import com.yumegod.learn.BankSystem.User;

public class ChangeUsername extends Command {

    public ChangeUsername() {
        super("ChangeUsername");
    }

    @Override
    public void run(User user) {
        try{
            System.out.println("[Command] Please enter your new username:");
            String newUsername = BankSystem.in.nextLine();
            String oldUsername = user.getUsername();

            System.out.println("[Command] Please confirm your new username:");
            if (newUsername.equals(BankSystem.in.nextLine())) {
                user.setUsername(newUsername);

                System.out.println("\n*******************************");
                System.out.println(oldUsername + "'s new username: " + user.getUsername());
                System.out.println("*******************************\n");

                System.out.println("[Command] Execute success!");
            } else {
                System.out.println("[Command] You didn't enter the same username!");
            }
        }catch (Exception e){
            System.out.println("[Command] Failed to execute");
        }
    }
}
