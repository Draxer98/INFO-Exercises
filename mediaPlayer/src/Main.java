public class Main {
    public static void main(String[] args) {
        GestionePlayer player = new GestionePlayer();

        Canzone canzone1 = new Canzone("Imagine", "John Lennon");
        Canzone canzone2 = new Canzone("Bohemian Rhapsody", "Queen");

        // Aggiungi canzoni al player
        player.add(canzone1);
        player.add(canzone2);

        // Visualizza le canzoni
        player.visualizza();

        // Riproduci una canzone
        player.play("Imagine");
    }
}
