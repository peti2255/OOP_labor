package lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] elements;


    public MyArray(int length) {
        this.length = length;
        this.elements = new double[this.length];
    }

    public MyArray(double[] elements) {
        this.elements = elements;
        this.length = elements.length;
    }

    public MyArray(MyArray array) {
        this.elements = array.elements;
        this.length = array.length;
    }

    public void fillRandom(int max, int min)
    {
        for (int i = 0 ; i < this.length ; i++)
        {
            double rnd = Math.random() * (max - min +1) + min;
            this.elements[i] = rnd;
        }


    }

    public MyArray(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        this.length = Integer.parseInt(scanner.nextLine().trim());
        this.elements = new double[this.length];
        String[] line = scanner.nextLine().trim().split(" ");
        for (int i = 0; i < length; i++) {
            this.elements[i] = Integer.parseInt(line[i]);
        }
    }

    public double mean()
    {
        double sum = 0;
        for (int i = 0; i < this.length; i++)
        {
            sum += elements[i];
        }
        return sum/(double)this.length;
    }

    public double stddev ()
    {
        double sum = 0, standardDeviation = 0;
        for (double num : elements){
            sum += num;
        }
        double mean = sum/length;

        for (double num : elements)
        {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/(double) this.length);
    }

    public  void sort()
    {
        Arrays.sort(this.elements);
    }
    public void print (String array)
    {
        System.out.print(array + ":");
     for (double i : this.elements)
     {
         System.out.printf("%.2f ",i);
     }
        System.out.println();
    }
}
