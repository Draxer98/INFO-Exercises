package frontEnd;

public class Partita {
    public Partita() {
    }

    public String Winner(Giocatore g) {
        return g.nome;
    }

    public String Round(int round, Giocatore G1, Giocatore G2, Dado dado) {
        String vincitore = "Pareggio";

        for (int i = 0; i < round; i++) {
            G1.numeroDado = dado.Lancia();
            G2.numeroDado = dado.Lancia();

            if (G1.numeroDado > G2.numeroDado) {
                G1.vittorie++;
            } else {
                G2.vittorie++;
            }
        }

        if (G1.vittorie > G2.vittorie) {
            vincitore = Winner(G1);
        } else if (G2.vittorie > G1.vittorie) {
            vincitore = Winner(G2);
        } else {

        }

        return vincitore;
    }

    public void ResetGame(Giocatore g1, Giocatore g2)// resetta la partita
    {
        g1.vittorie = 0;
        g2.vittorie = 0;
    }
}
