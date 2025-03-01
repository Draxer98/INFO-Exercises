import java.util.ArrayList;

public class GestoreSolidi {
    private ArrayList<Solido> solidi;

    public GestoreSolidi() {
        this.solidi = new ArrayList<Solido>();
    }

    public void add(Solido s) {
        solidi.add(s);
    }

    public void visualizza() {
        for(Solido s : solidi){
            System.out.println(s);
        }
    }
}
