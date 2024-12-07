package util;

import java.util.Scanner;

public class Tools {
    private Tools() {}

    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void wait(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int menu(String[] options, Scanner scanner) {
        int scelta;

        do {
            for (int i = 0; i < options[0].length(); i++) {
                System.out.print("-");
            }
            System.out.println();

            System.out.println(options[0]);

            for (int i = 0; i < options[0].length(); i++) {
                System.out.print("-");
            }
            System.out.println();

            for (int i = 1; i < options.length; i++) {
                System.out.println("[" + i + "]" + " " + options[i]);
            }

            try {
                scelta = (Integer.parseInt(scanner.nextLine()));
            } catch (Exception e) {
                System.out.println("Valore invalido");
                return -1;
            }

            if ((scelta < 1) || (scelta > options.length - 1)) {
                System.out.println("Opzione Sbagliata");
            }
        }
        while ((scelta < 1) || (scelta > options.length - 1));

        return scelta;
    }

    public static int menuGara(String[] options, Scanner scanner) {
        int scelta2;

        do {
            for (int i = 0; i < options[0].length(); i++) {
                System.out.print("-");
            }
            System.out.println();

            System.out.println("Gara");

            for (int i = 0; i < options[0].length(); i++) {
                System.out.print("-");
            }
            System.out.println();

            for (int i = 0; i < options.length; i++) {
                int contatore = i;
                System.out.println("[" + (++contatore) + "]" + " " + options[i]);
            }

            try {
                scelta2 = (Integer.parseInt(scanner.nextLine()));
            } catch (Exception e) {
                System.out.println("Valore invalido");
                return -1;
            }

            if ((scelta2 < 0) || (scelta2 > options.length - 1)) {
                System.out.println("Opzione Sbagliata");
            }
        }
        while ((scelta2 < 0) || (scelta2 > options.length - 1));

        return scelta2;
    }

}
