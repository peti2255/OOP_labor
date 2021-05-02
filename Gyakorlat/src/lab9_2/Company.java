package lab9_2;

import lab9_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private final ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employees) {
        this.employees.add(employees);
    }

    public void hireAll(String filename) {
                    Scanner scanner = null;
            try {
                scanner = new Scanner(new File(filename));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.trim().split(", ");
                Employee emp = null;
                boolean manager = false;
                try{
                    if(items[6] != null)
                    manager = true;
                }catch (IndexOutOfBoundsException e) {}
                if(manager)
                {
                    emp = new Manager(items[0],items[1],Double.parseDouble(items[2]),new MyDate(Integer.parseInt(items[3]),Integer.parseInt(items[4]),Integer.parseInt(items[5])),items[6]);

                }else
                {
                    emp = new Employee(items[0],items[1],Double.parseDouble(items[2]),new MyDate(Integer.parseInt(items[3]),Integer.parseInt(items[4]),Integer.parseInt(items[5])));
                }


                this.hire(emp);
            }
        }

    public void fire(int ID)
    {
        this.employees.remove(ID);
    }

    public void printAll(PrintStream printStream)
    {
        for (Employee emp : this.employees)
        {
            printStream.println(emp);
        }
    }

    public void printManagers(PrintStream printStream)
    {
        for (Employee emp : this.employees)
        {
            if(emp instanceof Manager)
            printStream.println(emp);
        }
    }
}

