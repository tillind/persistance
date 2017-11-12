package fr.ul.m2.m2projetpersistance.entity;


import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adresse implements Serializable {
        @Id
        private String id = UUID.randomUUID().toString();
	private String numero;
	private String rue;
	private String cP;
	private String ville;
        

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the rue
     */
    public String getRue() {
        return rue;
    }

    /**
     * @param rue the rue to set
     */
    public void setRue(String rue) {
        this.rue = rue;
    }

    /**
     * @return the cP
     */
    public String getcP() {
        return cP;
    }

    /**
     * @param cP the cP to set
     */
    public void setcP(String cP) {
        this.cP = cP;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }


}