package com.company;

public class Main {

    public static void main(String[] args) {
//         getBit(13,0);
        System.out.println(getBit(13,2));
    }


    public static byte getBit(int number, int order)
    {
        if(order>8)
        {
            return 1;
        }
        int szam1=number;
        byte [] arraybit =new byte[8];
        int i=8;
        while (szam1>0)
        {
            arraybit[--i]=(byte)(szam1%2);
            szam1/=2;
        }
        return arraybit[order];
    }


}