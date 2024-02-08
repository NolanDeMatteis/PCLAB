package com.nolan.buildmypc;

public class Monitor {

    private String manufacturer, model;
    private Resolution resolution;
    private double screenSize;
    private int refreshRate;

    public Monitor(String manufacturer, String model, Resolution resolution, double screenSize, int refreshRate){
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }


    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + "\nmodel: " + model + "\nresolution: " + resolution.getHeight() + " x " + resolution.getWidth() + "\nscreen size: " + screenSize + "in\nrefresh rate: " +refreshRate;
    }
}
