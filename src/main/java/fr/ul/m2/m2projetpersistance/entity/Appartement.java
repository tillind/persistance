package fr.ul.m2.m2projetpersistance.entity;


import fr.ul.m2.m2projetpersistance.parameter.ETypeAppart;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Appartement implements Serializable {

    @Id
    private final String id = UUID.randomUUID().toString();
    private String niveau;
    private String surface;
    @Enumerated(EnumType.STRING)
    private ETypeAppart type;
    @ManyToOne
    private Immeuble immeuble;
        
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the niveau
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * @param niveau the niveau to set
     */
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    /**
     * @return the surface
     */
    public String getSurface() {
        return surface;
    }

    /**
     * @param surface the surface to set
     */
    public void setSurface(String surface) {
        this.surface = surface;
    }

    /**
     * @return the type
     */
    public ETypeAppart getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ETypeAppart type) {
        this.type = type;
    }
    
    /**
     * @return the immeuble
     */
    public Immeuble getImmeuble() {
        return immeuble;
    }

    /**
     * @param immeuble the immeuble to set
     */
    public void setImmeuble(Immeuble immeuble) {
        this.immeuble = immeuble;
    }

}