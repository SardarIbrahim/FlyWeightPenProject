package com.company;

public class ThinPen implements Pen{

    public BrushSize brushSize = BrushSize.THIN;
    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println(content);
    }
}
