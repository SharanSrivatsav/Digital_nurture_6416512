package com.example;

public class Calculator {
    private int ans = 0;
    public int add(int a, int b) {
        ans = a+b;
        return ans;
    }

    public void reset() {
        ans = 0;
    }

    public int getMemory() {
        return ans;
    }
}
