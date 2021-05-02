package lab9_2;

import lab9_1.MyDate;

public class Manager extends Employee{

    private String department;


    public Manager(String firstName, String lastName, double salary, MyDate birthDate,String department) {
        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(super.toString()).
                append(this.department).append("\n");
        return buffer.toString();
    }
}
