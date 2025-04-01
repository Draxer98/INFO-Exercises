import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestioneProdotti negozio = new GestioneProdotti();
        GestioneLibri libri = new GestioneLibri();
        Libro manuale = new Manuale(1001, 10, "Matt Halmmer", "Tutto + 1", 12, "Il funzionamento del Samsung S20");
        ProdottoElettronico cellulare = new Smartphone(101, "Samsung", 800, "S20", 512);
        String[] opzioni = {
                "NEGOZIO DI ELETTRONICA",
                "Inserisci Prodotto",
                "Visualizza Prodotti",
                "Inserisci Libri",
                "Visualizza libri",
                "Esci"
        };

        boolean esci = false;

        while (!esci) {
            int scelta = Tools.menu(opzioni, scanner);
            try {
                switch (scelta) {
                    case 1:
                        negozio.aggiungiProdotto(cellulare);
                        break;
                    case 2:
                        negozio.visualizza();
                        break;
                    case 3:
                        libri.aggiungiLibro(manuale);
                        break;
                    case 4:
                        libri.visualizza();
                        break;
                    case 5:
                        esci = true;
                        break;
                    default:
                        System.out.println("Opzione non valida!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
