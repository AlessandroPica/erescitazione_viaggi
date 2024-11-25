package pacchetti;

import java.util.Objects;
package pacchetti;

public class PacchettoViaggi {
    private String destinazione;
    private int durata;
    private double costo;

    //costruttore
    public PacchettoViaggi(){
        this.destinazione="";
        this.durata=0;
        this.costo=0.0;
    }
    public PacchettoViaggi(String destinazione, int durata, double costo){
        this.destinazione=destinazione;
        this.durata=durata;
        this.costo=costo;
    }

    //metodi set
    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    //metodi get
    public String getDestinazione() {
        return destinazione;
    }
    public int getDurata() {
        return durata;
    }
    public double getCosto() {
        return costo;
    }

    //metodo toString
    public String toString() {
        return "pacchetti.PacchettoViaggi{" +
                "destinazione='" + destinazione + '\'' +
                ", durata=" + durata +
                ", costo=" + costo +
                '}';
    }

    //metodo equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacchettoViaggi that = (PacchettoViaggi) o;
        return durata == that.durata && Double.compare(costo, that.costo) == 0 && Objects.equals(destinazione, that.destinazione);
    }
}
