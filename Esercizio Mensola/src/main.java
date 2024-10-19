import static utility.ArrayControl.*;
import static utility.Tools.*;
import frontScreen.*;
import mensola.*;

import java.util.Scanner;

public class Main {
    public static final int MAX_LIBRI = 20;
    private static Libro[] mensola = new Libro[MAX_LIBRI];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] menuScelta = {
                "MENSOLA",
                "Inserimento",
                "Visualizzazione",
                "Modifica pagine libro",
                "Cancellazione",
                "Cerca libri autore",
                "Cerca steso titolo",
                "fine"
        };
        boolean fine=true;
        boolean titolo;
        int contatore=0;
        int indice = -1;
        String parola;

        do {
            switch (menu(menuScelta, keyboard)) {
                case 1:
                    if(contatore<MAX_LIBRI){
                        do{
                            titolo = false;
                            mensola[contatore] = FrontEnd.leggiLibro(keyboard);
                            for(int i = 0; i < contatore; i++){
                                if(mensola[contatore].autore.equals(mensola[i].autore) && mensola[contatore].titolo.equals(mensola[i].titolo)){
                                    System.out.println("Il titolo inserito è gia esistente, riprova");
                                    titolo = true;
                                }
                            }
                        } while(titolo);
                        contatore++;
                    } else {
                        System.out.println("La mensola è piena");
                    }
                    break;
                case 2:
                    FrontEnd.visualizza(contatore, mensola);
                    break;
                case 3:
                    keyboard.nextLine();
                    System.out.println("Inserisci il titolo del libro: ");
                    parola = keyboard.nextLine();
                    indice = ricercaTitolo(parola, contatore);
                    if(indice != -1){
                        try {
                            System.out.println("Inserisci il nuovo numero di pagine: ");
                            mensola[indice].numeroPagine = keyboard.nextInt();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Il titolo inserito non esiste");
                    }
                    keyboard.nextLine();
                    break;
                case 4:
                    keyboard.nextLine();
                    System.out.println("Inserisci il titolo del libro da cancellare: ");
                    parola = keyboard.nextLine();
                    indice = ricercaTitolo(parola, contatore);
                    if (indice != -1) {
                        for (int i = indice; i < contatore - 1; i++) {
                            mensola[i] = mensola[i + 1];
                        }
                        mensola[contatore - 1] = null;
                        contatore--;
                        System.out.println("Libro cancellato con successo.");
                    } else {
                        System.out.println("Il titolo inserito non esiste.");
                    }
                    break;
                case 5:
                    keyboard.nextLine();
                    System.out.println("Inserisci il nome dell'autore: ");
                    parola = keyboard.nextLine();
                    visualizzaLibriDiAutore(contatore, parola);
                    break;
                case 6:
                    Libro[] titoli = new Libro[contatore];
                    keyboard.nextLine();
                    System.out.println("Inserisci il titolo: ");
                    parola = keyboard.nextLine();
                    titoli = findAll(parola, contatore);
                    if(titoli == null){
                        System.out.println("Non sono stati trovati libri");
                    } else {
                        for(int i = 0; i < titoli.length; i++){
                            System.out.println(titoli[i]);
                        }
                    }
                    break;
                case 7:
                    fine = false;
                    break;
            }
        } while (fine);
    }

    private static void visualizzaLibriDiAutore(int contatore, String autore) {
        boolean trovato = false;
        for (int i = 0; i < contatore; i++) {
            if (mensola[i].autore.equals(autore)) {
                System.out.println("TITOLO: " + mensola[i].titolo +
                        "\nN° PAGINE: " + mensola[i].numeroPagine +
                        "\nTIPOLOGIA: " + mensola[i].tipologia + "\n");
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessun libro trovato per l'autore: " + autore);
        }
    }

    private static int ricercaTitolo(String parola, int contatore) {
        for (int i = 0; i < contatore; i++) {
            if (mensola[i].titolo.equals(parola)) {
                return i;
            }
        }
        return -1;
    }

    private static Libro[] findAll(String parola, int contatore){
        Libro[] titoloUguale = new Libro[contatore];
        int lunghezza = -1;
        for(int i = 0; i < contatore; i++){
            if(mensola[i].titolo.equals(parola)){
                titoloUguale[++lunghezza] = mensola[i];

            }
        }

        if(lunghezza != -1){
            return titoloUguale;
        } else {
            return null;
        }
    }
}
