package lab10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadFromFileData("student.csv");

    }

    public static void ReadFromFileData(String filename) {
        Scanner scanner = null;
        PrintStream output = null;
        try {
            scanner = new Scanner(new File(filename));
            output = new PrintStream("warning.csv");
            //beolvasa
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
//                System.out.println(line);
                    String[] items = line.split(", ");
                    String neptunKod = items[0].trim(), kNev = items[1].trim(), csNev = items[2].trim();
                    int kreditszam = Integer.parseInt(items[3].trim());
                    int ev = Integer.parseInt(items[4].trim());
                    int honap = Integer.parseInt(items[5].trim());
                    int nap = Integer.parseInt(items[6].trim());
                    MyDate szuletesi = new MyDate(ev,honap,nap);
                }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
                {
                    System.out.println("INCOMPLET LINE: " + line);
                    output.println("INCOMPLET LINE: " + line);
                }catch (NumberFormatException numberFormatException)
                {
                    System.out.println("NUMBER FORMAT EXCEPTION : " + line);
                    output.println("NUMBER FORMAT EXCEPTION : " + line);
                }catch (InvalidDAteException invalidDAteException)
                {
                    System.out.println(invalidDAteException.getMessage() + line);
                    output.println(invalidDAteException.getMessage() + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
