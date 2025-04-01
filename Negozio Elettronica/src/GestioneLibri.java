import java.util.ArrayList;

public class GestioneLibri {
    private ArrayList<Libro> scafale;

    public GestioneLibri() {
        scafale = new ArrayList<Libro>();
    }

    public boolean codiceEsistente(Libro libro){
        for(Libro x : scafale){
            if(scafale.contains(scafale)){
                return true;
            }
        }
        return false;
    }

    public void aggiungiLibro(Libro libro)throws Exception{
        if(codiceEsistente(libro)) {
            throw new Exception("Codice già presente");
        }
        scafale.add(libro);
    }

    public void visualizza(){
        if(scafale.isEmpty()){
            System.out.println("array vuoto");
        } else {
            scafale.forEach(x -> System.out.println(x.toString()));
        }
    }
}
