package com.company;

public class UchBurchtuk {
    int a;
    int b;
    int c;

    public void area() {
        float p = (a + b + c) / 2.f;
        System.out.println("perimeter:" + p);
        float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Square:" + s);
    }
}
