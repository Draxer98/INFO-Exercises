public abstract class Solido {
    protected String nome;

    public Solido(String nome) {
        this.nome = nome;
    }

    public abstract double calcoloVolume();

    public abstract double calcoloSuperficie();

    @Override
    public String toString() {
        return String.format("%s\tVolume: %.2f cm3\tSuperficie: %.2f cm2", nome, calcoloVolume(), calcoloSuperficie());
    }
}
