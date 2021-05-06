package lab9_2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Alibaba");
        company.hireAll("employees.csv");
        company.printAll(System.out);
        System.out.println("------------------------------------");
        company.printManagers(System.out);
        PrintStream output = null;
        try {
            output = new PrintStream("manager.txt");
            company.printManagers(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        company.defaultRendezes();
        company.printAll(System.out);

        Comparator<Employee> fizetesSzerint = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() > o2.getSalary())
                    return 1;
                if(o1.getSalary() < o2.getSalary())
                    return -1;
                return 0;
            }
        };
        company.sortByComparator(fizetesSzerint);
        company.printAll(System.out);

        //static!!! => osztalynevvel erjuk el
        company.sortByComparator(Employee.szuletesiDatumSzerint);
    }
}


