package frontEnd;

import backEnd.Genere;
import backEnd.Libro;

import java.util.ArrayList;
import java.util.Scanner;

import static backEnd.Tools.Menu;

public class FrontEnd {
    public static Libro Inserimento(ArrayList<Libro> mensola, Scanner keyboard) {
        Libro output = new Libro();
        boolean verifica;
        do {
            verifica = false;
            System.out.println("Inserisci l'auotore: ");
            output.autore = keyboard.nextLine();
            for (int i = mensola.size() - 1; i >= 0; i--) {
                if (mensola.get(i).titolo.equals(output.autore)) {
                    System.out.println("Autore già esistente, riprova");
                    verifica = true;
                }
            }
        } while (verifica);
        System.out.println("Inserisci il titolo: ");
        output.titolo = keyboard.nextLine();

        System.out.println("Inserisci il numero di pagine: ");
        output.nPagine = keyboard.nextInt();
        output.getCostoPagine(output);
        keyboard.nextLine();

        Genere[] generi = Genere.values();
        String[] menuData = new String[generi.length + 1];
        menuData[0] = "Genere";
        for (int i = 0; i < generi.length; i++) {
            menuData[i + 1] = generi[i].toString();
        }
        int genereIndex = (Menu(menuData, keyboard) - 1);
        output.tipo = generi[genereIndex];

        return output;
    }

    public static void Visualizzazione(ArrayList<Libro> mensola) {
        if (mensola.isEmpty()) {
            System.out.println("Mensola Vuota");
        } else {
            for (Libro i : mensola) {
                System.out.println(i);
            }
        }
    }

    public static void Elimina(ArrayList<Libro> mensola, Scanner keyboard) {
        System.out.println("Inserisci il Titolo: ");
        String titoloDaEliminare = keyboard.nextLine();
        boolean verifica = false;
        for (int i = mensola.size() - 1; i >= 0; i--) {
            if (mensola.get(i).titolo.equals(titoloDaEliminare)) {
                mensola.remove(i);
                verifica = true;
            }
        }
        if (!verifica) {
            System.out.println("Il titolo inserito non esiste nella mensola");
        }
    }

    public static void ModificaTitolo(ArrayList<Libro> mensola, Scanner keyboard) {
        Libro libroDaModificare = new Libro();
        System.out.println("Inserisci il titolo");
        String titoloModificare = keyboard.nextLine();
        boolean verifica = false;
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).titolo.equals(titoloModificare)) {
                System.out.println("Inserisci nuovo titolo");
                libroDaModificare.titolo = keyboard.nextLine();
                mensola.get(i).titolo = libroDaModificare.titolo;
                verifica = true;
            }
        }
        if (!verifica) {
            System.out.println("Il titolo inserito non esiste nella mensola");
        }
    }
}
