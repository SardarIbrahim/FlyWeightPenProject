package com.company;

public class MediumPen implements Pen {

    public BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println(content);
    }
}
