package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

@Entity
public class Platerie extends Lot {
	private String surfacePlafond;
	private String surfaceMur;

    /**
     * @return the surfacePlafond
     */
    public String getSurfacePlafond() {
        return surfacePlafond;
    }

    /**
     * @param surfacePlafond the surfacePlafond to set
     */
    public void setSurfacePlafond(String surfacePlafond) {
        this.surfacePlafond = surfacePlafond;
    }

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
}