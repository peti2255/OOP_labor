package com.company;

public class Main {
    public static void main(String[] args) {
        double x[] ={7, 12, -13, 5, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
    }


    public static double maxElement( double array[] ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }

}
