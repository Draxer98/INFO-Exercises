public class Automobile {
    private String nome;
    private boolean vip;
    private boolean gpl;
    private double potenza;
    private double costo;

    public Automobile(String nome, boolean vip, double costo, double potenza, boolean gpl) {
        this.nome = nome;
        this.vip = vip;
        this.costo = costo;
        this.potenza = potenza;
        this.gpl = gpl;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public boolean isGpl() {
        return gpl;
    }

    public void setGpl(boolean gpl) {
        this.gpl = gpl;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return String.format("%s", nome);
    }
}
