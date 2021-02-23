package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = {1.12, 2.01, 3.1, 4.123, 5.8654, 6, 7, 8, 9};
        System.out.printf("%.2f",mean(array));
    }

    public static double mean(double[] array) {
        double osszeg = 0;
        for (int i = 0; i < array.length; i++) {
            osszeg += array[i];
        }
        return osszeg / array.length;
    }
}
