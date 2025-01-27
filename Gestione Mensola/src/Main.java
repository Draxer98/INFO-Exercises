import backEnd.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static backEnd.Tools.Menu;
import static frontEnd.FrontEnd.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Gson Geson = (new GsonBuilder()).setPrettyPrinting().create();
        Libro libri;
        ArrayList<Libro> mensola = new ArrayList<Libro>();

        String[] opzioni = {"MENSOLA",
                "Inserimento",
                "Visualizza",
                "Elimina",
                "Salva su JSON",
                "Leggi su JSON",
                "Salva su csv",
                "Leggi su csv",
                "Fine"};
        boolean exit;
        do {
            exit = false;
            switch (Menu(opzioni, keyboard)) {
                case 1:
                    libri = Inserimento(mensola, keyboard);
                    mensola.add(libri);
                    break;
                case 2:
                    Visualizzazione(mensola);
                    break;
                case 3:
                    Elimina(mensola, keyboard);
                    break;
                case 4:
                    try {
                        FileWriter scrivi = new FileWriter("Mensola.json");
                        scrivi.write(Geson.toJson(mensola));
                        scrivi.flush();
                        scrivi.close();
                        System.out.println("File salvato con successo");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    Type listType = (new TypeToken<ArrayList<Libro>>() {
                    }).getType();

                    try {
                        FileReader leggi = new FileReader("Mensola.json");
                        ArrayList<Libro> mensola2 = Geson.fromJson(leggi, listType);
                        System.out.println("Archivio 2 visualizzato con successo");
                        System.out.println(mensola2);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    /**
                     ArrayList<String> records = new ArrayList<>();

                     try {
                     for (Libro i : mensola) {
                     records.add(i.toCSV);
                     }

                     Files.Write(Paths.get("mensolaCSV.csv"));
                     } catch (Exception e){
                     System.out.println(e.getMessage());
                     }*/
                    break;
                case 7:
                    /**
                     ArrayList<Libro> CSVleggi = new ArrayList<Libro>();
                     ArrayList<String> linee = (ArrayList<String>) Files.readAllLines(Paths.get("mensolaCSV.csv"));

                     String[] attributi;

                     for(String i : linee){
                     attributi = i.split(";");

                     CSVleggi.add(new Mensola(attributi[0], Integer.parseInt(attributi[1])))
                     }

                     try {

                     } catch (Exception e) {
                     System.out.println(e.getMessage());
                     }*/
                    break;
                case 8:
                    exit = true;
                    break;
            }
        }
        while (!exit);
    }
}
