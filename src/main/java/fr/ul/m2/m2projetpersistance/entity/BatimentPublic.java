package fr.ul.m2.m2projetpersistance.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BatimentPublic extends Projet implements Serializable {

    /**
     * @return the ministere
     */
    public String getMinistere() {
        return ministere;
    }

    /**
     * @param ministere the ministere to set
     */
    public void setMinistere(String ministere) {
        this.ministere = ministere;
    }
	private String ministere;
}