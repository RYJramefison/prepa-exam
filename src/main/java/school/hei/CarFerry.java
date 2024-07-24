package school.hei;

import java.util.Arrays;
import java.util.List;

public class CarFerry extends Vehicule{
    private List<Voiture> vehicules;
    private List<Camion> camion;
//    private Arrays ;

    public CarFerry(String modele, String immatriculation, double kilometrage, int poids, int longueur, int carburant, Conducteur conducteur) {
        super(modele, immatriculation, kilometrage, poids, longueur, carburant, conducteur);
    }

    public void embarquer(Voiture voiture){
        this.vehicules.add(voiture);
    }
    public void embarquer(Camion camion){
        this.camion.add(camion);
    }

    public void debarquer(Voiture voiture){
        this.vehicules.remove(voiture);
    }
    public void debarquer(Camion camion){
        this.camion.remove(camion);
    }

    public void chercherVoyageur(Personne personne){
//        vehicules.forEach((vehicule) -> vehicule.);
    }



}
