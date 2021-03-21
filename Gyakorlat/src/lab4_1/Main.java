package lab4_1;

import javax.swing.text.html.HTMLDocument;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File thefile = new File("D:/Egyetem/OOP_labor/Gyakorlat/src/lab4_1/lab4_1_input.txt");
        File csvfile = new File("D:/Egyetem/OOP_labor/Gyakorlat/src/lab4_1/lab4_1_input.csv");

        readFilePrintLineNumbered(thefile);
        System.out.println();
        readFilePrintLineNumbered(csvfile);
        ArrayList<Person> persons = ArrayListreadFromCSVFile("D:/Egyetem/OOP_labor/Gyakorlat/src/lab4_1/lab4_1_input.csv");
        for (Person person : persons)
        System.out.println(person);

    }

    // Read file
    public static void readFilePrintLineNumbered(File fileName) {

        try {
            Scanner eyes = new Scanner(fileName);
            while (eyes.hasNextLine()) {
                String sor = eyes.nextLine();
                System.out.println(sor);

            }
            eyes.close();
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }

    }

    public static ArrayList<Person> ArrayListreadFromCSVFile(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (scanner == null)
            return null;
        ArrayList<Person> persons = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String[] items = line.split(",");
            persons.add(new Person(items[0].trim(), items[1].trim(), items[2].trim()));
        }
        return persons;
    }
}


