package com.vcanus.q01;

import java.util.ArrayList;
import java.util.List;

public class BreadFactoryTest {
    public static void main(String[] args) {
        BreadFactory breadFactory = new BreadFactory();

        Bread cream = breadFactory.getBread("cream");
        Bread sugar = breadFactory.getBread("sugar");
        Bread butter = breadFactory.getBread("butter");

        List<Bread> breadList = new ArrayList<Bread>();
        breadList.add(cream);
        breadList.add(sugar);
        breadList.add(butter);

        for (Bread bread : breadList) {
            bread.info();
            System.out.println();
        }


    }
}
