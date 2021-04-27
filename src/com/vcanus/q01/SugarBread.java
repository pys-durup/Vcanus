package com.vcanus.q01;

public class SugarBread extends Bread{
    private int sugar;

    public SugarBread(int flour, int water, int sugar) {
        this.type = "cream";
        this.flour = flour;
        this.water = water;
        this.sugar = sugar;
    }

    @Override
    void info() {
        System.out.println("breadType: " + this.type);
        System.out.println("recipe");
        System.out.println("flour: " + this.flour);
        System.out.println("water: " + this.water);
        System.out.println("sugar: " + this.sugar);
    }
}
