package frontEnd;

import java.util.Random;

public class Dado {
    private int nFacce;
    private int valFaccia;
    private Random valLancio;

    public Dado() {
        this.nFacce = 6;
        this.valLancio = new Random();
    }

    public int getnFacce() {
        return nFacce;
    }

    public void setnFacce(int nFacce) {
        this.nFacce = nFacce;
    }

    public Random getValLancio() {
        return valLancio;
    }

    public void setValLancio(Random valLancio) {
        this.valLancio = valLancio;
    }

    public int getValFaccia() {
        return valFaccia;
    }

    public void setValFaccia(int valFaccia) {
        this.valFaccia = valFaccia;
    }

    public int Lancia() {
        this.valFaccia = valLancio.nextInt(nFacce) + 1;
        return valFaccia;
    }
}