package com.vcanus.q02;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(0);

        int result = calculator.add(4).add(5).subtract(3).out();
        System.out.println(result);

    }
}
