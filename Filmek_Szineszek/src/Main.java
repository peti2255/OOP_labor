import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Szineszek szinesz1 = new Szineszek("Brad", "Pitt", 1978, true);
        Szineszek szinesz2 = new Szineszek("Johnnny ", "Deep", 1968, true);
        Szineszek szinesz3 = new Szineszek("Emma", "Watson", 1988, false);

        szinesz2.setDijak_szama();
        szinesz3.setDijak_szama();
        szinesz3.setDijak_szama();

        System.out.println(szinesz1);
        System.out.println(szinesz2);
        System.out.println(szinesz3);
        System.out.println();

        Film film1 = new Film("Captain Morgen", "Brad", 1999);

        ArrayList<Szineszek> szinesz = ReadFromFile("be.csv");
        for (Szineszek Sz : szinesz) {
            System.out.println(Sz);
        }

        for (Szineszek szineszek : szinesz)
            film1.getSzinesz(szineszek);
        System.out.println();
        System.out.println("Noi szereplok szama: " + film1.noiszereplokszama());
        System.out.println();
        System.out.println(film1.getNeve() + " " + film1.filmdatum());
        System.out.println();
        System.out.println("legidosebb szinesz:"+film1.legidosebb());
        System.out.println();
        System.out.println("Szineszek szama akiknek nincs egy dijjuk sem: "+film1.szineszdijak());
        System.out.println();
        System.out.println(film1);



    }

    public static ArrayList<Szineszek> ReadFromFile(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Szineszek> szin = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String[] items = line.trim().split(", ");
            boolean nm;
            if (items[2].equals("MALE"))
                nm = true;
            else
                nm = false;
            Szineszek szines = new Szineszek(items[0], items[1], Integer.parseInt(items[3]), nm);
            for (int i = 1; i <= Integer.parseInt(items[4]); i++) {
                szines.setDijak_szama();
            }
            szin.add(szines);

        }
        return szin;
    }
}
