package backEnd;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Mensola {
    private int massimoLibri;
    private final int MAXLIBRI = 3;
    private ArrayList<Libro> mensola;

    public Mensola(ArrayList<Libro> mensola) {
        this.mensola = mensola;
        this.massimoLibri = 0;
    }

    public ArrayList<Libro> getMensola() {
        return mensola;
    }

    public void setMensola(ArrayList<Libro> mensola) {
        this.mensola = mensola;
    }

    public int getMassimoLibri() {
        return massimoLibri;
    }

    public void setMassimoLibri(int massimoLibri) {
        this.massimoLibri = massimoLibri;
    }

    public void inserimento() throws Exception {
        Scanner keyboard = new Scanner(System.in);

        if (massimoLibri != MAXLIBRI) {
            mensola.add(Tools.leggiLibro(keyboard));
            massimoLibri++;
        } else {
            throw new Exception("Mensola Piena");
        }

    }

    public void visualizza() throws Exception {
        if (massimoLibri != 0) {
            for (Libro l : mensola) {
                System.out.println(l);
            }
        } else {
            throw new Exception("Mensola vuota");
        }
    }

    public void Remove(String titolo, String autore) throws Exception {
        boolean trova = false;
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).getTitolo().equals(titolo) && mensola.get(i).getAutore().equals(autore)) {
                mensola.remove(i);
                massimoLibri--;
                trova = true;
                break;
            }
        }
        if (!true) {
            throw new Exception("Libro non trovato");
        }
    }

    public void Modifica(String titolo, String autore, Scanner keyboard) throws Exception {
        boolean trova = false;
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).getAutore().equals(autore) && mensola.get(i).getTitolo().equals(titolo)) {
                System.out.println("Inserisci nuovo autore: ");
                String nuovoAutore = keyboard.nextLine();
                System.out.println("Inserisci nuovo titolo: ");
                String nuovoTitolo = keyboard.nextLine();

                mensola.get(i).setAutore(nuovoAutore);
                mensola.get(i).setTitolo(nuovoTitolo);

                trova = true;
                break;
            }
        }
        if (!true) {
            throw new Exception("Libro non trovato");
        }
    }

    @Override
    public String toString() {
        return String.format("%s", mensola);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mensola mensola1 = (Mensola) o;
        return Objects.equals(mensola, mensola1.mensola);
    }
}
