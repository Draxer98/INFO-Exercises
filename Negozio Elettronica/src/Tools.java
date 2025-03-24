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

    public static int menu(String[] options, Scanner scanner) {// parametri formali
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
                scelta = (Integer.parseInt(scanner.next()));
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

    public static Smartphone inserimento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il codice del prodotto: ");
        int codiceProdotto = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci la marca del prodotto: ");
        String marca = scanner.nextLine();
        System.out.println("Inserisci il modello del prodotto: ");
        String modello = scanner.nextLine();
        System.out.println("Inserisci la memoria del prodotto: ");
        int memoria = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il prezzo del prodotto: ");
        double prezzo = Double.parseDouble(scanner.nextLine());

        return new Smartphone(codiceProdotto, marca, prezzo, modello, memoria);
    }
}
