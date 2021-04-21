package Jarmuvek;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Repulo repulo1=new Repulo(900,Szin.FEHER,1900,"Flying Airlines","James Richard",25);
        Repulo repulo2=new Repulo(277000,Szin.FEHER,1185,"Airbus A380","Kallo Janos",79.8);
        Repulo repulo3=new Repulo(900,Szin.PIROS,1350,"Flying Airlines","Szabo Janos",32);
        Hajo hajo1 = new Hajo(125521,Szin.FEKETE,852,"Barkas",2.52,"Captain Morgen");
        Hajo hajo2 = new Hajo(10026,Szin.FEKETE,78659,"Abbate",3548,"James Black");
        Hajo hajo3=new Hajo(250,Szin.PIROS,230,"ABIM",40,"Kiss Pal");
        Hajo hajo4 = new Hajo(17711,Szin.LILA,500,"Titanic",3549,"Jack");

        ArrayList<Jarmu> jarmuvek = new ArrayList<>();
        jarmuvek.add(repulo1);
        jarmuvek.add(repulo2);
        jarmuvek.add(repulo3);
        jarmuvek.add(hajo1);
        jarmuvek.add(hajo2);
        jarmuvek.add(hajo3);
        jarmuvek.add(hajo4);

        for (Jarmu j : jarmuvek)
        {
            // Megnezzuk hogy hajorol vane szo
            if(j instanceof Hajo)
            {
                Hajo aux = (Hajo) j;
                //((Hajo) j).elsulyedtE();
                System.out.println("Elsulyedt: " +  aux.elsulyedtE());

            }

            System.out.println(j);
        }

    }
}
