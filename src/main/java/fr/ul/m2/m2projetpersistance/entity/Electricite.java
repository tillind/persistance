package fr.ul.m2.m2projetpersistance.entity;


import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Electricite extends Lot implements Serializable {

    /**
     * @return the nbTableau
     */
    public String getNbTableau() {
        return nbTableau;
    }

    /**
     * @param nbTableau the nbTableau to set
     */
    public void setNbTableau(String nbTableau) {
        this.nbTableau = nbTableau;
    }

    /**
     * @return the longueurCable
     */
    public String getLongueurCable() {
        return longueurCable;
    }

    /**
     * @param longueurCable the longueurCable to set
     */
    public void setLongueurCable(String longueurCable) {
        this.longueurCable = longueurCable;
    }
	private String nbTableau;
	private String longueurCable;
}