import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Frazione frazione1 = new Frazione(1, 4); // 1/4
        Frazione frazione2 = new Frazione("1/2"); // 1/2 (creata dalla stringa)

        System.out.print("Frazione 1: ");
        frazione1.visualizzaFrazione();
        System.out.print("Frazione 2: ");
        frazione2.visualizzaFrazione();

        Frazione sommaFrazioni = frazione1.sommaFrazioni(frazione2);
        System.out.print("Somma delle frazioni: ");
        sommaFrazioni.visualizzaFrazione();

        double sommaValore = frazione1.sommaFrazioniValore(frazione2);
        System.out.println("Somma delle frazioni (come valore numerico): " + sommaValore);
    }
}
