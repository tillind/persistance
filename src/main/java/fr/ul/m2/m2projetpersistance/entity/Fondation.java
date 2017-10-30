package fr.ul.m2.m2projetpersistance.entity;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Fondation extends Lot implements Serializable {
	private String profondeur;

    /**
     * @return the profondeur
     */
    public String getProfondeur() {
        return profondeur;
    }

    /**
     * @param profondeur the profondeur to set
     */
    public void setProfondeur(String profondeur) {
        this.profondeur = profondeur;
    }
}