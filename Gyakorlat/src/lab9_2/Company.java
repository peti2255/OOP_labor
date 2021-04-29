package lab9_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void hire(Employee employees){
      this.employees.add(employees);
    }

}

