package fr.ul.m2.m2projetpersistance.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Projet implements Serializable {
        @Id
        private final String ref = UUID.randomUUID().toString();
	private String nom;
	private String surfaceTotal;
	private String avancement;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dateFinEstime;
	private String coutTotalEstime;
	private boolean termine;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dateFinReel;
        @ManyToMany(mappedBy="projets")
	private Set<Acteur> acteur = new HashSet<Acteur>();
        @OneToOne
	private Adresse adresse;
        
        @OneToMany(mappedBy="projet")
	private Set<Lot> lot = new HashSet<Lot>();
        
        public Projet(){
            this.adresse = new Adresse();
            this.adresse.setLoc(this);
        }

        public void addLot(Lot l){
            l.setProjet(this);
            lot.add(l);
        }
    /**
     * @return the ref
     */
    public String getRef() {
        return ref;
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

    /**
     * @return the avancement
     */
    public String getAvancement() {
        return avancement;
    }

    /**
     * @param avancement the avancement to set
     */
    public void setAvancement(String avancement) {
        this.avancement = avancement;
    }

    /**
     * @return the dateFinEstime
     */
    public Date getDateFinEstime() {
        return dateFinEstime;
    }

    /**
     * @param dateFinEstime the dateFinEstime to set
     */
    public void setDateFinEstime(Date dateFinEstime) {
        this.dateFinEstime = dateFinEstime;
    }

    /**
     * @return the coutTotalEstime
     */
    public String getCoutTotalEstime() {
        return coutTotalEstime;
    }

    /**
     * @param coutTotalEstime the coutTotalEstime to set
     */
    public void setCoutTotalEstime(String coutTotalEstime) {
        this.coutTotalEstime = coutTotalEstime;
    }

    /**
     * @return the termine
     */
    public boolean isTermine() {
        return termine;
    }

    /**
     * @param termine the termine to set
     */
    public void setTermine(boolean termine) {
        this.termine = termine;
    }

    /**
     * @return the dateFinReel
     */
    public Date getDateFinReel() {
        return dateFinReel;
    }

    /**
     * @param dateFinReel the dateFinReel to set
     */
    public void setDateFinReel(Date dateFinReel) {
        this.dateFinReel = dateFinReel;
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
     * @return the lot
     */
    public Set<Lot> getLot() {
        return lot;
    }

    /**
     * @param lot the lot to set
     */
    public void setLot(Set<Lot> lot) {
        this.lot = lot;
    }
}