package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

@Entity
public class Maconnerie extends Lot {
	private String surfaceMur;
	private String nbPoteaux;

    /**
     * @return the surfaceMur
     */
    public String getSurfaceMur() {
        return surfaceMur;
    }

    /**
     * @param surfaceMur the surfaceMur to set
     */
    public void setSurfaceMur(String surfaceMur) {
        this.surfaceMur = surfaceMur;
    }

    /**
     * @return the nbPoteaux
     */
    public String getNbPoteaux() {
        return nbPoteaux;
    }

    /**
     * @param nbPoteaux the nbPoteaux to set
     */
    public void setNbPoteaux(String nbPoteaux) {
        this.nbPoteaux = nbPoteaux;
    }
}