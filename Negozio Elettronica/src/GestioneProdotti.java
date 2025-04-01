import java.util.ArrayList;

public class GestioneProdotti {

    private ArrayList<ProdottoElettronico> prodotti;

    public GestioneProdotti() {
        prodotti = new ArrayList<>();
    }

    public boolean codiceEsistente(ProdottoElettronico prodotto){
        for(ProdottoElettronico x : prodotti){
            if(prodotti.contains(prodotto)){
                return true;
            }
        }
        return false;
    }

    public void aggiungiProdotto(ProdottoElettronico prodotto)throws Exception{
        if(codiceEsistente(prodotto)) {
            throw new Exception("Codice già presente");
        }
        prodotti.add(prodotto);
    }

    public void visualizza(){
        if(prodotti.isEmpty()){
            System.out.println("array vuoto");
        } else {
            prodotti.forEach(x -> System.out.println(x.toString()));
        }
    }
}