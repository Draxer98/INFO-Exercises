package frontEnd;

public class Giocatore {
    private String Nome;
    private Dado dado;
    private int numeroVittorie = 0;
    private int bonusVittoria;
    private int roundDiFila;
    private int contatore;

    public Giocatore(String nome, int numeroFacce) {
        Nome = nome;
        dado = new Dado(numeroFacce);
        roundDiFila = 0;
        contatore = 0;
    }

    public void incrementaNumeroVittorie() {
        this.numeroVittorie++;
    }

    public void incrementaRoundFila() {
        if (contatore >= 0 && contatore < 3) {
            this.roundDiFila++;
        } else if(contatore == 3){
            incrementaNumeroVittorie();
            resetRoundDiFila();
        }
    }

    public int resetRoundDiFila() {
        return roundDiFila = 0;
    }

    public Dado getDado() {
        return dado;
    }

    public int getNumeroVittorie() {
        return numeroVittorie;
    }

    public String getNome() {
        return Nome;
    }

    public int getRoundDiFila() {
        return roundDiFila;
    }

    public String toPlayerString() {
        return String.format("nome:%s   valore Lancio;%s", getNome(), getDado());
    }

}