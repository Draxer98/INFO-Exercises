import java.util.ArrayList;
import java.util.List;

public class GestioneProdotti {
    private ArrayList<ProdottoElettronico> prodotti;

    public GestioneProdotti() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(ProdottoElettronico prodotto) {
        if (prodotti.stream().anyMatch(p -> p.getCodice() == prodotto.getCodice())) {
            System.out.println("Errore: Prodotto con codice " + prodotto.getCodice() + " già esistente!");
            return;
        }
        prodotti.add(prodotto);
    }

    public ProdottoElettronico cercaProdotto(int codice) {
        return prodotti.stream()
                .filter(p -> p.getCodice() == codice)
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Errore: Prodotto con codice " + codice + " non trovato!");
                    return null;
                });
    }

    public void aggiornaPrezzo(int codice, double nuovoPrezzo) {
        ProdottoElettronico prodotto = cercaProdotto(codice);
        if (prodotto != null) {
            prodotto.setPrezzo(nuovoPrezzo);
        } else {
            System.out.println("Impossibile aggiornare: prodotto con codice " + codice + " non trovato!");
        }
    }

    public void rimuoviProdotto(int codice) {
        ProdottoElettronico prodotto = cercaProdotto(codice);
        if (prodotto != null) {
            prodotti.remove(prodotto);
        } else {
            System.out.println("Errore: Impossibile rimuovere, prodotto con codice " + codice + " non trovato!");
        }
    }

    public void visualizzaProdotti() {
        if (prodotti.isEmpty()) {
            System.out.println("Non ci sono prodotti disponibili.");
        } else {
            prodotti.forEach(System.out::println);
        }
    }
}
