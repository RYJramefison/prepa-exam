package school.hei;

import java.util.List;

public class Camion extends Vehicule{
    private List<Colis> cargaison;

    public Camion(String modele, String immatriculation, double kilometrage, int poids, int longueur, int carburant, Conducteur conducteur) {
        super(modele, immatriculation, kilometrage, poids, longueur, carburant, conducteur);
    }


    public void ajouterColis(Colis colis) {
        cargaison.add(colis);
    }

    public void retirerColis(Colis colis) {
        cargaison.remove(colis);
    }


}
