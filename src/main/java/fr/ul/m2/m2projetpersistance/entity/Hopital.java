package fr.ul.m2.m2projetpersistance.entity;


import javax.persistence.Entity;

@Entity
public class Hopital extends BatimentPublic {
	private String nbLIts;
	private String nbServices;

    /**
     * @return the nbLIts
     */
    public String getNbLIts() {
        return nbLIts;
    }

    /**
     * @param nbLIts the nbLIts to set
     */
    public void setNbLIts(String nbLIts) {
        this.nbLIts = nbLIts;
    }

    /**
     * @return the nbServices
     */
    public String getNbServices() {
        return nbServices;
    }

    /**
     * @param nbServices the nbServices to set
     */
    public void setNbServices(String nbServices) {
        this.nbServices = nbServices;
    }
}