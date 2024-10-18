package frontScreen;

import mensola.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static utility.Tools.menu;

public class FrontEnd {
    public static Libro leggiLibro(Scanner keyboard) {
        final int MAX = 20;
        //Istanziamento libro
        Libro output = new Libro();
        boolean errore;

        do {
            try {
                keyboard.nextLine();
                errore = false;
                //Inserimento autore
                System.out.println("Inserire l'autore: ");
                output.autore = keyboard.nextLine();
                //Inserimento titolo
                System.out.println("Inserire il titolo: ");
                output.titolo = keyboard.nextLine();
                //Inserimento numero di pagine
                System.out.println("Inserire il numero di pagine");
                output.numeroPagine = keyboard.nextInt();
                //Inserimento tipologia
                Genere[] generi = Genere.values();
                String[] menuData = new String[generi.length + 1];
                menuData[0] = "Inserire genere";
                for (int i = 0; i < generi.length; i++)
                    menuData[i + 1] = generi[i].toString();
                int genereIndex = (menu(menuData, keyboard) - 1);
                output.tipologia = generi[genereIndex];
                /*Inserimento data
                System.out.print("Inserire data> ");
                String dataInput = keyboard.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                output.dataPubblicazione = LocalDate.parse(dataInput, formatter);*/
            } catch (Exception e) {
                System.out.println(e.getMessage());
                errore = true;
            }
        } while (errore);

        return output;
    }
}
