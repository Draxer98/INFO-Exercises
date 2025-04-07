import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parcheggio parcheggio = new Parcheggio();
        Automobile automobile1 = new Automobile("Audi",true, 50000, 1000, false);
        Automobile automobile2 = new Automobile("Fiat",false, 10000, 250, true);
        Automobile automobile3 = new Automobile("Ferrari",true, 45500, 988, true);
        Automobile automobile4 = new Automobile("Volvo",false, 25000, 1025, false);


        parcheggio.AggiungiAutomobile(automobile1);
        parcheggio.AggiungiAutomobile(automobile2);
        parcheggio.AggiungiAutomobile(automobile3);
        parcheggio.AggiungiAutomobile(automobile4);

        parcheggio.stampaParcheggi();
    }
}
