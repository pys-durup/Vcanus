package com.vcanus.q01;

public class CreamBread extends Bread{
    private int cream;

    public CreamBread(int flour, int water, int cream) {
        this.type = "cream";
        this.flour = flour;
        this.water = water;
        this.cream = cream;
    }

    @Override
    void info() {
        System.out.println("breadType: " + this.type);
        System.out.println("recipe");
        System.out.println("flour: " + this.flour);
        System.out.println("water: " + this.water);
        System.out.println("cream: " + this.cream);
    }

}
