package com.yumegod.learn.BankSystem;

public class User {
    private String username;
    private String password;
    private long balance;

    public User(String username, String password, long balance){
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setBalance(long value){
        this.balance = value;
    }

    public long getBalance(){
        return this.balance;
    }
}
