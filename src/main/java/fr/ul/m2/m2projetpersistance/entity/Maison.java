package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Maison extends Projet {
	private String nbPieces;
	private String nbNiveaux;
    @ManyToOne
        private Lotissement lotissement;

    /**
     * @return the nbPieces
     */
    public String getNbPieces() {
        return nbPieces;
    }

    /**
     * @param nbPieces the nbPieces to set
     */
    public void setNbPieces(String nbPieces) {
        this.nbPieces = nbPieces;
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

    /**
     * @return the lotissement
     */
    public Lotissement getLotissement() {
        return lotissement;
    }

    /**
     * @param lotissement the lotissement to set
     */
    public void setLotissement(Lotissement lotissement) {
        this.lotissement = lotissement;
    }
}