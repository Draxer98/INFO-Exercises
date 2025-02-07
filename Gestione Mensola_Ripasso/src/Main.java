import backEnd.Libro;
import backEnd.Mensola;

import java.util.ArrayList;
import java.util.Scanner;

import static backEnd.Tools.Menu;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Libro> libri = new ArrayList<>();
        Mensola mensola = new Mensola(libri);
        String[] opzioni = {"Mensola", "Inserimento", "Visualizzazione", "Remove", "Modifica", "Fine"};
        boolean fine = false;

        do {
            switch (Menu(opzioni, keyboard)) {
                case 1:
                    try {
                        mensola.inserimento();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    try {
                        mensola.visualizza();
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Inserisci titolo: ");
                    String titoloRimosso = keyboard.nextLine();
                    System.out.println("Inserisci autore: ");
                    String autoreRimosso = keyboard.nextLine();
                    try {
                        mensola.Remove(titoloRimosso, autoreRimosso);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println("Inserisci titolo: ");
                    String titoloModifica = keyboard.nextLine();
                    System.out.println("Inserisci autore: ");
                    String autoreModifica = keyboard.nextLine();
                    try{
                        mensola.Modifica(titoloModifica, autoreModifica, keyboard);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    fine = true;
                    break;
            }
        } while (!fine);
    }
}
