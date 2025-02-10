package frontEnd;

public class Giocatore {
    String nome;
    int vittorie;
    int numeroDado;

    public Giocatore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public int getNumeroDado() {
        return numeroDado;
    }

    public void setNumeroDado(int numeroDado) {
        this.numeroDado = numeroDado;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome = '" + nome + '\'' +
                ", vittorie = " + vittorie +
                '}';
    }
}
