import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Orszag {

    private String onev;
    private String elnok;
    private String fovaros;
    public ArrayList<Varos> varos;

    public Orszag(String varnev, String elnok) {
        this.onev = varnev;
        this.elnok = elnok;
        this.varos = new ArrayList<>();
    }

    public String getOnev() {
        return onev;
    }

    public String getElnok() {
        return elnok;
    }

    public String getFovaros() {
        return fovaros;
    }

    public void setFovaros(String fovaros)
    {
        this.fovaros = fovaros;
    }

    public Varos fovarosnezo()
    {
        for (Varos v: varos)
        {
            if(v.getNev().equals(getFovaros()));
            {
                return v;
            }
        }
       return null;
    }

    public void ujvaros (Varos varosnev)
    {
        varos.add(varosnev);
    }

    public void ujvarosfile(String filename)
    {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return;
        }
        while (scanner.hasNextLine())
        {
            String[] line = scanner.nextLine().trim().split(", ");
            if(line[0].equals("Fovaros"))
            {
                setFovaros(line[1]);
                varos.add(new Varos(line[1],Integer.parseInt(line[2]),Double.parseDouble(line[3]),line[4]));
            }
            else
            {
                varos.add(new Varos(line[0],Integer.parseInt(line[1]),Double.parseDouble(line[2]),line[3]));
            }
        }
    }

    public String aznevezetesseg(int id)
    {
        for (Varos v : varos)
        {
            if (v.getAzonosito() == id)
            {
                return v.getNevezetesseg();
            }
        }
        return null;
    }

    public void printToFile()
    {
        FileWriter file = null;
        try{
            file = new FileWriter("output.txt");
            for (Varos v : varos)
                file.write(v.toString());
            file.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public   int varosfovaroster()
    {
        int szamlalo = 0;
        for (Varos v: varos)
        {
            if(v.getTerulet() < fovarosnezo().getTerulet())
                szamlalo++;
        }
        return szamlalo;
    }

    public String maxnepsuruseg()
    {
        Varos max = varos.get(0);
        for (Varos v: varos)
        {
            if(v.getNepsuruseg() > max.getNepsuruseg())
                max = v;
        }
        return max.getNev();
    }

    @Override
    public String toString() {
       StringBuffer buffer = new StringBuffer();

       buffer.append(this.onev).append("\n")
                .append("\tAz orszag elnoke ").append(this.elnok).append("\n")
                .append("\tFovaros ").append(this.fovaros).append("\n")
                .append("\tTovabbi varosok ").append("\n");
       for (Varos v: varos)
           buffer.append("\t\t").append(v.getNev()).append("\n");

       return buffer.toString();
    }
}
