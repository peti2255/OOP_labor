package com.company;

public class BarkacsBolt {
    private String nev;
    private  String boltNev;
    private final int ev;
    private  boolean kezi;

    public BarkacsBolt(String nev,String boltNev, int ev)
    {
        this.nev = nev;
        this.ev = ev;
        this.boltNev = boltNev;
        kezi = ev > 2000;
    }

    public String getNev() {
        return nev;
    }

    public String getBoltNev() {
        return boltNev;
    }

    public int getEv() {
        return ev;
    }

    public boolean isKezi() {
        return kezi;
    }

    @Override
    public String toString ()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Nev: ").append(this.nev).
                append("Boltos neve: ").append(this.boltNev).
                append("Ev: ").append(this.ev);

        return buffer.toString();
    }
}
