package Jarmuvek;

public class Jarmu {

    protected double suly;
    protected Szin szin;
    protected int maxsebesseg;
    protected String marka;

    public Jarmu(double suly, Szin szin, int maxsebesseg, String marka) {
        this.suly = suly;
        this.szin = szin;
        this.maxsebesseg = maxsebesseg;
        this.marka = marka;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Marka: ").append(this.marka).append("\n")
                .append("Jarmu szine: ").append(this.szin).append("\n")
                .append("Suly: ").append(this.suly).append("kg \n")
                .append("Maximalis sebesseg: ").append(this.maxsebesseg).append("km/h");

        return buffer.toString();
    }
}
