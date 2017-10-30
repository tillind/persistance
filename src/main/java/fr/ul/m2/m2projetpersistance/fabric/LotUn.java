/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ul.m2.m2projetpersistance.fabric;

import fr.ul.m2.m2projetpersistance.entity.Adresse;
import fr.ul.m2.m2projetpersistance.entity.Charpente;
import fr.ul.m2.m2projetpersistance.entity.Dallage;
import fr.ul.m2.m2projetpersistance.entity.Entreprise;
import fr.ul.m2.m2projetpersistance.entity.Lot;
import fr.ul.m2.m2projetpersistance.entity.Lotissement;
import fr.ul.m2.m2projetpersistance.entity.Menuiserie;
import fr.ul.m2.m2projetpersistance.entity.Projet;
import fr.ul.m2.m2projetpersistance.entity.Terrassement;
import fr.ul.m2.m2projetpersistance.parameter.ECorpsMetier;
import java.sql.Date;

/**
 *
 * @author alex
 */
public class LotUn {
    
    
    
    public void createProjectEnded(){

    }
    
    private void addProjetUn(){
        Projet p = new Lotissement();
        p.setAvancement("terminer");
        p.addLot(createTerrassement(p));
        
    }
    
    private Lot createTerrassement(Projet p){
        Adresse a = new Adresse();
        a.setNumero("24");
        a.setRue("rue loin");
        a.setVille("Paris");
        a.setcP("75000");
        
        Entreprise e = new Entreprise();
        e.setActeur(null);////////////////////////////////////////////////////////////
        e.setCorpsMetier(ECorpsMetier.macon);
        e.setNom("Fondation générale");
        e.setNumTel("0387596412");
        e.setAdresse(a);
        
        
        Terrassement t = new Terrassement();
        t.setAvancement("terminer");
        t.setCoutEstime("12000");
        t.setCoutReel("40000");
        t.setDateDebut(Date.valueOf("12/11/2011"));
        t.setDateFinReel(Date.valueOf("25/12/2011"));
        t.setDureeEstime("30");
        t.setProjet(p);
        t.setRealise(null);////////////////////////////////////////////////////////
        
        t.setResponsable(e);
        t.setVolumeTerre("124000");
        
        return t;
    }
    
    private Lot createDallage(Projet p){
        Adresse a = new Adresse();
        a.setNumero("224");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");
        
        Entreprise e = new Entreprise();
        e.setActeur(null);////////////////////////////////////////////////////////////
        e.setCorpsMetier(ECorpsMetier.carreleur);
        e.setNom("La dalle");
        e.setNumTel("0387596412");
        e.setAdresse(a);
        
          
        Dallage d = new Dallage();
        d.setAvancement("terminer");
        d.setCoutEstime("35000");
        d.setCoutReel("42000");
        d.setDateDebut(Date.valueOf("30/01/2012"));
        d.setDateFinReel(Date.valueOf("25/02/2012"));
        d.setDureeEstime("10");
        d.setProjet(p);
        d.setRealise(null);////////////////////////////////////////////////////////
        d.setSurfaceTotal("35320");

        return d;
    }
    
    public Lot createMenuiserie(Projet p){   
        Adresse a = new Adresse();
        a.setNumero("225");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");
        
        Entreprise e = new Entreprise();
        e.setActeur(null);////////////////////////////////////////////////////////////
        e.setCorpsMetier(ECorpsMetier.menuisier);
        e.setNom("Menuiserie de france");
        e.setNumTel("0387596412");
        e.setAdresse(a);
        
        Menuiserie m = new Menuiserie();
        m.setAvancement("terminer");
        m.setCoutEstime("35000");
        m.setCoutReel("42000");
        m.setDateDebut(Date.valueOf("30/01/2012"));
        m.setDateFinReel(Date.valueOf("25/02/2012"));
        m.setDureeEstime("10");
        m.setProjet(p);
        m.setRealise(null);////////////////////////////////////////////////////////
        m.setNbFenetreToit("20");
        m.setNbPortes("120");
        m.setNbPortes("80");
        
        return m;
    }
    
}
