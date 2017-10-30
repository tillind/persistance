package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

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