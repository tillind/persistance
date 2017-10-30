package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

@Entity
public class Terrassement extends Lot {
	private String volumeTerre;

    /**
     * @return the volumeTerre
     */
    public String getVolumeTerre() {
        return volumeTerre;
    }

    /**
     * @param volumeTerre the volumeTerre to set
     */
    public void setVolumeTerre(String volumeTerre) {
        this.volumeTerre = volumeTerre;
    }
}