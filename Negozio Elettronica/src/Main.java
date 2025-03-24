import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestioneProdotti negozio = new GestioneProdotti();

        String[] opzioni = {
                "NEGOZIO DI ELETTRONICA",
                "Inserisci Prodotto",
                "Cerca Prodotto",
                "Aggiorna Prezzo",
                "Rimuovi Prodotto",
                "Visualizza Prodotti",
                "Esci"
        };

        boolean esci = false;

        while (!esci) {
            int scelta = Tools.menu(opzioni, scanner);
            try {
                switch (scelta) {
                    case 1:
                        negozio.aggiungiProdotto(Tools.inserimento());
                        break;
                    case 2:
                        System.out.println("Inserisci codice prodotto: ");
                        int codiceRicerca = scanner.nextInt();
                        System.out.println(negozio.cercaProdotto(codiceRicerca));
                        break;
                    case 3:
                        System.out.println("Inserisci codice prodotto: ");
                        int codiceAggiorna = scanner.nextInt();
                        System.out.println("Inserisci nuovo prezzo: ");
                        double nuovoPrezzo = scanner.nextDouble();
                        negozio.aggiornaPrezzo(codiceAggiorna, nuovoPrezzo);
                        break;
                    case 4:
                        System.out.println("Inserisci codice prodotto: ");
                        int codiceRimuovi = scanner.nextInt();
                        negozio.rimuoviProdotto(codiceRimuovi);
                        break;
                    case 5:
                        negozio.visualizzaProdotti();
                        break;
                    case 6:
                        esci = true;
                        break;
                    default:
                        System.out.println("Opzione non valida!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
