package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Erszény Péter\n\n");
        System.out.println("sout\n");
        //2.Feladat
        String nev = "Pentek Janos";
        for( int i=0; i<nev.length(); ++i){
            System.out.println(nev.charAt(i));
        }
        //3.Feladat
        System.out.println("\n");
        String nev2 = "ALMAFA";
       for (int i=0;i<nev2.length();i++)
       {
           for (int j=0;j<i+1;j++)
           {
               System.out.print(nev2.charAt(j));
           }
           System.out.println();

       }
    }
}
