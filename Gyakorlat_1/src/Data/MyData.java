package Data;

import javax.xml.crypto.Data;

public class MyData {
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        if(DataUtil.isValidData(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    // Getters
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    @Override
    public String toString() {
        return this.year + "/" + this.month + "/" + this.day;
    }
}
