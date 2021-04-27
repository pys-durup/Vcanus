package com.vcanus.q01;

public class ButterBread extends Bread {
    private int butter;

    public ButterBread(int flour, int water, int butter) {
        this.type = "butter";
        this.flour = flour;
        this.water = water;
        this.butter = butter;
    }

    @Override
    void info() {
        System.out.println("breadType: " + this.type);
        System.out.println("recipe");
        System.out.println("flour: " + this.flour);
        System.out.println("water: " + this.water);
        System.out.println("butter: " + this.butter);
    }
}
