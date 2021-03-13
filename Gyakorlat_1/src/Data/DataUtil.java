package Data;

import java.util.Date;

public class DataUtil {
    public static boolean leapYear(int year)  {
        if(year % 400 == 0)
            return true;
        else if(year % 100 == 0)
            return false;
        else return year % 4 == 0;
    }

    public static boolean isValidData(int year, int month, int day) {
        if(year < 0)
            return false;

        if(month <= 0 || month > 12)
            return false;

        if(month == 2 && (day <= 0 || day > 28))
            return false;

        if((month == 4 || month == 6 || month == 9 || month == 11) && (day <= 0 || day > 30))
            return false;

        if((day <= 0 || day > 31))
            return false;

        return true;
    }
}
