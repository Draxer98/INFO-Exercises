import java.util.ArrayList;

public class Parcheggio {
    private Automobile[] parcheggioCoperto;
    private ArrayList<Automobile> parcheggioAperto;

    public Parcheggio() {
        this.parcheggioCoperto = new Automobile[9];
        this.parcheggioAperto = new ArrayList<Automobile>();
    }

    public Automobile[] getParcheggioCoperto() {
        return parcheggioCoperto;
    }

    public void setParcheggioCoperto(Automobile[] parcheggioCoperto) {
        this.parcheggioCoperto = parcheggioCoperto;
    }

    public ArrayList<Automobile> getParcheggioAperto() {
        return parcheggioAperto;
    }

    public void setParcheggioAperto(ArrayList<Automobile> parcheggioAperto) {
        this.parcheggioAperto = parcheggioAperto;
    }

    public void AggiungiAutomobile(Automobile automobile) {
        boolean aggiunto = false;

        for (int i = 0; i < parcheggioCoperto.length; i++) {
            if (parcheggioCoperto[i] == null && !automobile.isGpl()) {
                parcheggioCoperto[i] = automobile;
                aggiunto = true;
                break;
            }
        }

        if (!aggiunto) {
            for (int i = 0; i < parcheggioCoperto.length; i++) {
                if (parcheggioCoperto[i] != null && !parcheggioCoperto[i].isVip()) {
                    parcheggioAperto.add(parcheggioCoperto[i]);
                    parcheggioCoperto[i] = automobile;
                    aggiunto = true;
                    break;
                }
            }

            if (!aggiunto && automobile.isVip()) {
                int indiceMinPotenza = -1;
                double potenzaMin = Double.MAX_VALUE;

                for (int i = 0; i < parcheggioCoperto.length; i++) {
                    if (parcheggioCoperto[i] != null && parcheggioCoperto[i].isVip() &&
                            parcheggioCoperto[i].getPotenza() < potenzaMin) {
                        potenzaMin = parcheggioCoperto[i].getPotenza();
                        indiceMinPotenza = i;
                    }
                }

                if (indiceMinPotenza != -1 && automobile.getPotenza() > potenzaMin) {
                    parcheggioAperto.add(parcheggioCoperto[indiceMinPotenza]);
                    parcheggioCoperto[indiceMinPotenza] = automobile;
                    aggiunto = true;
                }
            }

            if (!aggiunto) {
                parcheggioAperto.add(automobile);
            }
        }
    }

    public void stampaParcheggi() {
        System.out.println("Parcheggio Coperto:");
        for (int i = 0; i < parcheggioCoperto.length; i++ ) {
            if(parcheggioCoperto[i] != null) {
                System.out.println(parcheggioCoperto[i]);
            }
        }

        System.out.println("\nParcheggio Aperto:");
        parcheggioAperto.forEach(x -> System.out.println(x.toString()));
    }
}
