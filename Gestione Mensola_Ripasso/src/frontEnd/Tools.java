package frontEnd;

import backEnd.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Tools {

    private Tools() {
    }

    ; //impedisce di istanziare la classe

    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int Menu(String opzioni[], Scanner tastiera) {// parametri formali
        int scelta;

        do {
            clrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println("[" + i + "]" + " " + opzioni[i]);
            }
            scelta = (Integer.parseInt(tastiera.nextLine()));
            if ((scelta < 1) || (scelta > opzioni.length - 1)) {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1) || (scelta > opzioni.length - 1));
        return scelta;
    }

    public static Libro leggiGenere(Scanner tastiera) {
        Genere[] tipoGenere = Genere.values();
        String[] sceltaGenere = {"GENERE", "ROMANZO", "MANUALE", "THRILLER"};

        System.out.println("Inserisci il genere del libro: ");
        int scelta = Menu(sceltaGenere, tastiera); // visto che Menu parte da indice 1

        Libro libroComune = leggiLibro(tastiera);

        switch (scelta) {
            case 1: // ROMANZO
                System.out.print("Inserisci il genere letterario: ");
                String genereLetterario = tastiera.nextLine();
                return new Romanzo(libroComune.getAutore(), libroComune.getTitolo(), libroComune.getnPagine(), genereLetterario);
            case 2: // MANUALE
                Livello[] tipoLivello = Livello.values();
                String[] sceltaLivello = {"LIVELLO", "BASE", "MEDIO", "AVANZATO"};

                System.out.print("Inserisci l'argomento del manuale: ");
                String argomento = tastiera.nextLine();
                System.out.println("Inserisci il livello del manuale: ");
                Livello livello = tipoLivello[Menu(sceltaLivello, tastiera) - 1];
                return new Manuale(libroComune.getAutore(), libroComune.getTitolo(), libroComune.getnPagine(), argomento, livello);
            case 3: // THRILLER
                GenereThriller[] tipoGenereThriller = GenereThriller.values();
                String[] sceltaGenereThriller = {"GENERE", "FANTASTICO", "HORROR", "SERIE TV"};

                System.out.println("Inserisci il genere di thriller: ");
                GenereThriller genereThriller = tipoGenereThriller[Menu(sceltaGenereThriller, tastiera) - 1];
                return new Thriller(libroComune.getAutore(), libroComune.getTitolo(), libroComune.getnPagine(), genereThriller);
            default:
                return libroComune;
        }
    }

    public static Libro leggiLibro(Scanner tastiera) {
        System.out.print("Inserisci l'autore del libro: ");
        String autore = tastiera.nextLine();
        System.out.print("Inserisci il titolo del libro: ");
        String titolo = tastiera.nextLine();
        System.out.print("Inserisci il numero di pagine del libro: ");
        int nPagine = Integer.parseInt(tastiera.nextLine());

        return new Libro(autore, titolo, nPagine);
    }

    public void visualizzaLibri(ArrayList<Libro> mensola) {
        mensola.forEach(System.out::println);
    }

    public static void visualizzaMensola(ArrayList<Libro> volumi) {
        for (Libro l : volumi) {
            System.out.println(l.toString());
        }
    }
}