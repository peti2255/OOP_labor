package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = ArraylistreadFromFile("D:/Egyetem/OOP_labor/Gyakorlat/src/lab4_2/lab_4_2_input.txt");
        assert customers != null;
        for (Customer customer : customers)
        System.out.println(customer);
    }

    public static ArrayList<Customer> ArraylistreadFromFile(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (scanner == null) {
            return null;
        }
        ArrayList<Customer> customers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] values = scanner.nextLine().split(",");
            if (values[0].equals("Customer")) {
                customers.add(new Customer(values[1], values[2]));
            } else if (values[0].equals("Account")) {
                double salary = Double.parseDouble(values[2]);
                customers.get(customers.size() - 1).addAccount(new BankAccount(values[1]));
                customers.get(customers.size() - 1).getAccounts(values[1]).deposit(salary);
            }
        }
        return customers;
    }
}
