package fr.ul.m2.m2projetpersistance.entity;


import fr.ul.m2.m2projetpersistance.parameter.EEtatScolaire;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery(
        name = "EtablissementScolaire.nbProjet",
        query = "SELECT COUNT(p.ref) FROM EtablissementScolaire p")
})
@Entity
public class EtablissementScolaire extends BatimentPublic {
    
	private String nbEleves;
        @Enumerated(EnumType.STRING)
	private EEtatScolaire categorie;

    /**
     * @return the nbEleves
     */
    public String getNbEleves() {
        return nbEleves;
    }

    /**
     * @param nbEleves the nbEleves to set
     */
    public void setNbEleves(String nbEleves) {
        this.nbEleves = nbEleves;
    }

    /**
     * @return the categorie
     */
    public EEtatScolaire getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(EEtatScolaire categorie) {
        this.categorie = categorie;
    }
}