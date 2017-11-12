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

    Entreprise eTerrasement, eDallage, eMenuiserie, eFondation, eMaconnerie, ePlaterie, eElectricite, eReseau, ePeinture, eCharpente;
    Adresse a;
    Acteur ac;

    public void createEntreprise() {
        em.getTransaction().begin();
        a = new Adresse();
        a.setNumero("24");
        a.setRue("rue loin");
        a.setVille("Paris");
        a.setcP("75000");
        ac = new Acteur();
        ac.setNom("Caradas Gardner");
        eTerrasement = new Entreprise();
        eTerrasement.addActeur(ac);
        eTerrasement.setCorpsMetier(ECorpsMetier.macon);
        eTerrasement.setNom("Fondation du monde");
        eTerrasement.setNumTel("0387596412");
        eTerrasement.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eTerrasement);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("224");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");

        ac = new Acteur();
        ac.setNom("Habaccuc Rumble");
        eDallage = new Entreprise();
        eDallage.addActeur(ac);
        eDallage.setCorpsMetier(ECorpsMetier.carreleur);
        eDallage.setNom("La dalle");
        eDallage.setNumTel("0387596412");
        eDallage.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eDallage);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("225");
        a.setRue("rue pas loin");
        a.setVille("Nancy");
        a.setcP("54000");

        ac = new Acteur();
        ac.setNom("Ronald van der Wal");
        eMenuiserie = new Entreprise();
        eMenuiserie.addActeur(ac);
        eMenuiserie.setCorpsMetier(ECorpsMetier.menuisier);
        eMenuiserie.setNom("Menuiserie de france");
        eMenuiserie.setNumTel("0387596412");
        eMenuiserie.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eMenuiserie);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("1");
        a.setRue("rue du j'en ai marre");
        a.setVille("Pekin");
        a.setcP("11111");

        ac = new Acteur();
        ac.setNom("Juli van Sommeren");
        eFondation = new Entreprise();
        eFondation.addActeur(ac);
        eFondation.setCorpsMetier(ECorpsMetier.macon);
        eFondation.setNom("MaconFrancais");
        eFondation.setNumTel("132486510");
        eFondation.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eFondation);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("4");
        a.setRue("rue du kebab");
        a.setVille("Lyon");
        a.setcP("69000");

        ac = new Acteur();
        ac.setNom("Tim Baartman");
        eMaconnerie = new Entreprise();
        eMaconnerie.addActeur(ac);
        eMaconnerie.setCorpsMetier(ECorpsMetier.macon);
        eMaconnerie.setNom("Maconnerie generale");
        eMaconnerie.setNumTel("132486510");
        eMaconnerie.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eMaconnerie);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("8");
        a.setRue("rue du poisson");
        a.setVille("Monaco");
        a.setcP("Monaco");

        ac = new Acteur();
        ac.setNom("Liedeke Beijers");
        ePlaterie = new Entreprise();
        ePlaterie.addActeur(ac);
        ePlaterie.setCorpsMetier(ECorpsMetier.macon);
        ePlaterie.setNom("Macon de moselle");
        ePlaterie.setNumTel("132486510");
        ePlaterie.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(ePlaterie);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("7");
        a.setRue("rue de la patate");
        a.setVille("Niort");
        a.setcP("79000");

        ac = new Acteur();
        ac.setNom("Fabianne Haverkamp");
        ePlaterie = new Entreprise();
        ePlaterie.addActeur(ac);
        ePlaterie.setCorpsMetier(ECorpsMetier.platrier);
        ePlaterie.setNom("Platrier de France");
        ePlaterie.setNumTel("1234895");
        ePlaterie.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(ePlaterie);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("45");
        a.setRue("rue azerty");
        a.setVille("Nancy");
        a.setcP("54000");

        ac = new Acteur();
        ac.setNom("Joos Bos");
        eElectricite = new Entreprise();
        eElectricite.addActeur(ac);
        eElectricite.setCorpsMetier(ECorpsMetier.electricien);
        eElectricite.setNom("Electricien");
        eElectricite.setNumTel("465123");
        eElectricite.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eElectricite);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("85");
        a.setRue("rue du bateau");
        a.setVille("la Rochelle");
        a.setcP("17000");

        ac = new Acteur();
        ac.setNom("Felix Baumgaertner");
        eReseau = new Entreprise();
        eReseau.addActeur(ac);
        eReseau.setCorpsMetier(ECorpsMetier.electricien);
        eReseau.setNom("ElecMoselle");
        eReseau.setNumTel("465123");
        eReseau.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eReseau);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("84");
        a.setRue("rue du Hamster");
        a.setVille("Paris");
        a.setcP("75000");

        ac = new Acteur();
        ac.setNom("Michael Rothstein");
        ePeinture = new Entreprise();
        ePeinture.addActeur(ac);
        ePeinture.setCorpsMetier(ECorpsMetier.peintre);
        ePeinture.setNom("Peintre de la fench");
        ePeinture.setNumTel("1637815");
        ePeinture.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(ePeinture);
        /**
         * *******************************************************************
         */
        a = new Adresse();
        a.setNumero("8465");
        a.setRue("rue du beaucoup de maison");
        a.setVille("Venise");
        a.setcP("Italie");

        ac = new Acteur();
        ac.setNom("Jonas Bader");
        eCharpente = new Entreprise();
        eCharpente.addActeur(ac);
        eCharpente.setCorpsMetier(ECorpsMetier.peintre);
        eCharpente.setNom("Peintre de France");
        eCharpente.setNumTel("1637815");
        eCharpente.setAdresse(a);
        em.persist(a);
        em.persist(ac);
        em.persist(eCharpente);

        em.getTransaction().commit();

    }

    public void createProjectEnded() {
        this.createEntreprise();

        ProjetUn tmp = new ProjetUn();
        ProjetDeux tmp1 = new ProjetDeux();
        ProjetTrois tmp2= new ProjetTrois();
        ProjetQuatre tmp3 = new ProjetQuatre();
        
        em.close();
        emf.close();
    }

    class ProjetUn {

        public ProjetUn() {
            addProjetUn();
        }

        private void addProjetUn() {
            p = new Lotissement();
            p.setAvancement("terminer");
            p.setCoutTotalEstime("12000000");
            p.setDateFinEstime(Date.valueOf("2014-3-1"));
            p.setDateFinReel(Date.valueOf("2011-4-12"));
            p.setNom("Plot12");
            p.setTermine(true);
            p.addLot(createTerrassement());
            p.addLot(createDallage());
            p.addLot(createMenuiserie());
            p.addLot(createFondation());
            p.addLot(createMaconnerie());
            p.addLot(createPlaterie());
            p.addLot(createElectricite());
            p.addLot(createReseau());
            p.addLot(createPeinture());
            p.addLot(createCharpente());
            Adresse a = new Adresse();
            a.setNumero("24");
            a.setRue("rue du plg");
            a.setVille("Nancy");
            a.setcP("54000");

            p.setAdresse(a);
            em.getTransaction().begin();
            em.persist(a);
            em.persist(p);
            em.getTransaction().commit();
        }

        private Lot createTerrassement() {
            em.getTransaction().begin();
            Terrassement t = new Terrassement();
            t.setAvancement("terminer");
            t.setCoutEstime("12000");
            t.setCoutReel("40000");
            t.setDateDebut(Date.valueOf("2011-11-12"));
            t.setDateFinReel(Date.valueOf("2011-12-25"));
            t.setDureeEstime("30");
            t.addRealise(LotUn.this.eTerrasement);
            t.setResponsable(LotUn.this.eTerrasement);
            t.setVolumeTerre("124000");
            em.persist(t);
            em.getTransaction().commit();
            return t;
        }

        private Lot createDallage() {
            em.getTransaction().begin();
            Dallage d = new Dallage();
            d.setAvancement("terminer");
            d.setCoutEstime("35000");
            d.setCoutReel("42000");
            d.setDateDebut(Date.valueOf("2012-01-30"));
            d.setDateFinReel(Date.valueOf("2012-02-25"));
            d.setDureeEstime("10");
            d.addRealise(LotUn.this.eDallage);
            d.setResponsable(LotUn.this.eDallage);
            d.setSurfaceTotal("35320");
            em.persist(d);
            em.getTransaction().commit();
            return d;
        }

        public Lot createMenuiserie() {
            em.getTransaction().begin();
            Menuiserie m = new Menuiserie();
            m.setAvancement("terminer");
            m.setCoutEstime("35000");
            m.setCoutReel("42000");
            m.setDateDebut(Date.valueOf("2012-01-30"));
            m.setDateFinReel(Date.valueOf("2012-02-24"));
            m.setDureeEstime("10");
            m.addRealise(LotUn.this.eMenuiserie);
            m.setResponsable(LotUn.this.eMenuiserie);
            m.setNbFenetreToit("20");
            m.setNbPortes("120");
            m.setNbPortes("80");
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        public Lot createFondation() {
            em.getTransaction().begin();
            Fondation f = new Fondation();
            f.setAvancement("terminer");
            f.setCoutEstime("145123");
            f.setCoutReel("45000");
            f.setDateDebut(Date.valueOf("2015-08-12"));
            f.setDateFinReel(Date.valueOf("2016-10-14"));
            f.addRealise(LotUn.this.eFondation);
            f.setResponsable(LotUn.this.eFondation);
            f.setProfondeur("5");
            em.persist(f);
            em.getTransaction().commit();
            return f;
        }

        public Lot createMaconnerie() {
            em.getTransaction().begin();
            Maconnerie m = new Maconnerie();
            m.setSurfaceMur("2");
            m.setNbPoteaux("9");
            m.setDateDebut(Date.valueOf("2016-01-18"));
            m.setDureeEstime("15");
            m.setCoutEstime("1000");
            m.setAvancement("terminer");
            m.setCoutReel("12000");
            m.setDateFinReel(Date.valueOf("2017-05-18"));
            m.addRealise(LotUn.this.eMaconnerie);
            m.setResponsable(LotUn.this.eMaconnerie);
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        public Lot createMaconnerie1() {
            em.getTransaction().begin();
            Maconnerie m = new Maconnerie();
            m.setSurfaceMur("2");
            m.setNbPoteaux("9");
            m.setDateDebut(Date.valueOf("2016-01-20"));
            m.setDureeEstime("15");
            m.setCoutEstime("1000");
            m.setAvancement("terminer");
            m.setCoutReel("12000");
            m.setDateFinReel(Date.valueOf("2017-05-18"));
            m.addRealise(LotUn.this.eMaconnerie);
            m.setResponsable(LotUn.this.eMaconnerie);
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        public Lot createPlaterie() {
            em.getTransaction().begin();

            Platerie pl = new Platerie();
            pl.setSurfacePlafond("85");
            pl.setSurfaceMur("200");

            pl.setDateDebut(Date.valueOf("2014-12-15"));
            pl.setDureeEstime("24");
            pl.setCoutEstime("10500");
            pl.setAvancement("terminer");
            pl.setCoutReel("12000");
            pl.setDateFinReel(Date.valueOf("2015-05-18"));
            pl.addRealise(LotUn.this.eTerrasement);
            pl.setResponsable(LotUn.this.eTerrasement);
            em.persist(pl);
            em.getTransaction().commit();

            return pl;
        }

        public Lot createElectricite() {
            em.getTransaction().begin();

            Electricite el = new Electricite();
            el.setNbTableau("2");
            el.setLongueurCable("50");

            el.setDateDebut(Date.valueOf("2014-12-14"));
            el.setDureeEstime("24");
            el.setCoutEstime("10500");
            el.setAvancement("terminer");
            el.setCoutReel("12000");
            el.setDateFinReel(Date.valueOf("2015-05-18"));
            el.addRealise(LotUn.this.eElectricite);
            el.setResponsable(LotUn.this.eElectricite);
            em.persist(el);

            em.getTransaction().commit();

            return el;
        }

        public Lot createReseau() {
            em.getTransaction().begin();

            Reseau r = new Reseau();
            r.setLongueur("80");

            r.setDateDebut(Date.valueOf("2016-10-31"));
            r.setDureeEstime("24");
            r.setCoutEstime("10500");
            r.setAvancement("terminer");
            r.setCoutReel("12000");
            r.setDateFinReel(Date.valueOf("2017-05-18"));
            r.addRealise(LotUn.this.eTerrasement);
            r.setResponsable(LotUn.this.eTerrasement);
            em.persist(r);

            em.getTransaction().commit();

            return r;
        }

        public Lot createPeinture() {
            em.getTransaction().begin();
            Peinture pe = new Peinture();
            pe.setSurface("150");
            pe.setDateDebut(Date.valueOf("2016-09-15"));
            pe.setDureeEstime("24");
            pe.setCoutEstime("10500");
            pe.setAvancement("terminer");
            pe.setCoutReel("12000");
            pe.setDateFinReel(Date.valueOf("2017-05-18"));
            pe.setResponsable(LotUn.this.eTerrasement);
            pe.addEntRealise(LotUn.this.ePeinture);
            em.persist(pe);
            em.getTransaction().commit();

            return pe;
        }

        public Lot createCharpente() {
            em.getTransaction().begin();

            Charpente c = new Charpente();
            c.setTypeCharpente(ECharpente.traditionnelle);

            c.setDateDebut(Date.valueOf("1994-02-12"));
            c.setDureeEstime("24");
            c.setCoutEstime("10500");
            c.setAvancement("terminer");
            c.setCoutReel("12000");
            c.setDateFinReel(Date.valueOf("1998-05-18"));
            c.setResponsable(LotUn.this.eCharpente);
            c.addEntRealise(LotUn.this.eCharpente);
            em.persist(c);

            em.getTransaction().commit();

            return c;
        }
    }

    class ProjetDeux {

        public ProjetDeux() {
            addProjetDeux();
        }

        private void addProjetDeux() {
            System.out.println("fr.ul.m2.m2projetpersistance.fabric.LotUn.addProjetDeux()");
            i = new Immeuble();
            i.setCoutTotalEstime("120000");
            i.setDateFinEstime(Date.valueOf("2015-3-1"));
            i.setDateFinReel(Date.valueOf("2016-4-12"));
            i.setNom("ImmeubleHlmBeauJour");
            i.setAvancement("terminer");
            i.addLot(createTerrassement());
            i.addLot(createDallage());
            i.addLot(createMenuiserie());
            i.addLot(createFondation());
            i.addLot(createMaconnerie2());
            i.addLot(createPeinture());
            i.addLot(createElectricite());
            i.addLot(createReseau());
            i.createImmeuble(10, ETypeAppart.t4);

            Adresse a = new Adresse();
            a.setNumero("24");
            a.setRue("metz");
            a.setVille("Nancy");
            a.setcP("54000");

            i.setAdresse(a);
            em.getTransaction().begin();
            em.persist(a);
            em.persist(i);
            em.getTransaction().commit();

        }

        public Lot createElectricite() {
            em.getTransaction().begin();

            Electricite el = new Electricite();
            el.setNbTableau("2");
            el.setLongueurCable("50");

            el.setDateDebut(Date.valueOf("2014-12-14"));
            el.setDureeEstime("24");
            el.setCoutEstime("10500");
            el.setAvancement("terminer");
            el.setCoutReel("12000");
            el.setDateFinReel(Date.valueOf("2015-05-18"));
            el.addRealise(LotUn.this.eElectricite);
            el.setResponsable(LotUn.this.eElectricite);
            em.persist(el);

            em.getTransaction().commit();

            return el;
        }

        public Lot createReseau() {
            em.getTransaction().begin();

            Reseau r = new Reseau();
            r.setLongueur("80");

            r.setDateDebut(Date.valueOf("2016-10-31"));
            r.setDureeEstime("24");
            r.setCoutEstime("10500");
            r.setAvancement("terminer");
            r.setCoutReel("12000");
            r.setDateFinReel(Date.valueOf("2017-05-18"));
            r.addRealise(LotUn.this.eTerrasement);
            r.setResponsable(LotUn.this.eTerrasement);
            em.persist(r);

            em.getTransaction().commit();

            return r;
        }

        public Lot createPeinture() {
            em.getTransaction().begin();
            Peinture pe = new Peinture();
            pe.setSurface("150");
            pe.setDateDebut(Date.valueOf("2016-09-15"));
            pe.setDureeEstime("24");
            pe.setCoutEstime("10500");
            pe.setAvancement("terminer");
            pe.setCoutReel("12000");
            pe.setDateFinReel(Date.valueOf("2017-05-18"));
            pe.setResponsable(LotUn.this.eTerrasement);
            pe.addEntRealise(LotUn.this.ePeinture);
            em.persist(pe);
            em.getTransaction().commit();

            return pe;
        }

        public Lot createFondation() {
            em.getTransaction().begin();
            Fondation f = new Fondation();
            f.setAvancement("terminer");
            f.setCoutEstime("145123");
            f.setCoutReel("45000");
            f.setDateDebut(Date.valueOf("2015-08-12"));
            f.setDateFinReel(Date.valueOf("2016-10-14"));
            f.addRealise(LotUn.this.eFondation);
            f.setResponsable(LotUn.this.eFondation);
            f.setProfondeur("5");
            em.persist(f);
            em.getTransaction().commit();
            return f;
        }

        public Lot createMenuiserie() {
            em.getTransaction().begin();
            Menuiserie m = new Menuiserie();
            m.setAvancement("terminer");
            m.setCoutEstime("35000");
            m.setCoutReel("42000");
            m.setDateDebut(Date.valueOf("2012-01-30"));
            m.setDateFinReel(Date.valueOf("2012-02-24"));
            m.setDureeEstime("10");
            m.addRealise(LotUn.this.eMenuiserie);
            m.setResponsable(LotUn.this.eMenuiserie);
            m.setNbFenetreToit("20");
            m.setNbPortes("120");
            m.setNbPortes("80");
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        private Lot createTerrassement() {
            em.getTransaction().begin();
            Terrassement t = new Terrassement();
            t.setAvancement("terminer");
            t.setCoutEstime("12000");
            t.setCoutReel("40000");
            t.setDateDebut(Date.valueOf("2011-11-12"));
            t.setDateFinReel(Date.valueOf("2011-12-25"));
            t.setDureeEstime("30");
            t.addRealise(LotUn.this.eTerrasement);
            t.setResponsable(LotUn.this.eTerrasement);
            t.setVolumeTerre("124000");
            em.persist(t);
            em.getTransaction().commit();
            return t;
        }

        private Lot createDallage() {
            em.getTransaction().begin();
            Dallage d = new Dallage();
            d.setAvancement("terminer");
            d.setCoutEstime("35000");
            d.setCoutReel("42000");
            d.setDateDebut(Date.valueOf("2012-01-30"));
            d.setDateFinReel(Date.valueOf("2012-02-25"));
            d.setDureeEstime("10");
            d.addRealise(LotUn.this.eDallage);
            d.setResponsable(LotUn.this.eDallage);
            d.setSurfaceTotal("35320");
            em.persist(d);
            em.getTransaction().commit();
            return d;
        }

        public Lot createMaconnerie2() {
            em.getTransaction().begin();

            Maconnerie m = new Maconnerie();
            m.setSurfaceMur("2");
            m.setNbPoteaux("9");

            m.setDateDebut(Date.valueOf("2016-01-18"));
            m.setDureeEstime("15");
            m.setCoutEstime("1000");
            m.setAvancement("terminer");
            m.setCoutReel("12000");
            m.setDateFinReel(Date.valueOf("2017-05-18"));
            m.addRealise(LotUn.this.eMaconnerie);
            m.setResponsable(LotUn.this.eMaconnerie);
            em.persist(m);

            em.getTransaction().commit();

            return m;
        }

    }

    class ProjetTrois {

        public ProjetTrois() {
            this.addProjetTrois();
        }

        private void addProjetTrois() {
            h = new Hopital();
            h.setAvancement("terminer");
            h.setCoutTotalEstime("12300000");
            h.setDateFinEstime(Date.valueOf("2017-4-1"));
            h.setDateFinReel(Date.valueOf("2017-6-12"));
            h.setNom("HopitalBeauRegard");
            h.addLot(createTerrassement());
            h.addLot(createDallage());
            h.addLot(createMenuiserie());
            h.addLot(createFondation());
            h.addLot(createMaconnerie2());
            h.addLot(createPlaterie());
            h.addLot(createElectricite());
            h.addLot(createReseau());
            h.addLot(createPeinture());
            h.addLot(createCharpente());

            Adresse a = new Adresse();
            a.setNumero("12");
            a.setRue("hameau");
            a.setVille("paris");
            a.setcP("54000");

            h.setAdresse(a);
            em.getTransaction().begin();
            em.persist(a);
            em.persist(h);
            em.getTransaction().commit();
        }//OK

        private Lot createTerrassement() {
            em.getTransaction().begin();
            Terrassement t = new Terrassement();
            t.setAvancement("terminer");
            t.setCoutEstime("12000");
            t.setCoutReel("40000");
            t.setDateDebut(Date.valueOf("2011-11-12"));
            t.setDateFinReel(Date.valueOf("2011-12-25"));
            t.setDureeEstime("30");
            t.addRealise(LotUn.this.eTerrasement);
            t.setResponsable(LotUn.this.eTerrasement);
            t.setVolumeTerre("124000");
            em.persist(t);
            em.getTransaction().commit();
            return t;
        }

        private Lot createDallage() {
            em.getTransaction().begin();
            Dallage d = new Dallage();
            d.setAvancement("terminer");
            d.setCoutEstime("35000");
            d.setCoutReel("42000");
            d.setDateDebut(Date.valueOf("2012-01-30"));
            d.setDateFinReel(Date.valueOf("2012-02-25"));
            d.setDureeEstime("10");
            d.addRealise(LotUn.this.eDallage);
            d.setResponsable(LotUn.this.eDallage);
            d.setSurfaceTotal("35320");
            em.persist(d);
            em.getTransaction().commit();
            return d;
        }

        public Lot createMenuiserie() {
            em.getTransaction().begin();
            Menuiserie m = new Menuiserie();
            m.setAvancement("terminer");
            m.setCoutEstime("35000");
            m.setCoutReel("42000");
            m.setDateDebut(Date.valueOf("2012-01-30"));
            m.setDateFinReel(Date.valueOf("2012-02-24"));
            m.setDureeEstime("10");
            m.addRealise(LotUn.this.eMenuiserie);
            m.setResponsable(LotUn.this.eMenuiserie);
            m.setNbFenetreToit("20");
            m.setNbPortes("120");
            m.setNbPortes("80");
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        public Lot createFondation() {
            em.getTransaction().begin();
            Fondation f = new Fondation();
            f.setAvancement("terminer");
            f.setCoutEstime("145123");
            f.setCoutReel("45000");
            f.setDateDebut(Date.valueOf("2015-08-12"));
            f.setDateFinReel(Date.valueOf("2016-10-14"));
            f.addRealise(LotUn.this.eFondation);
            f.setResponsable(LotUn.this.eFondation);
            f.setProfondeur("5");
            em.persist(f);
            em.getTransaction().commit();
            return f;
        }

        public Lot createMaconnerie() {
            em.getTransaction().begin();
            Maconnerie m = new Maconnerie();
            m.setSurfaceMur("2");
            m.setNbPoteaux("9");
            m.setDateDebut(Date.valueOf("2016-01-18"));
            m.setDureeEstime("15");
            m.setCoutEstime("1000");
            m.setAvancement("terminer");
            m.setCoutReel("12000");
            m.setDateFinReel(Date.valueOf("2017-05-18"));
            m.addRealise(LotUn.this.eMaconnerie);
            m.setResponsable(LotUn.this.eMaconnerie);
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        public Lot createMaconnerie1() {
            em.getTransaction().begin();
            Maconnerie m = new Maconnerie();
            m.setSurfaceMur("2");
            m.setNbPoteaux("9");
            m.setDateDebut(Date.valueOf("2016-01-20"));
            m.setDureeEstime("15");
            m.setCoutEstime("1000");
            m.setAvancement("terminer");
            m.setCoutReel("12000");
            m.setDateFinReel(Date.valueOf("2017-05-18"));
            m.addRealise(LotUn.this.eMaconnerie);
            m.setResponsable(LotUn.this.eMaconnerie);
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        public Lot createPlaterie() {
            em.getTransaction().begin();

            Platerie pl = new Platerie();
            pl.setSurfacePlafond("85");
            pl.setSurfaceMur("200");

            pl.setDateDebut(Date.valueOf("2014-12-15"));
            pl.setDureeEstime("24");
            pl.setCoutEstime("10500");
            pl.setAvancement("terminer");
            pl.setCoutReel("12000");
            pl.setDateFinReel(Date.valueOf("2015-05-18"));
            pl.addRealise(LotUn.this.eTerrasement);
            pl.setResponsable(LotUn.this.eTerrasement);
            em.persist(pl);
            em.getTransaction().commit();

            return pl;
        }

        public Lot createElectricite() {
            em.getTransaction().begin();

            Electricite el = new Electricite();
            el.setNbTableau("2");
            el.setLongueurCable("50");

            el.setDateDebut(Date.valueOf("2014-12-14"));
            el.setDureeEstime("24");
            el.setCoutEstime("10500");
            el.setAvancement("terminer");
            el.setCoutReel("12000");
            el.setDateFinReel(Date.valueOf("2015-05-18"));
            el.addRealise(LotUn.this.eElectricite);
            el.setResponsable(LotUn.this.eElectricite);
            em.persist(el);

            em.getTransaction().commit();

            return el;
        }

        public Lot createReseau() {
            em.getTransaction().begin();

            Reseau r = new Reseau();
            r.setLongueur("80");

            r.setDateDebut(Date.valueOf("2016-10-31"));
            r.setDureeEstime("24");
            r.setCoutEstime("10500");
            r.setAvancement("terminer");
            r.setCoutReel("12000");
            r.setDateFinReel(Date.valueOf("2017-05-18"));
            r.addRealise(LotUn.this.eTerrasement);
            r.setResponsable(LotUn.this.eTerrasement);
            em.persist(r);

            em.getTransaction().commit();

            return r;
        }

        public Lot createPeinture() {
            em.getTransaction().begin();
            Peinture pe = new Peinture();
            pe.setSurface("150");
            pe.setDateDebut(Date.valueOf("2016-09-15"));
            pe.setDureeEstime("24");
            pe.setCoutEstime("10500");
            pe.setAvancement("terminer");
            pe.setCoutReel("12000");
            pe.setDateFinReel(Date.valueOf("2017-05-18"));
            pe.setResponsable(LotUn.this.eTerrasement);
            pe.addEntRealise(LotUn.this.ePeinture);
            em.persist(pe);
            em.getTransaction().commit();

            return pe;
        }

        public Lot createCharpente() {
            em.getTransaction().begin();

            Charpente c = new Charpente();
            c.setTypeCharpente(ECharpente.traditionnelle);

            c.setDateDebut(Date.valueOf("1994-02-12"));
            c.setDureeEstime("24");
            c.setCoutEstime("10500");
            c.setAvancement("terminer");
            c.setCoutReel("12000");
            c.setDateFinReel(Date.valueOf("1998-05-18"));
            c.setResponsable(LotUn.this.eCharpente);
            c.addEntRealise(LotUn.this.eCharpente);
            em.persist(c);

            em.getTransaction().commit();

            return c;
        }

        public Lot createMaconnerie2() {
            em.getTransaction().begin();

            Maconnerie m = new Maconnerie();
            m.setSurfaceMur("2");
            m.setNbPoteaux("9");

            m.setDateDebut(Date.valueOf("2016-01-18"));
            m.setDureeEstime("15");
            m.setCoutEstime("1000");
            m.setAvancement("terminer");
            m.setCoutReel("12000");
            m.setDateFinReel(Date.valueOf("2017-05-18"));
            m.addRealise(LotUn.this.eMaconnerie);
            m.setResponsable(LotUn.this.eMaconnerie);
            em.persist(m);

            em.getTransaction().commit();

            return m;
        }
    }

    class ProjetQuatre {

        private void addProjetQuatre() {
            j = new Hopital();
            j.setCoutTotalEstime("120000");
            j.setDateFinEstime(Date.valueOf("2014-3-1"));
            j.setDateFinReel(Date.valueOf("2011-4-12"));
            j.setNom("MercY");
            j.setNbLIts("4000");
            j.setNbServices("12");
            j.setAvancement("terminer");
            j.addLot(createTerrassement());
            j.addLot(createDallage());
            j.addLot(createMenuiserie());
            j.addLot(createFondation());
            j.addLot(createMaconnerie());

            Adresse a = new Adresse();
            a.setNumero("24");
            a.setRue("metz");
            a.setVille("strasbourg");
            a.setcP("54000");

            j.setAdresse(a);
            em.getTransaction().begin();
            em.persist(a);
            em.persist(j);
            em.getTransaction().commit();
        }

        private Lot createTerrassement() {
            em.getTransaction().begin();
            Terrassement t = new Terrassement();
            t.setAvancement("terminer");
            t.setCoutEstime("12000");
            t.setCoutReel("40000");
            t.setDateDebut(Date.valueOf("2011-11-12"));
            t.setDateFinReel(Date.valueOf("2011-12-25"));
            t.setDureeEstime("30");
            t.addRealise(LotUn.this.eTerrasement);
            t.setResponsable(LotUn.this.eTerrasement);
            t.setVolumeTerre("124000");
            em.persist(t);
            em.getTransaction().commit();
            return t;
        }

        private Lot createDallage() {
            em.getTransaction().begin();
            Dallage d = new Dallage();
            d.setAvancement("terminer");
            d.setCoutEstime("35000");
            d.setCoutReel("42000");
            d.setDateDebut(Date.valueOf("2012-01-30"));
            d.setDateFinReel(Date.valueOf("2012-02-25"));
            d.setDureeEstime("10");
            d.addRealise(LotUn.this.eDallage);
            d.setResponsable(LotUn.this.eDallage);
            d.setSurfaceTotal("35320");
            em.persist(d);
            em.getTransaction().commit();
            return d;
        }

        public Lot createMenuiserie() {
            em.getTransaction().begin();
            Menuiserie m = new Menuiserie();
            m.setAvancement("terminer");
            m.setCoutEstime("35000");
            m.setCoutReel("42000");
            m.setDateDebut(Date.valueOf("2012-01-30"));
            m.setDateFinReel(Date.valueOf("2012-02-24"));
            m.setDureeEstime("10");
            m.addRealise(LotUn.this.eMenuiserie);
            m.setResponsable(LotUn.this.eMenuiserie);
            m.setNbFenetreToit("20");
            m.setNbPortes("120");
            m.setNbPortes("80");
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

        public Lot createFondation() {
            em.getTransaction().begin();
            Fondation f = new Fondation();
            f.setAvancement("terminer");
            f.setCoutEstime("145123");
            f.setCoutReel("45000");
            f.setDateDebut(Date.valueOf("2015-08-12"));
            f.setDateFinReel(Date.valueOf("2016-10-14"));
            f.addRealise(LotUn.this.eFondation);
            f.setResponsable(LotUn.this.eFondation);
            f.setProfondeur("5");
            em.persist(f);
            em.getTransaction().commit();
            return f;
        }

        public Lot createMaconnerie() {
            em.getTransaction().begin();
            Maconnerie m = new Maconnerie();
            m.setSurfaceMur("2");
            m.setNbPoteaux("9");
            m.setDateDebut(Date.valueOf("2016-01-18"));
            m.setDureeEstime("15");
            m.setCoutEstime("1000");
            m.setAvancement("terminer");
            m.setCoutReel("12000");
            m.setDateFinReel(Date.valueOf("2017-05-18"));
            m.addRealise(LotUn.this.eMaconnerie);
            m.setResponsable(LotUn.this.eMaconnerie);
            em.persist(m);
            em.getTransaction().commit();
            return m;
        }

    }
}
