import frontEnd.Gara;
import frontEnd.Giocatore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nome giocatore 1: ");
        String nome1 = keyboard.nextLine();
        System.out.println("Nome giocatore 2: ");
        String nome2 = keyboard.nextLine();
        System.out.println("Quanti round si desidera effettuare: ");
        int nRound = Integer.parseInt(keyboard.nextLine());

        Gara gara = new Gara(nome1, nome2, nRound);

        do {
            System.out.println(gara.StatoPartita());
            System.out.println(gara.giocaRound());
            if (gara.giocaRound().equals("Round minimi richiesti: 3")) {
                break;
            }
        } while (gara.StatoPartita().equals("In corso"));
        System.out.println(gara.Winner());
    }
}
