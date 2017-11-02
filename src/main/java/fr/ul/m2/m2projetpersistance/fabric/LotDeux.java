/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ul.m2.m2projetpersistance.fabric;

import fr.ul.m2.m2projetpersistance.entity.Acteur;
import fr.ul.m2.m2projetpersistance.entity.Adresse;
import fr.ul.m2.m2projetpersistance.entity.Charpente;
import fr.ul.m2.m2projetpersistance.entity.Dallage;
import fr.ul.m2.m2projetpersistance.entity.Electricite;
import fr.ul.m2.m2projetpersistance.entity.Entreprise;
import fr.ul.m2.m2projetpersistance.entity.EtablissementScolaire;
import fr.ul.m2.m2projetpersistance.entity.Fondation;
import fr.ul.m2.m2projetpersistance.entity.Immeuble;
import fr.ul.m2.m2projetpersistance.entity.Lot;
import fr.ul.m2.m2projetpersistance.entity.Maconnerie;
import fr.ul.m2.m2projetpersistance.entity.Menuiserie;
import fr.ul.m2.m2projetpersistance.entity.Musee;
import fr.ul.m2.m2projetpersistance.entity.Peinture;
import fr.ul.m2.m2projetpersistance.entity.Platerie;
import fr.ul.m2.m2projetpersistance.entity.Projet;
import fr.ul.m2.m2projetpersistance.entity.Reseau;
import fr.ul.m2.m2projetpersistance.entity.Terrassement;
import fr.ul.m2.m2projetpersistance.parameter.ECharpente;
import fr.ul.m2.m2projetpersistance.parameter.ECorpsMetier;
import fr.ul.m2.m2projetpersistance.parameter.EEtatScolaire;
import fr.ul.m2.m2projetpersistance.parameter.ETypeAppart;
import java.sql.Date;

/**
 *
 * @author Arthur
 */
public class LotDeux {

    public void createProject() {

    }

    private void addProjetUn() {
        EtablissementScolaire p = new EtablissementScolaire();
        p.setNbEleves("72");
        p.setCategorie(EEtatScolaire.primaire);

    }

    private void addProjetDeux() {
        Immeuble p = new Immeuble();
        p.createImmeuble(8, ETypeAppart.studio);
        p.addLot(createTerrassement(p));
        p.addLot(createDallage(p));
        p.addLot(createMenuiserie(p));
        p.addLot(createFondation(p));
        p.addLot(createMaconnerie(p));
        p.addLot(createPeinture(p));
        p.addLot(createCharpente(p));
    }

    private void addProjetTrois() {
        Musee p = new Musee();
        p.setNbSalles("23");
    }

    private Lot createTerrassement(Projet p) {
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

    private Lot createDallage(Projet p) {
        Adresse a = new Adresse();
        a.setNumero("224");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");

        Acteur ac = new Acteur();
        Acteur ac1 = new Acteur();
        Acteur ac2 = new Acteur();
        ac.setNom("Habaccuc Rumble");
        ac2.setNom("Philipp Schneider");
        ac1.setNom("Jens Busch");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.addActeur(ac1);
        e.addActeur(ac2);
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

    public Lot createMenuiserie(Projet p) {
        Adresse a = new Adresse();
        a.setNumero("225");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");

        Acteur ac = new Acteur();
        Acteur ac1 = new Acteur();
        Acteur ac2 = new Acteur();
        Acteur ac3 = new Acteur();
        ac.setNom("Ronald van der Wal");
        ac1.setNom("Tobias Hertz");
        ac2.setNom("Frank Dresdner");
        ac3.setNom("Markus Achen");
        Entreprise e = new Entreprise();
        e.addActeur(ac);
        e.addActeur(ac1);
        e.addActeur(ac2);
        e.addActeur(ac3);
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

    public Lot createFondation(Projet p) {
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

        Fondation f = new Fondation();
        f.setAvancement("terminer");
        f.setCoutEstime("145123");
        f.setCoutReel("45000");
        f.setDateDebut(Date.valueOf("12/08/2015"));
        f.setDateFinReel(Date.valueOf("14/10/2016"));
        f.setProjet(p);
        f.setRealise(null);
        f.setProfondeur("5");

        return f;
    }

    public Lot createMaconnerie(Projet p) {
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

        Maconnerie m = new Maconnerie();
        m.setSurfaceMur("2");
        m.setNbPoteaux("9");

        m.setDateDebut(Date.valueOf("18/01/2016"));
        m.setDureeEstime("15");
        m.setCoutEstime("1000");
        m.setAvancement("terminer");
        m.setCoutReel("12000");
        m.setDateFinReel(Date.valueOf("18/05/2017"));
        m.addEntRealise(e);
        m.setProjet(p);

        return m;
    }

    public Lot createPeinture(Projet p) {
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

        Peinture pe = new Peinture();
        pe.setSurface("150");

        pe.setDateDebut(Date.valueOf("14/09/2016"));
        pe.setDureeEstime("24");
        pe.setCoutEstime("10500");
        pe.setAvancement("terminer");
        pe.setCoutReel("12000");
        pe.setDateFinReel(Date.valueOf("18/05/2017"));
        pe.addEntRealise(e);
        pe.setProjet(p);

        return pe;
    }

    public Lot createCharpente(Projet p) {
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

        Charpente c = new Charpente();
        c.setTypeCharpente(ECharpente.traditionnelle);

        c.setDateDebut(Date.valueOf("02/12/1994"));
        c.setDureeEstime("24");
        c.setCoutEstime("10500");
        c.setAvancement("terminer");
        c.setCoutReel("12000");
        c.setDateFinReel(Date.valueOf("18/05/1998"));
        c.addEntRealise(e);
        c.setProjet(p);

        return c;

    }

    public Lot createPlaterie(Projet p) {
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

        Platerie pl = new Platerie();
        pl.setSurfacePlafond("85");
        pl.setSurfaceMur("200");

        pl.setDateDebut(Date.valueOf("15/12/2014"));
        pl.setDureeEstime("24");
        pl.setCoutEstime("10500");
        pl.setAvancement("terminer");
        pl.setCoutReel("12000");
        pl.setDateFinReel(Date.valueOf("18/05/2015"));
        pl.addEntRealise(e);
        pl.setProjet(p);

        return pl;
    }

    public Lot createElectricite(Projet p) {
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

        Electricite el = new Electricite();
        el.setNbTableau("2");
        el.setLongueurCable("50");

        el.setDateDebut(Date.valueOf("15/12/2014"));
        el.setDureeEstime("24");
        el.setCoutEstime("10500");
        el.setAvancement("terminer");
        el.setCoutReel("12000");
        el.setDateFinReel(Date.valueOf("18/05/2015"));
        el.addEntRealise(e);
        el.setProjet(p);

        return el;
    }

    public Lot createReseau(Projet p) {
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

        Reseau r = new Reseau();
        r.setLongueur("80");

        r.setDateDebut(Date.valueOf("31/10/2016"));
        r.setDureeEstime("24");
        r.setCoutEstime("10500");
        r.setAvancement("terminer");
        r.setCoutReel("12000");
        r.setDateFinReel(Date.valueOf("18/05/2017"));
        r.addEntRealise(e);
        r.setProjet(p);

        return r;
    }

}
