package com.nolan.buildmypc;

public class Dimension {

    private double height, width, depth;

    public Dimension(double height, double width, double depth){
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
