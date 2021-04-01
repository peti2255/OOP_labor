import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Varos varos1  = new Varos("Marosvasarhely",123000,450000,"Sapientia");
        Varos varos2  = new Varos("Bucharest",2000000,562000,"Cotroceni Palota");
        Varos varos3  = new Varos("Budapest",2100000,300000,"Margit hid");

        System.out.println(varos1);
        System.out.println();
        System.out.println(varos2);
        System.out.println();
        System.out.println(varos3);
        System.out.println();

        Orszag orszag = new Orszag("Romania","Klaus");
        System.out.println("uj orszag hozzaadva\n");
        orszag.ujvarosfile("Orszag.csv");
        for (Varos o : orszag.varos)
        {
            System.out.println(o);
        }
        System.out.println(orszag.aznevezetesseg(5));
        orszag.printToFile();
        System.out.println();
        System.out.println("Fovarosnal kissebb teruletu varosok szama: "+orszag.varosfovaroster());
        System.out.println();
        System.out.println("Legnagyobb nepsurusegu varos: "+orszag.maxnepsuruseg());
        System.out.println();
        System.out.println(orszag);
        System.out.println();


    }
}
