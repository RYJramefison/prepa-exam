package school.hei;

import java.util.List;

public class Voiture extends Vehicule {
    private List<Personne> LesPassager;
    private int Passager;

    public Voiture(String modele, String immatriculation, double kilometrage, int poids, int longueur, int carburant, Conducteur conducteur) {
        super(modele, immatriculation, kilometrage, poids, longueur, carburant, conducteur);
        this.Passager = 0;
    }

    public void monter(Personne personne) {
        if (Passager < 4) {
            LesPassager.add(personne);
            Passager++;
        } else {
            System.out.println("le voiture est plein");
        }
    }

    public boolean descendre(Personne personne) {
        if (Passager > 0) {
            LesPassager.remove(personne);
            Passager--;
            return true;
        }

        return false;
    }
}








