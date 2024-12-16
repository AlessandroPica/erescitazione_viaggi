package pacchetti;

public class Main {
    public static void main(String[] args) {
        // Creazione di un PacchettoViaggi base
        PacchettoViaggi viaggioBase = new PacchettoViaggi("Roma", 7, 500.0);
        System.out.println("Pacchetto base: " + viaggioBase);

        // Creazione di un PacchettoVolo
        PacchettoVolo viaggioVolo = new PacchettoVolo("Parigi", 5, 300.0, true);
        System.out.println("Pacchetto volo: " + viaggioVolo);

        // Modifica dell'attributo `isAndata` del PacchettoVolo
        viaggioVolo.setAndata(false);
        System.out.println("Pacchetto volo aggiornato: " + viaggioVolo);

        // Creazione di un PacchettoPasti
        PacchettoPasti viaggioPasti = new PacchettoPasti("Madrid", 4, 200.0, true);
        System.out.println("Pacchetto pasti: " + viaggioPasti);

        // Modifica dell'attributo `isMezzapensione` del PacchettoPasti
        viaggioPasti.setMezzapensione(false);
        System.out.println("Pacchetto pasti aggiornato: " + viaggioPasti);

        // Creazione di un Viaggio con escursioni
        viaggioEscursioni viaggioConEscursioni = new viaggioEscursioni("Londra", 6, 400.0, true, 3);
        System.out.println("Viaggio con escursioni: " + viaggioConEscursioni);

        // Calcolo del costo totale di un viaggio con escursioni
        double costoTotale = viaggioConEscursioni.getCosto();
        System.out.println("Costo totale del viaggio con escursioni: " + costoTotale);

        // Esempio di uguaglianza tra due Pacchetti
        PacchettoViaggi altroViaggio = new PacchettoViaggi("Roma", 7, 500.0);
        System.out.println("Viaggio base uguale a altroViaggio? " + viaggioBase.equals(altroViaggio));
    }
}
