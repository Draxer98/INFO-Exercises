import java.util.ArrayList;

public class Gara {
    private String nome;
    private ArrayList<Auto> autoInGara;
    private String risultato;

    public Gara(String nome) {
        this.nome = nome;
        this.autoInGara = new ArrayList<>();
        this.risultato = "";
    }

    public void aggiungiAuto(Auto auto) {
        autoInGara.add(auto);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Auto> getAutoInGara() {
        return autoInGara;
    }

    public String getRisultato() {
        return risultato;
    }

    public void corriGara() {
        if (autoInGara.isEmpty()) {
            System.out.println("Non ci sono auto in gara!");
            return;
        }

        Auto vincitore = autoInGara.get(0);
        for (Auto auto : autoInGara) {
            if (auto.getCilindratra() > vincitore.getCilindratra()) {
                vincitore = auto;
            }
        }

        risultato = vincitore.getPilota().getNome() + " " + vincitore.getPilota().getCognome();
        System.out.println("Il vincitore della gara " + nome + " è: " + risultato);
    }
}
