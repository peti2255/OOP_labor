package Data;

import javax.xml.crypto.Data;

public class main {
    public static void main(String[] args) {
        System.out.println(DataUtil.isValidData(2000,2, 29));
        System.out.println(DataUtil.isValidData(2000,2, 30));
        System.out.println(DataUtil.isValidData(1900,2, 29));
        System.out.println(DataUtil.isValidData(1900,2, 28));
        System.out.println(DataUtil.isValidData(-1900,2, 28));
        System.out.println(DataUtil.isValidData(0,2, 28));
        System.out.println(DataUtil.isValidData(2021,2, 29));
        System.out.println(DataUtil.isValidData(2020,2, 29));
        System.out.println(DataUtil.isValidData(2020,1, 32));
        System.out.println(DataUtil.isValidData(2020,1, 0));
        System.out.println(DataUtil.isValidData(2020,0, 0));
        System.out.println(DataUtil.isValidData(2020,4, 31));
    }

}
