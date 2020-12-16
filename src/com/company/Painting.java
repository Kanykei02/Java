package com.company;

import javax.swing.*;
import java.awt.*;

public class Painting extends Canvas {

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.MAGENTA);
        graphics.fillOval(50,50, 100, 100);
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
