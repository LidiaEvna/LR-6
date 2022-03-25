package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        float x = num.nextFloat();
        float y = num.nextFloat();
        float z = num.nextFloat();
        Formula did = new Formula(x,y,z);
        did.displayFormula();
    }
}
class Formula {
    float x;
    float y;
    float z;

    public Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayFormula() {
        double l = Math.sqrt(x * x + y * y + z * z);
        System.out.println(l);
    }
}