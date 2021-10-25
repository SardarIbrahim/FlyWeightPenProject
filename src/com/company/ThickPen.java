package com.company;

public class ThickPen implements Pen{

    public BrushSize brushSize = BrushSize.THICK;
    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println(content);
    }
}
