package lab10_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg szamokat: ");
        String sor =  scanner.nextLine();
        String[] items =  sor.split(" ");
        double sum =0;
        for (String i : items)
        {
            try {
                sum += Double.parseDouble(i);
            }catch (NumberFormatException e)
            {
                System.out.println("Nem szam: "+ i);
                //e.printStackTrace();
                //System.out.println(e.getMessage());
            }

        }

        System.out.println("Osszeg: "+ sum);
    }
}
