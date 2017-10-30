package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

@Entity
public class Menuiserie extends Lot {
	private String nbFenetres;
	private String nbPortes;
	private String nbFenetreToit;
	private String attribute;

    /**
     * @return the nbFenetres
     */
    public String getNbFenetres() {
        return nbFenetres;
    }

    /**
     * @param nbFenetres the nbFenetres to set
     */
    public void setNbFenetres(String nbFenetres) {
        this.nbFenetres = nbFenetres;
    }

    /**
     * @return the nbPortes
     */
    public String getNbPortes() {
        return nbPortes;
    }

    /**
     * @param nbPortes the nbPortes to set
     */
    public void setNbPortes(String nbPortes) {
        this.nbPortes = nbPortes;
    }

    /**
     * @return the nbFenetreToit
     */
    public String getNbFenetreToit() {
        return nbFenetreToit;
    }

    /**
     * @param nbFenetreToit the nbFenetreToit to set
     */
    public void setNbFenetreToit(String nbFenetreToit) {
        this.nbFenetreToit = nbFenetreToit;
    }

    /**
     * @return the attribute
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * @param attribute the attribute to set
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}