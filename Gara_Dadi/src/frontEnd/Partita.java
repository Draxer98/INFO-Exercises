package frontEnd;


public class Gara {
    private int nRound;
    private int roundAttuale = 0;
    private String vincitore;
    private Giocatore[] giocatori;
    private String statoParita = "";

    public Gara(String nomeGiocatore1, String nomeGiocatore2, int numeroRound) {
        giocatori = new Giocatore[2];
        giocatori[0] = new Giocatore(nomeGiocatore1, 6);
        giocatori[1] = new Giocatore(nomeGiocatore2, 6);
        this.nRound = numeroRound;
    }

    public String giocaRound() {
        String esito = "Round minimi richiesti: 3";
        if (nRound >= 3) {
            if (roundAttuale < nRound) {
                roundAttuale++;
                giocatori[0].getDado().Lancia();
                giocatori[1].getDado().Lancia();
                esito = String.format("%s: %d %s: %d", giocatori[0].getNome(), giocatori[0].getDado().getValoreLancio(), giocatori[1].getNome(), giocatori[1].getDado().getValoreLancio());
                if (giocatori[1].getDado().getValoreLancio() > giocatori[0].getDado().getValoreLancio()) {
                    giocatori[1].incrementaNumeroVittorie();
                    esito += (" Vincitore round " + giocatori[1].getNome());
                } else if (giocatori[1].getDado().getValoreLancio() < giocatori[0].getDado().getValoreLancio()) {
                    giocatori[0].incrementaNumeroVittorie();
                    esito += (" Vincitore round " + giocatori[0].getNome());
                } else {
                    giocatori[1].incrementaNumeroVittorie();
                    giocatori[0].incrementaNumeroVittorie();
                    esito += (" PAREGGIO");
                }
            }
            statoParita = StatoPartita();
        }

        return esito;
    }

    public String Winner() {
        String vincitore = "";
        if (roundAttuale == nRound) {
            if (giocatori[0].getNumeroVittorie() > giocatori[1].getNumeroVittorie())
                vincitore = String.format("Ha vinto la partita ") + giocatori[0].getNome();
            else if (giocatori[1].getNumeroVittorie() > giocatori[0].getNumeroVittorie())
                vincitore = String.format("Ha vinto la partita ") + giocatori[1].getNome();
            else
                vincitore = String.format("I due giocatori hanno pareggiato la partita");
        }
        return vincitore;
    }

    public String StatoPartita() {
        if (roundAttuale < nRound) {
            statoParita = "In corso";
        } else if (nRound == 0) {
            statoParita = "Da iniziare";
        } else {
            statoParita = "Conclusa";
        }
        return statoParita;
    }
}
