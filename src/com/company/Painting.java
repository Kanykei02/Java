package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painting extends Canvas {

    private Color[] colors = {Color.MAGENTA, Color.GRAY, Color.BLUE};

    @Override
    public void paint(Graphics graphics) {
        final Circle[] circles = new Circle[7];
        Random random = new Random();
        for (int i = 0; i < circles.length; i++){
            circles[i] = new Circle(random.nextInt(100), colors[random.nextInt(colors.length)], random.nextInt(500), random.nextInt(500));
            graphics.setColor(circles[i].getColor());
            graphics.fillOval(circles[i].getX(), circles[i].getY(), (int) circles[i].getRadius()*2, (int) circles[i].getRadius()*2);
            System.out.printf("Area: %.2f, length: %.2f%n", circles[i].getCircleArea(),circles[i].getCircleLength());
        }
    }

    public static void main(String[] args) {
        Painting canvas = new Painting();
        JFrame jframe = new JFrame();
        jframe.setSize(500,500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().add(canvas);
        jframe.setVisible(true);
    }
}
