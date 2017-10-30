package fr.ul.m2.m2projetpersistance.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Immeuble extends Projet implements Serializable {
    private String nbNiveaux;
    @OneToMany
    public Set<Appartement> appartement = new HashSet<Appartement>();
    
    public Immeuble(){
        
    }
    
    public void addAppartement(Appartement a){
        a.setImmeuble(this);
        appartement.add(a);
    }

    /**
     * @return the nbNiveaux
     */
    public String getNbNiveaux() {
        return nbNiveaux;
    }

    /**
     * @param nbNiveaux the nbNiveaux to set
     */
    public void setNbNiveaux(String nbNiveaux) {
        this.nbNiveaux = nbNiveaux;
    }
    
    
}