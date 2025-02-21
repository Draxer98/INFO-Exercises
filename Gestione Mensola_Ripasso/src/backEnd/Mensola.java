package backEnd;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensola {

    public Scanner keyboard = new Scanner(System.in);
    private int numeroLibri;
    private int maxLibri;
    private ArrayList<Libro> mensola;

    public Mensola(int maxLibri) {

        this.maxLibri = maxLibri;
        mensola = new ArrayList<>(maxLibri);

    }

    public int getNumeroLibri() {
        return numeroLibri;
    }

    public ArrayList<Libro> getMensola() {
        return mensola;
    }

    public Mensola() {

    }

    public ArrayList<Libro> getLista() {

        ArrayList<Libro> copiaLista = new ArrayList<>();
        for (Libro l : mensola) {
            copiaLista.add(l);
        }

        return copiaLista;

    }

    public boolean findLibro(Libro lib) {
        boolean trovato;
        trovato = mensola.contains(lib);
        return trovato;

    }

    public boolean isFull() {
        return (numeroLibri == maxLibri);

    }

    public void addLibro(Libro lib) throws Exception {

        if (isFull())
            throw new Exception("La mensola è piena");

        else {
            if (lib != null && !findLibro(lib)) {
                mensola.add(lib);
                numeroLibri++;
            } else {
                throw new Exception("Il libro è gia presente o riferimento nullo");
            }
        }

    }
}