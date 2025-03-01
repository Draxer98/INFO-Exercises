public class Cubo extends Solido{

    private double lato;

    public Cubo(double lato) {
        super("Cubo");
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    @Override
    public double calcoloVolume(){
        return Math.pow(this.lato, 3);
    }

    @Override
    public double calcoloSuperficie(){
        return Math.pow(this.lato, 2);
    }
}
