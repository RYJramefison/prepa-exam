package school.hei;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Vehicule {
    private String modele;
    private String immatriculation;
    private double kilometrage;
    private int poids;
    private int longueur;
    private int carburant;
    private Conducteur conducteur;


    public void changeConducteur(Conducteur otherConducteur) {
        if (otherConducteur.getNumeroPermis() != null){
            this.conducteur = otherConducteur;
        };
    }

    public int getPoids(){
        return poids + carburant + conducteur.getPoids();
    }

    public int allerAlaPompe(int ajoutCarburant){
        return carburant += ajoutCarburant;
    }

    public int rouler(int distance){
        int consommation = distance / 3;

        if (conducteur != null && carburant > consommation){
            return distance += consommation;
        }
        return distance;
    }






}
