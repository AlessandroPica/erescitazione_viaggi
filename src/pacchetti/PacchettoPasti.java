package pacchetti;

import java.util.Objects;

public class PacchettoPasti extends PacchettoViaggi{
    private boolean isMezzapensione;

    public PacchettoPasti (String destinazione, int durata, double costo, boolean isMezzapensione){
        super(destinazione, durata, costo);
        this.isMezzapensione =isMezzapensione;
    }

    public boolean isMezzapensione() {
        return isMezzapensione;
    }

    public void setMezzapensione(boolean mezzapensione) {
        isMezzapensione = mezzapensione;
    }

    public String toString() {
        return super.toString()+"è solo andata: "+ isMezzapensione;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PacchettoPasti that = (PacchettoPasti) o;
        return isMezzapensione == that.isMezzapensione;
    }

    public void costovolo(double costo){
        if(isMezzapensione){

        }
    }
}
