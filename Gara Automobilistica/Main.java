import util.Tools;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mainMenu = {
                "GARA AUTOMOBILISTICA",
                "Inserisci pilota",
                "Crea Gara",
                "Esci"
        };

        ArrayList<Pilota> piloti = new ArrayList<>();
        ArrayList<Gara> gare = new ArrayList<>();
        boolean exit = true;

        do {
            switch (Tools.menu(mainMenu, scanner)) {
                case 1: {
                    Pilota nuovoPilota = FrontEnd.getPilota(scanner);

                    if (piloti.contains(nuovoPilota)) {
                        System.out.println("Il pilota esiste già. I dati sono stati scartati.");
                        break;
                    }

                    piloti.add(nuovoPilota);
                    break;
                }
                case 2: {
                    System.out.println("Crea una nuova gara.");
                    System.out.println("Inserisci nome della gara: ");
                    String nomeGara = scanner.nextLine();

                    Gara nuovaGara = new Gara(nomeGara);
                    gare.add(nuovaGara);

                    System.out.println("Aggiungi auto alla gara. Inserisci il numero di auto da aggiungere: ");
                    int numAuto = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numAuto; i++) {
                        System.out.println("Seleziona il pilota per l'auto #" + (i + 1));
                        Pilota pilota = piloti.get(Tools.menuGara(piloti.stream().map(Pilota::getNome).toArray(String[]::new), scanner) - 1);
                        System.out.println("Inserisci la scuderia: ");
                        String scuderia = scanner.nextLine();
                        System.out.println("Inserisci la cilindrata dell'auto: ");
                        int cilindrata = Integer.parseInt(scanner.nextLine());
                        Auto auto = new Auto(scuderia, pilota, cilindrata);
                            nuovaGara.aggiungiAuto(auto);
                    }

                    nuovaGara.corriGara();
                    break;
                }
                default: {
                    exit = false;
                }
            }
        } while (exit);
    }
}
