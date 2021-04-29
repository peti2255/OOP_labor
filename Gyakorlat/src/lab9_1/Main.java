package lab9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dateArrayList  = new ArrayList<>();
        MyDate[] dateArray = new MyDate[10];

        int year = 2021;
        int month,day;
        Random rand=new Random();
        for (int i=0;i<10;) {
             month = 1 + rand.nextInt(12);
             day = 1 + rand.nextInt(31);
             if(DateUtil.isValidDate(year,month,day))
             {
                 dateArrayList.add(new MyDate(year, month, day));
                 dateArray[i] = new MyDate(year, month, day);
                 i++;
             }

        }

        System.out.println("Rendezes elott: ");
        for (MyDate date : dateArrayList)
        {
            System.out.println(date);
        }

        Collections.sort(dateArrayList);
        System.out.println();
        System.out.println("Rendezes utan: ");
        for (MyDate date : dateArrayList)
        {
            System.out.println(date);
        }
        System.out.println();
        System.out.println();
        System.out.println("Rendezes elott: ");
        for (MyDate date : dateArray)
        {
            System.out.println(date);
        }

        Arrays.sort(dateArray);
        System.out.println();
        System.out.println("Rendezes utan: ");
        for (MyDate date : dateArray)
        {
            System.out.println(date);
        }
        System.out.println("Array after sort: ");
        for(int i=0; i< 10; ++i){
            System.out.println(dateArray[i]);
        }
    }
}
