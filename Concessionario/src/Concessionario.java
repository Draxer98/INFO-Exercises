import java.util.ArrayList;

public class Concessionario {
    private ArrayList<Auto> array;

    public Concessionario() {
        this.array = new ArrayList<>();
    }

    public ArrayList<Auto> getConcessionario() {
        return array;
    }

    public void setConcessionario(ArrayList<Auto> concessionario) {
        this.array = concessionario;
    }

    public void addAuto(Auto auto){
        array.add(auto);
    }

    public void visualizza(){
        array.forEach(x -> System.out.println(x));
    }

    public void visualizzaAnnoImmatricolazione(int annoImmatricolazine) {
        array.forEach(x -> {if(x.getAnnoImmatricolazione() == annoImmatricolazine){
            System.out.println(x);
            };
        });
    }

    public Auto ricercaMarca(Auto marca){
        Auto[] array = new Auto[1];
        array[0] = null;
        this.array.forEach(x -> {if(x.equals(marca)){array[0] = x;}});
        return array[0];
    }

    public double calcolaValoreAttuale() {
        int annoCorrente = 2025;
        double[] array = new double[1];
        array[0] = 0;
        this.array.forEach(x -> {
            int anniTrascorsi = annoCorrente - x.getAnnoImmatricolazione();
            array[0] = x.getPrezzo() * Math.pow(0.95, anniTrascorsi);
        });

        return array[0];
    }

}
