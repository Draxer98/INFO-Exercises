import garaAutomobilistica.util.Tools;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mainMenu = {
                "GARA AUTOMOBILISTICA",
                "Inserisci pilota",
                "Esci"
        };

        ArrayList<Pilota> piloti = new ArrayList<>();
        boolean exit = true;

        do {
            switch (Tools.menu(mainMenu, scanner)) {
                case 1 : {
                    Pilota nuovoPilota = FrontEnd.getPilota(scanner);

                    if (piloti.contains(nuovoPilota)) {
                        System.out.println("Il pilota esiste gia'. I dati sono stati scartati.");
                        break;
                    }

                    piloti.add(nuovoPilota);
                }
                default : {
                    exit = false;
                }
            }
        } while (exit);
    }
}