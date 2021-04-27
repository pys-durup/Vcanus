package com.vcanus.q02;

public class Calculator {
    private int result;

    public Calculator(int result) {
        this.result = result;
    }

    public Calculator add(int num) {
        this.result += num;
        return this;
    }

    public Calculator subtract(int num) {
        this.result -= num;
        return this;
    }

    public int out() {
        return this.result;
    }
}
