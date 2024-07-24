package school.hei;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;
    private int poids;


    public void voyager(){
        System.out.println(this.nom+" voyage");
    }

}
