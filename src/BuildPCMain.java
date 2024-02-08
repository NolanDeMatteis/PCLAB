package com.nolan.buildmypc;

public class BuildPCMain {

    public static void main(String[] args) {
        PCCase pCCase = new PCCase("X90Ultra", "NZXT", "Aluminum", new Dimension(10, 3, 5));
        Monitor monitor = new Monitor("Asus", "z950", new Resolution(1920, 1080), 12.5,  120);
        Motherboard motherboard = new Motherboard("LHG1200", "FULL ATX", "Intel I9 Series", "Windows xp", 2, 2, 2);
        PC myPC = new PC(pCCase, monitor, motherboard);

        System.out.println("Current System status: " + myPC.getStatus() + "\n\n");

        //power on
        myPC.getMotherboard().simulateStartup();
        System.out.println();

        //check status again
        System.out.println(myPC.toString());

    }
}
