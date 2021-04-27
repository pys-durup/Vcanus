package com.vcanus.q03;

public class Factorial {
        static int n;
    public static void main(String[] args) {

        int result = factorial(1000000);
        System.out.println(result);

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
