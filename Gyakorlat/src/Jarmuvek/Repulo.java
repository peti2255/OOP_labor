package Jarmuvek;

public class Repulo extends Jarmu{

    private String pilotaNeve;
    private  double szarnyFeszTavolsag;

    public Repulo(double suly, Szin szin, int maxsebesseg, String marka, String pilotaNeve, double szarnyFeszTavolsag) {
        //SUPER ez az eslo dolog!!!
        super(suly, szin, maxsebesseg, marka);// meghívodik az ososztály konstuktora
        this.pilotaNeve = pilotaNeve;
        this.szarnyFeszTavolsag = szarnyFeszTavolsag;
    }

    @Override
    public String toString() {
        StringBuffer buffer1 = new StringBuffer();

        buffer1.append("Repulo ").append("\n")
                .append("Pilota neve: ").append(pilotaNeve).append("\n")
                .append(super.toString()).append("\n")
                .append("SzarnyFeszTavolsag: ").append(this.szarnyFeszTavolsag).append("m \n");

        return buffer1.toString();
    }
}
