package com.yumegod.learn.BankSystem.Command.Commands;

import com.yumegod.learn.BankSystem.BankSystem;
import com.yumegod.learn.BankSystem.Command.Command;
import com.yumegod.learn.BankSystem.User;

public class ChangePassword extends Command {

    public ChangePassword() {
        super("ChangePassword");
    }

    @Override
    public void run(User user) {
        try{
            System.out.println("[Command] Please enter your current password:");
            if(user.getPassword().equals(BankSystem.in.nextLine())){
                System.out.println("[Command] Please enter your new password:");
                String newPassword = BankSystem.in.nextLine();

                System.out.println("[Command] Please confirm your new password:");
                if(newPassword.equals(BankSystem.in.nextLine())){
                    user.setPassword(newPassword);

                    System.out.println("\n*******************************");
                    System.out.println(user.getUsername() + "'s new password: " + user.getPassword());
                    System.out.println("*******************************\n");

                    System.out.println("[Command] Execute success!");
                }else{
                    System.out.println("[Command] You didn't enter the same password!");
                }
            }else{
                System.out.println("[Command] Incorrect password!");
            }
        }catch (Exception e){
            System.out.println("[Command] Failed to execute");
        }
    }
}
