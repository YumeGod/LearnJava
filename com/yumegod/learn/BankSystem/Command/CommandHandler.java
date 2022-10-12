package com.yumegod.learn.BankSystem.Command;

import com.yumegod.learn.BankSystem.Command.Commands.*;
import com.yumegod.learn.BankSystem.User;

import java.util.HashMap;

public class CommandHandler {

    public static HashMap<String, Command> CommandList = new HashMap<String, Command>();

    private User user;

    public CommandHandler(User user){
        this.user = user;
    }

    public void init(){
        CommandList.put("ChangeUsername", new ChangeUsername());
        CommandList.put("ChangePassword", new ChangePassword());
        CommandList.put("SetBalance", new SetBalance());
        CommandList.put("AddBalance", new AddBalance());
        CommandList.put("RemoveBalance", new RemoveBalance());
        CommandList.put("Help", new Help());
        CommandList.put("AccountInfo", new AccountInfo());
        CommandList.put("Exit", new Exit());
    }

    public boolean commandExist(String command){
        return CommandList.containsKey(command);
    }

    public void commandExecute(String command){
        Command targetCommand = CommandList.get(command);
        targetCommand.run(user);
    }
}
