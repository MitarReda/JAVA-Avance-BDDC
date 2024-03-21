package Exercice2;
import java.util.ArrayList;
import java.util.List;
class MetierProduitImpl implements IMetier<Produit> {
    private List<Produit> listeProduits;

    public MetierProduitImpl() {
        listeProduits = new ArrayList<>();
    }

    @Override
    public void add(Produit o) {
        listeProduits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return listeProduits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : listeProduits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Produit produit = findById(id);
        if (produit != null) {
            listeProduits.remove(produit);
        }
    }
}