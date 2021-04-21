package Jarmuvek;

public class Hajo extends Jarmu{
    private double kabinMagassag;
    private String kapitanyNeve;

    public Hajo(double suly, Szin szin, int maxsebesseg, String marka, double kabinMagassag, String kapitanyNeve) {
        super(suly, szin, maxsebesseg, marka);
        this.kabinMagassag = kabinMagassag;
        this.kapitanyNeve = kapitanyNeve;
    }

    public  boolean elsulyedtE()
    {
        if(maxsebesseg > 100){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer buffer2 = new StringBuffer();

        buffer2.append("Hajo ").append("\n")
                .append("Kapitany neve: ").append(this.kapitanyNeve).append("\n")
                .append(super.toString()).append("\n")
                .append("Kabin magassag: ").append(this.kabinMagassag).append("m \n");

        return buffer2.toString();
    }
}
