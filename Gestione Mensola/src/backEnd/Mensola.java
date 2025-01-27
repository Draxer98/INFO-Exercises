package backEnd;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Mensola {
    public int numeroLibri;
    public int maxLibri;
    public ArrayList<Libro> mensola;

    public Mensola(int numeroLibri) {
        this.numeroLibri = numeroLibri;
    }

    public int getNumeroLibri() {
        return numeroLibri;
    }

    public void setNumeroLibri(int numeroLibri) {
        this.numeroLibri = numeroLibri;
    }

    public int getMaxLibri() {
        return maxLibri;
    }

    public void setMaxLibri(int maxLibri) {
        this.maxLibri = maxLibri;
    }

    public ArrayList<Libro> getMensola() {
        return mensola;
    }

    public void setMensola(ArrayList<Libro> mensola) {
        this.mensola = mensola;
    }

    @Override
    public String toString() {
        return "Mensola{" +
                "numeroLibri=" + numeroLibri +
                ", maxLibri=" + maxLibri +
                ", mensola=" + mensola +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensola mensola1 = (Mensola) o;
        return numeroLibri == mensola1.numeroLibri && maxLibri == mensola1.maxLibri && Objects.equals(mensola, mensola1.mensola);
    }

    public boolean checkSpace() {
        if (this.mensola.isEmpty())
            return true;
        else
            return false;
    }

    public void addLibro(Libro Libro) {
        this.mensola.add(Libro);
    }

    public void removeBook(Libro Libro) {
        this.mensola.remove(Libro);
    }

    public void containsBook(Libro Libro) {
        this.mensola.contains(Libro);
    }

    public void setInto(Libro Libro, int posizione, Scanner keyboard) {

    }

    public ArrayList<Libro> getVolumi() {
        System.out.println(this.mensola);

        return this.mensola;
    }

    public boolean isEmpty() {
        if (this.mensola.isEmpty())
            return true;
        else
            return false;
    }

    public void findLibro(Libro Libro) {
        System.out.println(this.mensola.contains(Libro));
    }
}