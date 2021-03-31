package AutB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Moovie moovie1 = new Moovie("Lion King",Category.ANIMATION,2.13,true);
     Moovie moovie2 = new Moovie("Matrix",Category.ACTION,2.4,true);
        System.out.println(moovie1);
        System.out.println(moovie2);
        Cinema cinema = new Cinema("Cinema", "New York");
        cinema.ReadFileFromCsv("MoovieList.csv");
       for (Moovie m: cinema.movie)
       {
           System.out.println(m);
       }
        System.out.println();
        System.out.println("Valso torteneten alapilo filmek szama: "+cinema.NotFictionCounter());
        cinema.PrintToFile(Category.HISTORY);
        System.out.println();
        if(cinema.xwatch(4.5))
            System.out.println("Meg nezheted\n");
        else
            System.out.println("Nem nezheted meg \n");

        System.out.println("10 szinesznel kevesebb " + cinema.xMovie());
        System.out.println();
        System.out.println(cinema);

    }
}
