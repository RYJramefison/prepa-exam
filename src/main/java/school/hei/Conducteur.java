package school.hei;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Conducteur extends Voyageur{
    private String numeroPermis;

    public Conducteur(String nom, String prenom, LocalDate dateNaissance, String adresse, int poids, Date dateVoyage, String numeroPermis) {
        super(nom, prenom, dateNaissance, adresse, poids, dateVoyage);
        this.numeroPermis = numeroPermis;

    }
}
