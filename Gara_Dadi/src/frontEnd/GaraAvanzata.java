package frontEnd;

public class GaraAvanzata extends Gara{

    public GaraAvanzata(String nomeGiocatore1, String nomeGiocatore2, int numeroRound) {
        super(nomeGiocatore1, nomeGiocatore2, numeroRound);
    }

    public String giocaRound() {
        String esito = "";
        if (roundAttuale < nRound) {
            roundAttuale++;
            giocatori[0].getDado().Lancia();
            giocatori[1].getDado().Lancia();
            esito = String.format("%s: %d %s: %d", giocatori[0].getNome(), giocatori[0].getDado().getValoreLancio(), giocatori[1].getNome(), giocatori[1].getDado().getValoreLancio());
            if (giocatori[1].getDado().getValoreLancio() > giocatori[0].getDado().getValoreLancio()) {
                giocatori[1].incrementaNumeroVittorie();
                if (giocatori[0].getRoundDiFila() > 0) {
                    giocatori[0].resetRoundDiFila();
                }
                giocatori[1].incrementaRoundFila();

                if (giocatori[1].getRoundDiFila() == 3) {
                    System.out.println("BONUS VINCITA");
                }
                esito += (" Vincitore round " + giocatori[1].getNome());
            } else if (giocatori[1].getDado().getValoreLancio() < giocatori[0].getDado().getValoreLancio()) {
                giocatori[0].incrementaNumeroVittorie();
                if (giocatori[1].getRoundDiFila() > 0) {
                    giocatori[1].resetRoundDiFila();
                }
                giocatori[0].incrementaRoundFila();

                if (giocatori[0].getRoundDiFila() == 3) {
                    System.out.println("BONUS VINCITA");
                }
                esito += (" Vincitore round " + giocatori[0].getNome());
            } else {
                giocatori[1].incrementaNumeroVittorie();
                giocatori[0].incrementaNumeroVittorie();
                esito += (" PAREGGIO");
            }
        }
        statoParita = StatoPartita();

        return esito;
    }

}
