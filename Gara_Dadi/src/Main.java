/*
 * PARTITa AVANZATA:
 * MIN 3 round
 * Ogni 3 round vinti di fila dallo stesso giocatore: BONUS vincita
 * Parita -> si resetta bonus vincita
 * Comunicare il bonus vincita
 * Eseguire confronti tra dado e giocatore con comparable
 * Possibilità di utilizzare sia partita base che avanzata
 * Utilizzando il polimorfismo comunicare il tipo di partita che stiamo utilizzando (istance of)
 * */

import frontEnd.Gara;
import frontEnd.GaraAvanzata;
import frontEnd.Giocatore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nRound;
        
        System.out.println("Nome giocatore 1: ");
        String nome1 = keyboard.nextLine();
        System.out.println("Nome giocatore 2: ");
        String nome2 = keyboard.nextLine();

        System.out.println("Gara Base o Gara Avanzata: ");
        System.out.println("1 - Gara Base");
        System.out.println("2 - Gara Avanzata");
        int sceltaGara = Integer.parseInt((keyboard.nextLine()));
        do{
            System.out.println("Quanti round si desidera effettuare: ");
            nRound = Integer.parseInt(keyboard.nextLine());
        } while(nRound < 3 && sceltaGara == 2);

        if(sceltaGara == 1) {
            Gara gara = new Gara(nome1, nome2, nRound);

            do {
                System.out.println(gara.StatoPartita());
                System.out.println(gara.giocaRound());
            } while (gara.StatoPartita().equals("In corso"));
            System.out.println(gara.Winner());
        } else {
            GaraAvanzata garaAvanzata = new GaraAvanzata(nome1, nome2, nRound);

            do {
                System.out.println(garaAvanzata.StatoPartita());
                System.out.println(garaAvanzata.giocaRound());
            } while (garaAvanzata.StatoPartita().equals("In corso"));
            System.out.println(garaAvanzata.Winner());
        }
    }
}