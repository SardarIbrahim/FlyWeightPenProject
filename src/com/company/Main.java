package com.company;

public class Main {

    public static void main(String[] args) {

//        For the first time it will be added to the hashmap
        Pen yellowPen = PenFactory.getMediumPen("YELLOW");
        yellowPen.draw("HELLO YELLOW PEN");

//        For the second time now it will be accessed from the hashmap as a shareable object
        Pen YellowPen2 = PenFactory.getMediumPen("YELLOW");
        YellowPen2.draw("HELLO AGAIN YELLOW PEN");
    }
}
