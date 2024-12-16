package pacchetti;

public class Main {
    public static void main(String[] args) {
        PacchettoViaggi viaggioBase = new PacchettoViaggi("Roma", 7, 500.0);
        System.out.println("Pacchetto base: " + viaggioBase);


        PacchettoVolo viaggioVolo = new PacchettoVolo("Parigi", 5, 300.0, true);
        System.out.println("Pacchetto volo: " + viaggioVolo);

        viaggioVolo.setAndata(false);
        System.out.println("Pacchetto volo aggiornato: " + viaggioVolo);


        PacchettoPasti viaggioPasti = new PacchettoPasti("Madrid", 4, 200.0, true);
        System.out.println("Pacchetto pasti: " + viaggioPasti);


        viaggioPasti.setMezzapensione(false);
        System.out.println("Pacchetto pasti aggiornato: " + viaggioPasti);


        viaggioEscursioni viaggioConEscursioni = new viaggioEscursioni("Londra", 6, 400.0, true, 3);
        System.out.println("Viaggio con escursioni: " + viaggioConEscursioni);


        double costoTotale = viaggioConEscursioni.getCosto();
        System.out.println("Costo totale del viaggio con escursioni: " + costoTotale);


        PacchettoViaggi altroViaggio = new PacchettoViaggi("Roma", 7, 500.0);
        System.out.println("Viaggio base uguale a altroViaggio? " + viaggioBase.equals(altroViaggio));
    }
}
