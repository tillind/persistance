package fr.ul.m2.m2projetpersistance.entity;


import fr.ul.m2.m2projetpersistance.parameter.ECharpente;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Charpente extends Lot implements Serializable {

    /**
     * @return the typeCharpente
     */
    public ECharpente getTypeCharpente() {
        return typeCharpente;
    }

    /**
     * @param typeCharpente the typeCharpente to set
     */
    public void setTypeCharpente(ECharpente typeCharpente) {
        this.typeCharpente = typeCharpente;
    }

    @Enumerated(EnumType.STRING)
    private ECharpente typeCharpente;
}
