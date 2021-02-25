package com.company;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
	if(args.length == 0)
    {
        System.out.println("ures tomb");
    }
	for (int i=0;i<args.length;i++)
    {
        System.out.println(args[i]);
    }
        System.out.println();
        for (String arg : args) {
            System.out.println(arg);
        }
	double[] array = {1, 4 ,8};
        for (double elem : array) {
            System.out.println(elem);
        }
        System.out.println();
        System.out.println();
        System.out.println(countBitsBitOperator(18));
        System.out.println();
        System.out.printf("%.2f",mean(array));
}
public  static int countBitsBitOperator(int num)
{
    //shift
    int s=0;
    while(num != 0)
    {
        s += num & 1;
        num = num >> 1;
    }
    return  s;
}
    public static double mean(double[] array) {
        if(array.length == 0)
        {
            return Double.NaN;
        }
        double osszeg = 0;
        for (double v : array) {
            osszeg += v;
        }
        return osszeg / array.length;
    }
}
