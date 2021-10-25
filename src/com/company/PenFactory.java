package com.company;

import java.util.HashMap;

public class PenFactory {

   public static HashMap<String,Pen> penMap = new HashMap<>();

   public static Pen getThickPen(String color){

       Pen myPen = penMap.get(color);

       if(myPen == null){
           myPen = new ThickPen();
           myPen.setColor(color);
       }
       return myPen;
   }

    public static Pen getThinPen(String color){

        Pen myPen = penMap.get(color);

        if(myPen == null){
            myPen = new ThinPen();
            myPen.setColor(color);
        }
        return myPen;
    }


    public static Pen getMediumPen(String color){

        Pen myPen = penMap.get(color);

        if(myPen == null){
            myPen = new ThickPen();
            myPen.setColor(color);
        }
        return myPen;
    }
}
