package fr.ul.m2.m2projetpersistance.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Lotissement extends Projet implements Serializable {
	private int nbMaisons=0;
        @OneToMany
	private Set<Maison> maisons = new HashSet<Maison>();

        
    public void addMaison(Maison m){
        m.setLotissement(this);
        getMaisons().add(m);
        nbMaisons++;
    }
    /**
     * @return the nbMaisons
     */
    public int getNbMaisons() {
        return nbMaisons;
    }

    /**
     * @return the maisons
     */
    public Set<Maison> getMaisons() {
        return maisons;
    }

    /**
     * @param maisons the maisons to set
     */
    public void setMaisons(Set<Maison> maisons) {
        this.maisons = maisons;
    }
   
}