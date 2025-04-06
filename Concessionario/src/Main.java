import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Concessionario concessionario = new Concessionario();
        AutoNuova autoNuova = new AutoNuova(101, "EC-129HL", "AUDI", 60000, 2015, 450, 123);

        concessionario.addAuto(autoNuova);

        concessionario.visualizza();

        try{
            ricerca(concessionario);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        svaluta(concessionario);

        System.out.println("Inserisci un anno: ");
        int anno = Integer.parseInt(scanner.nextLine());

        concessionario.visualizzaAnnoImmatricolazione(anno);
    }

    private static void ricerca(Concessionario concessionario) throws Exception{
        AutoNuova autoNuova = new AutoNuova(101, "EC-129HL", "AUDI", 60000, 2015, 450, 123);
        if(concessionario.ricercaMarca(autoNuova) != null){
            throw new Exception("Modello: " + autoNuova.getModello());
        } else {
            throw new Exception("Marca non trovata");
        }
    }

    private static void svaluta(Concessionario concessionario){
        System.out.println(concessionario.calcolaValoreAttuale());
    }
}
