import frontEnd.Dado;
import frontEnd.Giocatore;
import frontEnd.Partita;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dado dado = new Dado();
        Partita partita = new Partita();
        System.out.println("Inserisci il nome G1: ");
        String nomeG1 = scanner.nextLine();
        Giocatore G1 = new Giocatore(nomeG1);

        System.out.println("Inserisci il nome G2: ");
        String nomeG2 = scanner.nextLine();
        Giocatore G2 = new Giocatore(nomeG2);

        System.out.println("Quanti round vuoi fare: ");
        int round = Integer.parseInt(scanner.nextLine());

        String vincitore = partita.Round(round, G1, G2, dado);

        System.out.println("Il vincitore è: " + vincitore);
        System.out.println(G1);
        System.out.println(G2);

        partita.ResetGame(G1, G2);
    }
}
