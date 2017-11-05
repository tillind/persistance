package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery(
        name = "Musee.entMenuiserie",
        query = "SELECT e FROM Musee m JOIN Entreprise e JOIN Acteur a WHERE e.corpsMetier ='Menuisier'")
})
@Entity
public class Musee extends BatimentPublic {

    /**
     * @return the nbSalles
     */
    public String getNbSalles() {
        return nbSalles;
    }

    /**
     * @param nbSalles the nbSalles to set
     */
    public void setNbSalles(String nbSalles) {
        this.nbSalles = nbSalles;
    }
	private String nbSalles;
}