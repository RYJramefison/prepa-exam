package school.hei;

import java.time.LocalDate;
import java.util.Date;

public class Voyageur extends Personne{
    private Date dateVoyage;

    public Voyageur(String nom, String prenom, LocalDate dateNaissance, String adresse, int poids, Date dateVoyage) {
        super(nom, prenom, dateNaissance, adresse, poids);
        this.dateVoyage = dateVoyage;
    }
}
