package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String birthYear;

    public Person(String firstName, String lastName, String birthYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person:" +
                firstName + '\'' +
                lastName + '\'' +
                birthYear + '\'';
    }


}
