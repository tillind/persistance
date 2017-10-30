package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

@Entity
public class Reseau extends Lot {
	private String longueur;

    /**
     * @return the longueur
     */
    public String getLongueur() {
        return longueur;
    }

    /**
     * @param longueur the longueur to set
     */
    public void setLongueur(String longueur) {
        this.longueur = longueur;
    }
}