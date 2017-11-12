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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Lot implements Serializable {

    @Id
    private final String id = UUID.randomUUID().toString();
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    private String dureeEstime;
    private String coutEstime;
    private String avancement;
    private String coutReel;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFinReel;

    @ManyToOne
    private Entreprise responsable;
    @ManyToMany
    private Set<Entreprise> realise = new HashSet<Entreprise>();

    public void addEntRealise(Entreprise e)
    {
        realise.add(e);
    }
        
        
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the dateDebut
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dureeEstime
     */
    public String getDureeEstime() {
        return dureeEstime;
    }

    /**
     * @param dureeEstime the dureeEstime to set
     */
    public void setDureeEstime(String dureeEstime) {
        this.dureeEstime = dureeEstime;
    }

    /**
     * @return the coutEstime
     */
    public String getCoutEstime() {
        return coutEstime;
    }

    /**
     * @param coutEstime the coutEstime to set
     */
    public void setCoutEstime(String coutEstime) {
        this.coutEstime = coutEstime;
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
     * @return the coutReel
     */
    public String getCoutReel() {
        return coutReel;
    }

    /**
     * @param coutReel the coutReel to set
     */
    public void setCoutReel(String coutReel) {
        this.coutReel = coutReel;
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
     * @return the responsable
     */
    public Entreprise getResponsable() {
        return responsable;
    }

    /**
     * @param responsable the responsable to set
     */
    public void setResponsable(Entreprise responsable) {
        this.responsable = responsable;
    }

    /**
     * @return the realise
     */
    public Set<Entreprise> getRealise() {
        return realise;
    }

    /**
     * @param realise the realise to set
     */
    public void setRealise(Set<Entreprise> realise) {
        this.realise = realise;
    }
    
    public void addRealise(Entreprise e){
        this.realise.add(e);
    }
}