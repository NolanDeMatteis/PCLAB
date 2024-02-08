package com.nolan.buildmypc;

public class PCCase {

    private String model;
    private String brand;
    private String material;
    private Dimension dimension;

    public PCCase(String model, String brand, String material, Dimension dimension){
        this.model = model;
        this.brand = brand;
        this.material = material;
        this.dimension = dimension;
    }

    public void pressPowerButton(Motherboard motherboard){
        System.out.println("Case class: press the power button - Pressed");
        motherboard.simulateStartup();
    }

    @Override
    public String toString() {
        return "Model: " + model + "\nbrand: " + brand +"\nmaterial: " + material + "\ndimensions: " + dimension.getHeight() + " x " + dimension.getWidth() + " x " + dimension.getDepth();
    }
}
