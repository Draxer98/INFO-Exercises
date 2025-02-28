package frontEnd;


import java.util.Random;

public class Dado {
    private Random random;
    private int NumeroFacce;
    private int valoreLancio = 0;

    public Dado(int numeroFacce) {
        NumeroFacce = numeroFacce;
        random = new Random();
    }

    public Dado() {
    }

    public void Lancia() {
        valoreLancio = random.nextInt(1, NumeroFacce + 1);
    }

    public int getNumeroFacce() {
        return NumeroFacce;
    }

    public int getValoreLancio() {
        return valoreLancio;
    }

    @Override
    public String toString() {
        return String.format("Valore dado:%d", getValoreLancio());
    }

    public String toExtendedString() {
        return String.format("Numero facce dado:%d  Valore dado:%d", getNumeroFacce(), getValoreLancio());
    }

}
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
