/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ul.m2.m2projetpersistance.fabric;

import fr.ul.m2.m2projetpersistance.entity.Acteur;
import fr.ul.m2.m2projetpersistance.entity.Adresse;
import fr.ul.m2.m2projetpersistance.entity.Appartement;
import fr.ul.m2.m2projetpersistance.entity.Charpente;
import fr.ul.m2.m2projetpersistance.entity.Dallage;
import fr.ul.m2.m2projetpersistance.entity.Electricite;
import fr.ul.m2.m2projetpersistance.entity.Entreprise;
import fr.ul.m2.m2projetpersistance.entity.Fondation;
import fr.ul.m2.m2projetpersistance.entity.Hopital;
import fr.ul.m2.m2projetpersistance.entity.Immeuble;
import fr.ul.m2.m2projetpersistance.entity.Lot;
import fr.ul.m2.m2projetpersistance.entity.Lotissement;
import fr.ul.m2.m2projetpersistance.entity.Maconnerie;
import fr.ul.m2.m2projetpersistance.entity.Menuiserie;
import fr.ul.m2.m2projetpersistance.entity.Peinture;
import fr.ul.m2.m2projetpersistance.entity.Platerie;
import fr.ul.m2.m2projetpersistance.entity.Projet;
import fr.ul.m2.m2projetpersistance.entity.Reseau;
import fr.ul.m2.m2projetpersistance.entity.Terrassement;
import fr.ul.m2.m2projetpersistance.parameter.ECharpente;
import fr.ul.m2.m2projetpersistance.parameter.ECorpsMetier;
import fr.ul.m2.m2projetpersistance.parameter.ETypeAppart;
import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alex
 * @author Arthur
 */
public class LotUn {
    Projet p;
    Immeuble i;
    Hopital h;
    Hopital j;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    EntityManager em = emf.createEntityManager();
    
    
    
    
    
    public void createProjectEnded() {

        addProjetUn();
        addProjetDeux();
        addProjetTrois();
        addProjetQuatre();
        
        em.persist(p);
        em.persist(i);
        em.persist(h);
        em.persist(j);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    private void addProjetUn() {
        p = new Lotissement();
        p.setAvancement("terminer");
        p.addLot(createTerrassement(p));
        p.addLot(createDallage(p));
        p.addLot(createMenuiserie(p));
        p.addLot(createFondation(p));
        p.addLot(createMaconnerie(p));
        p.addLot(createPlaterie(p));
        p.addLot(createElectricite(p));
        p.addLot(createReseau(p));
        p.addLot(createPeinture(p));
        p.addLot(createCharpente(p));

    }//OK

    private void addProjetDeux() {
        i = new Immeuble();
        i.setAvancement("terminer");
        i.addLot(createTerrassement(i));
        i.addLot(createDallage(i));
        i.addLot(createMenuiserie(i));
        i.addLot(createFondation(i));
        i.addLot(createMaconnerie1(i));
        i.addLot(createPlaterie(i));
        i.addLot(createElectricite(i));
        i.addLot(createReseau(i));
        i.createImmeuble(10,ETypeAppart.t4);

    }//OK

    private void addProjetTrois() {
        h = new Hopital();
        h.setAvancement("terminer");
        h.addLot(createTerrassement(h));
        h.addLot(createDallage(h));
        h.addLot(createMenuiserie(h));
        h.addLot(createFondation(h));
        h.addLot(createMaconnerie2(h));
        h.addLot(createPlaterie(h));
        h.addLot(createElectricite(h));
        h.addLot(createReseau(h));
        h.addLot(createPeinture(h));
        h.addLot(createCharpente(h));
    }//OK

    private void addProjetQuatre() {
        j = new Hopital();
        j.setNbLIts("4000");
        j.setNbServices("12");
        j.setAvancement("terminer");
        j.addLot(createTerrassement(j));
        j.addLot(createDallage(j));
        j.addLot(createMenuiserie(j));
        j.addLot(createFondation(j));
        j.addLot(createMaconnerie(j));
    }

    private Lot createTerrassement(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("24");
        a.setRue("rue loin");
        a.setVille("Paris");
        a.setcP("75000");

        Acteur ac = new Acteur();
        ac.setNom("Caradas Gardner");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.macon);
        e.setNom("Fondation générale");
        e.setNumTel("0387596412");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Terrassement t = new Terrassement();
        t.setAvancement("terminer");
        t.setCoutEstime("12000");
        t.setCoutReel("40000");
        t.setDateDebut(Date.valueOf("2011-11-12"));
        t.setDateFinReel(Date.valueOf("2011-12-25"));
        t.setDureeEstime("30");
        t.setProjet(p);
        t.setRealise(null);////////////////////////////////////////////////////////

        t.setResponsable(e);
        t.setVolumeTerre("124000");
        em.persist(t);
        em.getTransaction().commit();
        return t;
    }

    private Lot createDallage(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("224");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");
        
        Acteur ac = new Acteur();
        ac.setNom("Habaccuc Rumble");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.carreleur);
        e.setNom("La dalle");
        e.setNumTel("0387596412");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Dallage d = new Dallage();
        d.setAvancement("terminer");
        d.setCoutEstime("35000");
        d.setCoutReel("42000");
        d.setDateDebut(Date.valueOf("2012-01-30"));
        d.setDateFinReel(Date.valueOf("2012-02-25"));
        d.setDureeEstime("10");
        d.setProjet(p);
        d.setRealise(null);////////////////////////////////////////////////////////
        d.setSurfaceTotal("35320");
        em.persist(d);

        
        em.getTransaction().commit();

        return d;
    }

    public Lot createMenuiserie(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("225");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");

        Acteur ac = new Acteur();
        ac.setNom("Ronald van der Wal");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.menuisier);
        e.setNom("Menuiserie de france");
        e.setNumTel("0387596412");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        

        Menuiserie m = new Menuiserie();
        m.setAvancement("terminer");
        m.setCoutEstime("35000");
        m.setCoutReel("42000");
        m.setDateDebut(Date.valueOf("2012-01-30"));
        m.setDateFinReel(Date.valueOf("2012-02-24"));
        m.setDureeEstime("10");
        m.setProjet(p);
        m.setRealise(null);////////////////////////////////////////////////////////
        m.setNbFenetreToit("20");
        m.setNbPortes("120");
        m.setNbPortes("80");

        em.persist(m);
        
        em.getTransaction().commit();

        return m;
    }

    public Lot createFondation(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("1");
        a.setRue("rue du j'en ai marre");
        a.setVille("Pekin");
        a.setcP("11111");

        Acteur ac = new Acteur();
        ac.setNom("Juli van Sommeren");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.macon);
        e.setNom("Macon de France");
        e.setNumTel("132486510");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Fondation f = new Fondation();
        f.setAvancement("terminer");
        f.setCoutEstime("145123");
        f.setCoutReel("45000");
        f.setDateDebut(Date.valueOf("2015-08-12"));
        f.setDateFinReel(Date.valueOf("2016-10-14"));
        f.setProjet(p);
        f.setRealise(null);
        f.setProfondeur("5");
        em.persist(f);

        
        em.getTransaction().commit();

        return f;
    }

    public Lot createMaconnerie(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("4");
        a.setRue("rue du kebab");
        a.setVille("Lyon");
        a.setcP("69000");

        Acteur ac = new Acteur();
        ac.setNom("Tim Baartman");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.macon);
        e.setNom("Macon de France");
        e.setNumTel("132486510");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Maconnerie m = new Maconnerie();
        m.setSurfaceMur("2");
        m.setNbPoteaux("9");

        m.setDateDebut(Date.valueOf("2016-01-18"));
        m.setDureeEstime("15");
        m.setCoutEstime("1000");
        m.setAvancement("terminer");
        m.setCoutReel("12000");
        m.setDateFinReel(Date.valueOf("2017-05-18"));
        m.addEntRealise(e);
        m.setProjet(p);
        
        em.persist(m);
        em.getTransaction().commit();

        return m;
    }

    public Lot createMaconnerie1(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("8");
        a.setRue("rue du poisson");
        a.setVille("Monaco");
        a.setcP("Monaco");

        Acteur ac = new Acteur();
        ac.setNom("Liedeke Beijers");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.macon);
        e.setNom("Macon de France");
        e.setNumTel("132486510");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Maconnerie m = new Maconnerie();
        m.setSurfaceMur("2");
        m.setNbPoteaux("9");

        m.setDateDebut(Date.valueOf("2016-01-20"));
        m.setDureeEstime("15");
        m.setCoutEstime("1000");
        m.setAvancement("terminer");
        m.setCoutReel("12000");
        m.setDateFinReel(Date.valueOf("2017-05-18"));
        m.addEntRealise(e);
        m.setProjet(p);
        em.persist(m);

        
        em.getTransaction().commit();


        return m;
    }

    public Lot createMaconnerie2(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("8");
        a.setRue("rue du poisson");
        a.setVille("Monaco");
        a.setcP("Monaco");

        Acteur ac = new Acteur();
        Acteur ac1 = new Acteur();
        ac.setNom("Liedeke Beijers");
        ac1.setNom("Cüneyt Vels");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.addActeur(ac1);
        e.setCorpsMetier(ECorpsMetier.macon);
        e.setNom("Macon de France");
        e.setNumTel("132486510");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Maconnerie m = new Maconnerie();
        m.setSurfaceMur("2");
        m.setNbPoteaux("9");

        m.setDateDebut(Date.valueOf("2016-01-18"));
        m.setDureeEstime("15");
        m.setCoutEstime("1000");
        m.setAvancement("terminer");
        m.setCoutReel("12000");
        m.setDateFinReel(Date.valueOf("2017-05-18"));
        m.addEntRealise(e);
        m.setProjet(p);
        em.persist(m);

        
        em.getTransaction().commit();

        return m;
    }

    public Lot createPlaterie(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("7");
        a.setRue("rue de la patate");
        a.setVille("Niort");
        a.setcP("79000");

        Acteur ac = new Acteur();
        ac.setNom("Fabianne Haverkamp");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.platrier);
        e.setNom("Platrier de France");
        e.setNumTel("1234895");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Platerie pl = new Platerie();
        pl.setSurfacePlafond("85");
        pl.setSurfaceMur("200");

        pl.setDateDebut(Date.valueOf("2014-12-15"));
        pl.setDureeEstime("24");
        pl.setCoutEstime("10500");
        pl.setAvancement("terminer");
        pl.setCoutReel("12000");
        pl.setDateFinReel(Date.valueOf("2015-05-18"));
        pl.addEntRealise(e);
        pl.setProjet(p);
        em.persist(pl);
        em.getTransaction().commit();

        return pl;
    }

    public Lot createElectricite(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("45");
        a.setRue("rue azerty");
        a.setVille("Nancy");
        a.setcP("54000");

        Acteur ac = new Acteur();
        ac.setNom("Joos Bos");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.electricien);
        e.setNom("Electricien de France");
        e.setNumTel("465123");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Electricite el = new Electricite();
        el.setNbTableau("2");
        el.setLongueurCable("50");

        el.setDateDebut(Date.valueOf("2014-12-14"));
        el.setDureeEstime("24");
        el.setCoutEstime("10500");
        el.setAvancement("terminer");
        el.setCoutReel("12000");
        el.setDateFinReel(Date.valueOf("2015-05-18"));
        el.addEntRealise(e);
        el.setProjet(p);
        em.persist(el);

        
        em.getTransaction().commit();

        return el;
    }

    public Lot createReseau(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("85");
        a.setRue("rue du bateau");
        a.setVille("la Rochelle");
        a.setcP("17000");

        Acteur ac = new Acteur();
        ac.setNom("Felix Baumgaertner");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.electricien);
        e.setNom("Electricien de France");
        e.setNumTel("465123");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Reseau r = new Reseau();
        r.setLongueur("80");

        r.setDateDebut(Date.valueOf("2016-10-31"));
        r.setDureeEstime("24");
        r.setCoutEstime("10500");
        r.setAvancement("terminer");
        r.setCoutReel("12000");
        r.setDateFinReel(Date.valueOf("2017-05-18"));
        r.addEntRealise(e);
        r.setProjet(p);
        em.persist(r);
        
        em.getTransaction().commit();

        return r;
    }

    public Lot createPeinture(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("84");
        a.setRue("rue du Hamster");
        a.setVille("Paris");
        a.setcP("75000");

        Acteur ac = new Acteur();
        ac.setNom("Michael Rothstein");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.peintre);
        e.setNom("Peintre de France");
        e.setNumTel("1637815");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Peinture pe = new Peinture();
        pe.setSurface("150");

        pe.setDateDebut(Date.valueOf("2016-09-15"));
        pe.setDureeEstime("24");
        pe.setCoutEstime("10500");
        pe.setAvancement("terminer");
        pe.setCoutReel("12000");
        pe.setDateFinReel(Date.valueOf("2017-05-18"));
        pe.addEntRealise(e);
        pe.setProjet(p);
        em.persist(pe);

        em.getTransaction().commit();

        return pe;
    }

    public Lot createCharpente(Projet p) {
        em.getTransaction().begin();
        Adresse a = new Adresse();
        a.setNumero("8465");
        a.setRue("rue du beaucoup de maison");
        a.setVille("Venise");
        a.setcP("Italie");

        Acteur ac = new Acteur();
        ac.setNom("Jonas Bader");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.setCorpsMetier(ECorpsMetier.peintre);
        e.setNom("Peintre de France");
        e.setNumTel("1637815");
        e.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(e);
        
        Charpente c = new Charpente();
        c.setTypeCharpente(ECharpente.traditionnelle);

        c.setDateDebut(Date.valueOf("1994-02-12"));
        c.setDureeEstime("24");
        c.setCoutEstime("10500");
        c.setAvancement("terminer");
        c.setCoutReel("12000");
        c.setDateFinReel(Date.valueOf("1998-05-18"));
        c.addEntRealise(e);
        c.setProjet(p);
        em.persist(c);
      
        em.getTransaction().commit();

        return c;

    }

}
