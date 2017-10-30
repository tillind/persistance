package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

@Entity
public class Peinture extends Lot {
	private String surface;

    /**
     * @return the surface
     */
    public String getSurface() {
        return surface;
    }

    /**
     * @param surface the surface to set
     */
    public void setSurface(String surface) {
        this.surface = surface;
    }
}