package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ballOne = new Ball();

        ballOne.color = "Blue";
        ballOne.price = 10;
        ballOne.radius = 6;
        ballOne.producerCountry = "Chine";
        System.out.println(ballOne.color + " " + ballOne.price + " " + ballOne.radius + " " + ballOne.producerCountry);
        //Задача А
        Students max = new Students();
        Students lilit = new Students();
        Students dean = new Students();

        max.skinColor = "White";
        max.year = 20;
        max.growth = 185;
        max.nationality = "Italy";

        lilit.skinColor = "Mulatto";
        lilit.year = 19;
        lilit.growth = 165;
        lilit.nationality = "Russia";

        dean.skinColor = "White";
        dean.year = 34;
        dean.growth = 183;
        dean.nationality = "American";

        System.out.println(max.growth + " " + max.nationality + " " + max.year + " " + max.skinColor + " , " + lilit.skinColor + " " + lilit.year + " " + lilit.nationality + " " + lilit.growth + " , " + dean.growth + " " + dean.nationality + " " + dean.year + " " + dean.skinColor);
        //Задача В
        Supernatural sem = new Supernatural();
        Supernatural castiel = new Supernatural();
        Supernatural charli = new Supernatural();

        sem.growth = 200;
        sem.power = "blood";
        sem.status = "hunter";
        sem.year = 30;

        castiel.year = 3000;
        castiel.status = "Angel";
        castiel.power = "God power";
        castiel.growth = 170;

        charli.year = 24;
        charli.growth = 167;
        charli.power = "IT-programmer";
        charli.status = "human";

        System.out.println(sem.growth + " " + sem.status + " " + sem.power + " " + sem.year + " , " + castiel.year + " " + castiel.power + " " + castiel.status + " " + castiel.growth + " , " + charli.growth + " " + charli.status + " " + charli.power + " " + charli.year);
    }
}
