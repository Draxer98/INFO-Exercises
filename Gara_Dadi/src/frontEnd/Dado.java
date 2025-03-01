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