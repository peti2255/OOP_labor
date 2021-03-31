import java.util.ArrayList;
import java.util.Calendar;

public class Film {
    private String neve;
    private String rendezo;
    private int kiadasi_ev;
    private ArrayList<Szineszek> szineszeks;

    public Film(String neve, String rendezo, int kiadasi_ev) {
        this.neve = neve;
        this.rendezo = rendezo;
        this.kiadasi_ev = kiadasi_ev;
        this.szineszeks = new ArrayList<>();
    }

    public String getNeve() {
        return neve;
    }

    public String getRendezo() {
        return rendezo;
    }

    public int getKiadasi_ev() {
        return kiadasi_ev;
    }

    public void getSzinesz(Szineszek szinesz) {
        this.szineszeks.add(szinesz);
    }

    public void felMondas(String id) {
        for (Szineszek c : this.szineszeks) {
            if (id.equals(c.getId())) {
                this.szineszeks.remove(c);
            }
        }
    }

    public int noiszereplokszama() {
        int szam = 0;
        for (Szineszek C : szineszeks) {
            if (!C.isNem()) {
                szam++;
            }
        }
        return szam;
    }

    public String filmdatum() {

        if (this.kiadasi_ev < Calendar.getInstance().get(Calendar.YEAR)) {
            return "Kiadott film";
        } else {
            return "Még nincs kiadva";
        }
    }

    public String legidosebb() {
        Szineszek sz1 = szineszeks.get(0);
        for (int i = 0; i < szineszeks.size();i++)
        {
            if(szineszeks.get(i).getEv() < sz1.getEv())
            {
                if(szineszeks.get(i).getEv() == sz1.getEv() )
                {
                    if(szineszeks.get(i).getId().charAt(2) > sz1.getId().charAt(2))
                        sz1 = szineszeks.get(i);
                }
                sz1 =  szineszeks.get(i);
            }
        }
            return sz1.getKeresztnev()+" "+sz1.getCsaladnev();
    }

    public int szineszdijak()
    {
        int szam = 0;
        for (int i = 0; i < szineszeks.size();i++)
        {
            if(szineszeks.get(i).getDijak_szama() == 0)
            {
                szam++;
            }
        }
        return szam;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(this.neve).append(": \n")
                .append("Rendezo: ").append(this.rendezo).append("\n")
                .append("Megjelenesi ev ").append(this.kiadasi_ev).append("\n")
                .append("Szineszek :").append("\n");

        for (Szineszek c : szineszeks)
        {
            buffer.append("\t")
                    .append(c.getCsaladnev()).append(" ")
                    .append(c.getKeresztnev()).append("\n");
        }

        return buffer.toString();
    }
}
