public class Varos {

    private final  int azonosito;
    public static int azonositoszam = 1;
    private  String nev;
    private int nepesseg;
    private double terulet;
    private String nevezetesseg;
    private  double nepsuruseg;

    public Varos(String nev, int nepesseg, double terulet, String nevezetesseg) {
        this.nev = nev;
        this.nepesseg = nepesseg;
        this.terulet = terulet;
        this.nevezetesseg = nevezetesseg;
        this.azonosito = azonositoszam++;
        this.nepsuruseg = this.nepesseg / this.terulet;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public String getNev() {
        return nev;
    }

    public int getNepesseg() {
        return nepesseg;
    }

    public double getTerulet() {
        return terulet;
    }

    public String getNevezetesseg() {
        return nevezetesseg;
    }

    public double getNepsuruseg() {
        return nepsuruseg;
    }

    public void setNepesseg(int nepesseg) {
        this.nepesseg = nepesseg;
    }

    public void setNepsuruseg(double nepsuruseg) {
        this.nepsuruseg = nepsuruseg;
    }

    @Override
    public String toString() {
       StringBuffer buffer = new StringBuffer();

       buffer.append(this.azonosito).append("\n")
               .append(this.nev).append("\n")
               .append("\tNepesseg ").append(this.nepesseg).append("\n")
               .append("\tTerulet ").append(this.terulet).append("\n")
               .append("\tEgy nevezetesseg ").append(this.nevezetesseg).append("\n")
               .append("\tNepsuruseg ").append(String.format("%.2f",this.nepsuruseg)).append("\n");

       return buffer.toString();
    }
}
