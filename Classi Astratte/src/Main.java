import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestoreSolidi gestoreSolidi = new GestoreSolidi();
        Scanner scanner = new Scanner(System.in);

        String[] opzioni = {"MENU", "INSERIRE CUBO", "INSERIRE SFERA", "VISUALIZZA", "EXIT"};
        boolean fine = true;

        do {
            switch (Tools.menu(opzioni, scanner)) {
                case 1:
                    gestoreSolidi.add(Tools.leggiCubo(scanner));
                    break;
                case 2:
                    gestoreSolidi.add(Tools.leggiSfera(scanner));
                    break;
                case 3:
                    gestoreSolidi.visualizza();
                    break;
                case 4:
                    fine = false;
                    break;
            }
        } while(fine);
    }
}
