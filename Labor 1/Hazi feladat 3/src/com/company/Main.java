package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=0;i<32;i++)
        {
            countsBit(i);
        }
    }
    public  static  void  countsBit(int number)
    {
        byte osszeg=0;

        for (int i=0;i<8;i++)
        {
            osszeg+=((number >> i) & 1);
        }
        System.out.println(number + " " + osszeg);
    }
}
