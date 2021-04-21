package BankAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = ArraylistreadFromFile("D:/Egyetem/OOP_labor/Hazi_feladat_1/src/BankAccount/input.txt");
        assert customers != null;
        for (Customer customer : customers)
        {
            System.out.println(customer);
        }

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
                customers.get(customers.size() - 1).addAccount(new SavingsAccount(values[1],Double.parseDouble(values[3])));
                customers.get(customers.size() - 1).getAccounts(values[1]).deposit(salary);
            }
        }
        return customers;
    }
}
