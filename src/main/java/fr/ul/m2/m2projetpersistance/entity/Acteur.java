package fr.ul.m2.m2projetpersistance.entity;

import fr.ul.m2.m2projetpersistance.parameter.EStatut;
import fr.ul.m2.m2projetpersistance.parameter.ETitre;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Acteur implements Serializable {
    @Id
    private final String id = UUID.randomUUID().toString();
    private String nom;
    @Enumerated(EnumType.STRING)
    private ETitre titre;
    @Enumerated(EnumType.STRING)
    private EStatut status;
    @ManyToOne
    private Entreprise entreprise;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
    name="acteur_projet",
            joinColumns={@JoinColumn(name="nom")},
            inverseJoinColumns={@JoinColumn(name="refProjet")}
    )
    private Set<Projet> projets = new HashSet<>();

    public Acteur(){

    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
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
     * @return the titre
     */
    public ETitre getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(ETitre titre) {
        this.titre = titre;
    }

    /**
     * @return the status
     */
    public EStatut getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(EStatut status) {
        this.status = status;
    }

    /**
     * @return the entreprise
     */
    public Entreprise getEntreprise() {
        return entreprise;
    }

    /**
     * @param entreprise the entreprise to set
     */
    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    /**
     * @return the projets
     */
    public Set<Projet> getProjets() {
        return projets;
    }

    /**
     * @param projets the projets to set
     */
    public void setProjets(Set<Projet> projets) {
        this.projets = projets;
    }
                
}