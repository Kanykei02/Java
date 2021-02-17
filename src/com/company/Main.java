package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(DataBase.connect());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        User user = new User();
        user.setUserName(sc.nextLine());

        System.out.print("Enter password: ");
        user.setPassword(sc.nextLine());

        System.out.println("Enter email: ");
        user.setEmail(sc.nextLine());

        register(user);
    }
    public static void register(User user){
        if(UserDB.addUser(user)){
            System.out.println("Registered successfully");
        }
        else {
            System.out.println("Registered failed");
        }
    }
}
