package com.company;

public class Main {

    public static void main(String[] args) {
        WhiteBoard white = new WhiteBoard();
        BlackBoard black = new BlackBoard();

        AbstractBoard b = new WhiteBoard();
        AbstractBoard bl = new BlackBoard();
        AbstractBoard wh = new WhiteBoard();

        AbstractBoard[] array = {b, bl, wh};

        Climbable mon = new Monkey();
        mon.climb();

        WhiteBoard whiteBoard = new WhiteBoard();
        whiteBoard.write();

        Writable blB = new BlackBoard();
        blB.write();

        Writable[] bb = {whiteBoard, blB};
        testMe(blB);
    }

    public static void testMe(Writable board){126
        board.write();
    }
}
