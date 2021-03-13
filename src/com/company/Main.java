package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int min = 1, max = 100;
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 1000; i++){
            int n = rand.nextInt(max - min + 1) + min;
            int prevCount = map.getOrDefault(n, 0);
            map.put(n, ++prevCount);
            System.out.println(n);
        }
        System.out.println(map);

        HashMap<String, Car> cars = new HashMap<>();
        Car mercedes = CarDB.getCarByID(1);
        cars.put("AB1549Z", mercedes);
        //System.out.println(cars);

        Car toyoto = CarDB.getCarByID(2);
        cars.put("I03377Q", toyoto);
        System.out.println(cars.get("AB1549Z"));

        System.out.println("--------------------------------------------------------\n\n");

        //HashMap<String, String> hashMap = new HashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        List<String> pens = new ArrayList<>();
        hashMap.put("President", "Elzin");
        pens.add(hashMap.put("President", "Putin"));
        System.out.println(hashMap);
        System.out.println(pens);
        hashMap.put("minister", "Medvedev");
        pens.add(hashMap.put("minister", "Mishustin"));
        hashMap.put("mayour", "Sobyanin");
        Set<String> keys = hashMap.keySet();
        System.out.println(hashMap);
        System.out.println(keys);
        keys.remove("mayour");
        System.out.println(hashMap);
        System.out.println(keys);
        System.out.println(pens);

        Collection<String> collection = hashMap.values();
        System.out.println(collection);
        collection.remove("Mishustin");
        System.out.println(hashMap);
        System.out.println(collection);

//        System.out.println(DataBase.connect());
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter username:");
//        User user = new User();
//        user.setUserName(sc.nextLine());
//
//        System.out.print("Enter password: ");
//        user.setPassword(sc.nextLine());
//
//        System.out.print("Enter email: ");
//        user.setEmail(sc.nextLine());
//
//        register(user);

//        authorise(user.getUserName(), user.getPassword());
    }
//    public static void register(User user){
//        if(UserDB.addUser(user)){
//            System.out.println("Registered successfully");
//        }
//        else {
//            System.out.println("Registered failed");
//        }
//    }
//    public static void authorise(String username, String password) {
//        User user = UserDB.getUserName(username);
//        if (user == null) {
//            System.err.println("Username or password is incorrect");
//            return;
//        }
//        if (user.getPassword().equals(password)){
//            UserDB.addUserLog(user, "successfully");
//            System.out.println("Logged successfully");
//        }
//        else {
//            UserDB.addUserLog(user, "FAIL");
//            System.out.println("Username or password is incorrect");
//        }
//    }
}
