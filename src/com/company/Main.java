package com.company;

import com.company.board.AbstractBoard;
import com.company.board.BlackBoard;
import com.company.board.WhiteBoard;
import com.company.board.Writable;
import com.company.monkey.Climbable;
import com.company.monkey.Monkey;

public class Main {

    public static void main(String[] args) {
        //WhiteBoard white = new WhiteBoard();
        //BlackBoard black = new BlackBoard();

        //AbstractBoard b = new WhiteBoard();
        //AbstractBoard bl = new BlackBoard();
        //AbstractBoard wh = new WhiteBoard();

        //AbstractBoard[] array = {b, bl, wh};

        //Climbable mon = new Monkey();
        //mon.climb();

        //WhiteBoard whiteBoard = new WhiteBoard();
        //whiteBoard.write();

        //Writable blB = new BlackBoard();
        //blB.write();

        //Writable[] bb = {whiteBoard, blB};
        //testMe(blB);
        Turtle turtle = new Turtle();
        turtle.swim();
        turtle.shell();
        turtle.put();
    }

    //public static void testMe(Writable board){
        //board.write();

}
