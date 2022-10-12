package com.yumegod.learn.BankSystem;

import com.yumegod.learn.BankSystem.Command.CommandHandler;

import java.util.Scanner;

public class BankSystem {

    //Initialize a new Scanner and scan for console input
    public static Scanner in = new Scanner(System.in);

    //初始化用户(方便赋值)
    public static User user;
    //初始化CommandHandler
    public static CommandHandler command;

    //用户默认有多少钱
    private static long startValue = 9999;

    public static void load(){
        //这里使用try & try 这样即使程序报错也不会直接退出 而是继续运行
        try{
            //初始化变量(方便赋值)
            String username;
            String password;

            System.out.println("Start Register");

            //读取用户名密码并赋值
            System.out.println("[REG] Please enter your username:");
            username = in.nextLine();
            System.out.println("[REG] Please enter your password:");
            password = in.nextLine();

            System.out.println("[REG] Please enter confirm password:");

            //while循环验证确认密码 由于nextLine()只有在输入时才会调用 所以只有在输入时会检测 while true不会影响效率
            while(true){
                //判断密码是否一致
                if(in.nextLine().equals(password)){
                    System.out.println("[REG] Register success!");
                    break;
                }else{
                    System.out.println("[REG] You didn't enter the same password! Please enter confirm password again:");
                }
            }

            //新建用户
            user = new User(username, password, startValue);

            //实例化CommandHandler
            command = new CommandHandler(user);

            //初始化command(把命令插入到map里)
            command.init();

            //初始化变量(方便赋值)
            String inputCommand;

            System.out.println("[Adjust prefix] Start reading commands now!");

            //Start listening for command input
            while(true){
                //读取console input
                inputCommand = in.nextLine();
                //Check if command exist
                if (command.commandExist(inputCommand)){
                    //Execute command
                    command.commandExecute(inputCommand);
                }else {
                    System.out.println("[Command] Command:" + inputCommand + " does not exist!");
                }
            }
        }catch (Exception e){
            System.out.println("Error occurs: " + e.getMessage());
        }
    }
}
