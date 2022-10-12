package com.yumegod.learn.BankSystem.Command.Commands;

import com.yumegod.learn.BankSystem.Command.Command;
import com.yumegod.learn.BankSystem.Command.CommandHandler;
import com.yumegod.learn.BankSystem.User;

public class Help extends Command {

    public Help() {
        super("Help");
    }

    @Override
    public void run(User user) {
        try{
            System.out.println("\n*******************************");
            for (String command : CommandHandler.CommandList.keySet()){
                System.out.println("[Help] " + command);
            }
            System.out.println("*******************************\n");

            System.out.println("[Command] Execute success!");
        }catch (Exception e){
            System.out.println("[Command] Failed to execute");
        }
    }
}
