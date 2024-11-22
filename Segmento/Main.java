import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws Exception {
        int x1, y1, x2, y2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci le coordinate del primo punto:");
        System.out.print("Inserisci x1: ");
        x1 = scanner.nextInt();
        System.out.print("Inserisci y1: ");
        y1 = scanner.nextInt();

        System.out.println("Inserisci le coordinate del secondo punto:");
        System.out.print("Inserisci x2: ");
        x2 = scanner.nextInt();
        System.out.print("Inserisci y2: ");
        y2 = scanner.nextInt();

        Punto punto1 = new Punto(x1, y1);
        Punto punto2 = new Punto(x2, y2);

        double distanza = calcolaDistanza(punto1, punto2);

        System.out.println("La distanza tra i due punti è: " + distanza);
    }

    public static double calcolaDistanza(Punto punto1, Punto punto2) {
        return sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }
}