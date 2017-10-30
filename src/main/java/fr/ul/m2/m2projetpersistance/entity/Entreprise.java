package fr.ul.m2.m2projetpersistance.entity;

import fr.ul.m2.m2projetpersistance.parameter.ECorpsMetier;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Entreprise implements Serializable {
   @Id
    private String nom;
    @Enumerated(EnumType.STRING)
    private ECorpsMetier corpsMetier;
    private String numTel;
    @OneToOne
    private Adresse adresse;

   // @ManyToOne(fetch=FetchType.EAGER)
   
    @OneToMany(mappedBy = "entreprise")
    private Set<Acteur> acteur = new HashSet<Acteur>();
    
    public Entreprise(){
        this.adresse = new Adresse();
        this.adresse.setEnt(this);
    }
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the corpsMetier
     */
    public ECorpsMetier getCorpsMetier() {
        return corpsMetier;
    }

    /**
     * @param corpsMetier the corpsMetier to set
     */
    public void setCorpsMetier(ECorpsMetier corpsMetier) {
        this.corpsMetier = corpsMetier;
    }

    /**
     * @return the numTel
     */
    public String getNumTel() {
        return numTel;
    }

    /**
     * @param numTel the numTel to set
     */
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the acteur
     */
    public Set<Acteur> getActeur() {
        return acteur;
    }

    /**
     * @param acteur the acteur to set
     */
    public void setActeur(Set<Acteur> acteur) {
        this.acteur = acteur;
    }
 
}