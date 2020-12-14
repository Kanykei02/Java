package com.company;

public class Chessboard {
    private final static int SIZE = 8;
    private final Rectangle[][] CHESSBOARD = new Rectangle[SIZE][SIZE];

    public boolean fill(Rectangle rect, int a, int b) {
        if(a < 0 || a >= SIZE || b < 0 || b >= SIZE)
            return false;
        else {
            CHESSBOARD[a][b] = rect;
            return true;
        }
    }

    public Rectangle getChessboardRectangle(int a, int b) {
        if(a < 0 || a >= SIZE || b < 0 || b >= SIZE)
            return null;
        else return CHESSBOARD[a][b];
    }

    public Rectangle[][] getCHESSBOARD() {
        return CHESSBOARD;
    }
}
