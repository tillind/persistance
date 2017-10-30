package fr.ul.m2.m2projetpersistance.entity;


import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Dallage extends Lot implements Serializable {
	private String surfaceTotal;

    /**
     * @return the surfaceTotal
     */
    public String getSurfaceTotal() {
        return surfaceTotal;
    }

    /**
     * @param surfaceTotal the surfaceTotal to set
     */
    public void setSurfaceTotal(String surfaceTotal) {
        this.surfaceTotal = surfaceTotal;
    }
}