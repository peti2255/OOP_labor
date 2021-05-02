package lab9_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Alibaba");
        company.hireAll("employees.csv");
        company.printAll(System.out);
        System.out.println("------------------------------------");
        company.printManagers(System.out);

    }

}
