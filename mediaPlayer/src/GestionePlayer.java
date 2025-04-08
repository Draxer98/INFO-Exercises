import java.util.ArrayList;

public class GestionePlayer {
    private ArrayList<Media> mediaList; // Una lista generica per tutti i tipi di Media

    public GestionePlayer() {
        mediaList = new ArrayList<>();
    }

    public void add(Media media) {
        mediaList.add(media); // Aggiungi qualsiasi oggetto che implementi Media
        System.out.println("Aggiunto: " + media.getTitoloInPlay());
    }

    public void visualizza() {
        Canzone canzone;
        mediaList.forEach(x -> System.out.println(x.getTitoloInPlay()));
    }

    public void play(String titolo) {
        mediaList.forEach(x -> {if(x.getTitoloInPlay().equals(titolo))
            x.play();
        });
    }

    public void stop(String titolo) {
        mediaList.forEach(x -> {if(x.getTitoloInPlay().equals(titolo))
            x.stop();
        });
    }
}
