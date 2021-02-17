package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(DataBase.connect());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        User user = new User();
        user.setUserName(sc.nextLine());

        System.out.print("Enter password: ");
        user.setPassword(sc.nextLine());
//
//        System.out.print("Enter email: ");
//        user.setEmail(sc.nextLine());
//
//        register(user);

        authorise(user.getUserName(), user.getPassword());
    }
    public static void register(User user){
        if(UserDB.addUser(user)){
            System.out.println("Registered successfully");
        }
        else {
            System.out.println("Registered failed");
        }
    }
    public static void authorise(String username, String password) {
        User user = UserDB.getUserName(username);
        if (user == null) {
            System.err.println("Username or password is incorrect");
            return;
        }
        if (user.getPassword().equals(password)){
            UserDB.addUserLog(user, "successfully");
            System.out.println("Logged successfully");
        }
        else {
            UserDB.addUserLog(user, "FAIL");
            System.out.println("Username or password is incorrect");
        }
    }
}
