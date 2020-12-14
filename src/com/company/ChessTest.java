package com.company;

import java.awt.*;

public class ChessTest {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        int side = 40;
        int coordX = 0, coordY = 0;
        for (int i = 0; i < chessboard.getCHESSBOARD().length; i++){
            for (int j = 0; j < chessboard.getCHESSBOARD().length; j++) {
                chessboard.fill(new Rectangle(new Coordinates(coordX, coordY), Color.BLUE, true, side), i, j);
                System.out.println(chessboard.getCHESSBOARD()[i][j].speak());
            }
        }
        System.out.println("Amount of Rectangles: " + Rectangle.getCount());
    }
}
