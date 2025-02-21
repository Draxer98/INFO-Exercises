import backEnd.Libro;
import backEnd.Mensola;
import frontEnd.Tools;

import java.util.ArrayList;
import java.util.Scanner;

import static frontEnd.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Mensola mensola = new Mensola(3);
        String[] opzioni = {"Mensola", "Inserimento", "Visualizzazione", "Fine"};
        boolean fine = false;

        do {
            switch (Menu(opzioni, keyboard)) {
                case 1:
                    try {
                        mensola.addLibro(leggiGenere(keyboard));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    try {
                        Tools.visualizzaMensola(mensola.getLista());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    fine = true;
                    break;
            }
        } while (!fine);
    }
}
