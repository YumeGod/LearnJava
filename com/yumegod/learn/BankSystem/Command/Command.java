package com.yumegod.learn.BankSystem.Command;

import com.yumegod.learn.BankSystem.User;

public abstract class Command {

    private final String name;

    public Command(String name) {
        this.name = name;
    }

    public abstract void run(User user);
}
