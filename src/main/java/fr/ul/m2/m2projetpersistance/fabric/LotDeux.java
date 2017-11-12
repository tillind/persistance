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
import fr.ul.m2.m2projetpersistance.entity.Hopital;
import fr.ul.m2.m2projetpersistance.entity.Immeuble;
import fr.ul.m2.m2projetpersistance.entity.Lot;
import fr.ul.m2.m2projetpersistance.entity.Lotissement;
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
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arthur
 */
public class LotDeux {
    EtablissementScolaire es;
    Immeuble i;
    Musee m;
    
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
        ac.setNom("Jean michel doudou");
        eTerrasement = new Entreprise();
        eTerrasement.addActeur(ac);
        eTerrasement.setCorpsMetier(ECorpsMetier.macon);
        eTerrasement.setNom("ElFondation");
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
        ac.setNom("Serge rimbaux");
        eDallage = new Entreprise();
        eDallage.addActeur(ac);
        eDallage.setCorpsMetier(ECorpsMetier.carreleur);
        eDallage.setNom("Dallage Xtreme");
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
        ac.setNom("Ronald MacDonald");
        eMenuiserie = new Entreprise();
        eMenuiserie.addActeur(ac);
        eMenuiserie.setCorpsMetier(ECorpsMetier.menuisier);
        eMenuiserie.setNom("Meunier");
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
        ac.setNom("Alex gadeau");
        eFondation = new Entreprise();
        eFondation.addActeur(ac);
        eFondation.setCorpsMetier(ECorpsMetier.macon);
        eFondation.setNom("Macon pas trés francais");
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
        ac.setNom("Gui Guui");
        eMaconnerie = new Entreprise();
        eMaconnerie.addActeur(ac);
        eMaconnerie.setCorpsMetier(ECorpsMetier.macon);
        eMaconnerie.setNom("Ze'Macon");
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
        ac.setNom("Khaled Benal");
        ePlaterie = new Entreprise();
        ePlaterie.addActeur(ac);
        ePlaterie.setCorpsMetier(ECorpsMetier.macon);
        ePlaterie.setNom("Macon à macon");
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
        ac.setNom("Odette perrin");
        ePlaterie = new Entreprise();
        ePlaterie.addActeur(ac);
        ePlaterie.setCorpsMetier(ECorpsMetier.platrier);
        ePlaterie.setNom("La Platreri");
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
        ac.setNom("Gille Hallin");
        eElectricite = new Entreprise();
        eElectricite.addActeur(ac);
        eElectricite.setCorpsMetier(ECorpsMetier.electricien);
        eElectricite.setNom("Electrichien");
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
        ac.setNom("manu Macon");
        eReseau = new Entreprise();
        eReseau.addActeur(ac);
        eReseau.setCorpsMetier(ECorpsMetier.electricien);
        eReseau.setNom("Nancycité");
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
        ac.setNom("Francois LePan");
        ePeinture = new Entreprise();
        ePeinture.addActeur(ac);
        ePeinture.setCorpsMetier(ECorpsMetier.peintre);
        ePeinture.setNom("Peintre est mon métier");
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
        ac.setNom("Jonas Jojo");
        eCharpente = new Entreprise();
        eCharpente.addActeur(ac);
        eCharpente.setCorpsMetier(ECorpsMetier.peintre);
        eCharpente.setNom("Charpentrier");
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
        
        em.close();
        emf.close();
    }

    class ProjetUn {

        public ProjetUn() {
            addProjetUn();
        }

        private void addProjetUn() {
            es = new EtablissementScolaire();
            es.setAvancement("modelisation");
            es.setCoutTotalEstime("12000000");
            es.setDateFinEstime(Date.valueOf("2014-3-1"));
            es.setDateFinReel(Date.valueOf("2011-4-12"));
            es.setNom("Les oisillons");
            es.setTermine(false);

            Adresse a = new Adresse();
            a.setNumero("24");
            a.setRue("rue du plg");
            a.setVille("Nancy");
            a.setcP("54000");

            es.setAdresse(a);
            em.getTransaction().begin();
            em.persist(a);
            em.persist(es);
            em.getTransaction().commit();
        }

   
    }

    class ProjetDeux {

        public ProjetDeux() {
            addProjetDeux();
        }

        private void addProjetDeux() {
            System.out.println("fr.ul.m2.m2projetpersistance.fabric.LotDeux.addProjetDeux()");
            i = new Immeuble();
            i.setCoutTotalEstime("120000");
            i.setDateFinEstime(Date.valueOf("2015-3-1"));
            i.setDateFinReel(Date.valueOf("2016-4-12"));
            i.setNom("ImmeubleHlmBeauJour");
            i.setAvancement("construction");
            i.setTermine(false);
            i.addLot(createTerrassement());
            i.addLot(createDallage());
            i.addLot(createFondation());
            i.addLot(createMaconnerie2());
            i.addLot(createPeinture());
            i.addLot(createElectricite());
            i.addLot(createReseau());
            i.createImmeuble(8, ETypeAppart.t4);

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
            el.addRealise(LotDeux.this.eElectricite);
            el.setResponsable(LotDeux.this.eElectricite);
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
            r.addRealise(LotDeux.this.eTerrasement);
            r.setResponsable(LotDeux.this.eTerrasement);
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
            pe.setResponsable(LotDeux.this.eTerrasement);
            pe.addEntRealise(LotDeux.this.ePeinture);
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
            f.addRealise(LotDeux.this.eFondation);
            f.setResponsable(LotDeux.this.eFondation);
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
            m.addRealise(LotDeux.this.eMenuiserie);
            m.setResponsable(LotDeux.this.eMenuiserie);
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
            t.addRealise(LotDeux.this.eTerrasement);
            t.setResponsable(LotDeux.this.eTerrasement);
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
            d.addRealise(LotDeux.this.eDallage);
            d.setResponsable(LotDeux.this.eDallage);
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
            m.addRealise(LotDeux.this.eMaconnerie);
            m.setResponsable(LotDeux.this.eMaconnerie);
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
            m = new Musee();
            m.setAvancement("terminer");
            m.setCoutTotalEstime("12300000");
            m.setDateFinEstime(Date.valueOf("2017-4-1"));
            m.setDateFinReel(Date.valueOf("2017-6-12"));
            m.setNom("HopitalBeauRegard");
            m.addLot(createTerrassement());
            m.addLot(createDallage());
            m.addLot(createMenuiserie());
            m.addLot(createFondation());
            m.addLot(createMaconnerie2());
            m.addLot(createPlaterie());
            m.addLot(createElectricite());
            m.addLot(createReseau());
            m.addLot(createPeinture());
            m.addLot(createCharpente());

            Adresse a = new Adresse();
            a.setNumero("12");
            a.setRue("hameau");
            a.setVille("paris");
            a.setcP("54000");

            m.setAdresse(a);
            em.getTransaction().begin();
            em.persist(a);
            em.persist(m);
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
            t.addRealise(LotDeux.this.eTerrasement);
            t.setResponsable(LotDeux.this.eTerrasement);
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
            d.addRealise(LotDeux.this.eDallage);
            d.setResponsable(LotDeux.this.eDallage);
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
            m.addRealise(LotDeux.this.eMenuiserie);
            m.setResponsable(LotDeux.this.eMenuiserie);
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
            f.addRealise(LotDeux.this.eFondation);
            f.setResponsable(LotDeux.this.eFondation);
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
            m.addRealise(LotDeux.this.eMaconnerie);
            m.setResponsable(LotDeux.this.eMaconnerie);
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
            m.addRealise(LotDeux.this.eMaconnerie);
            m.setResponsable(LotDeux.this.eMaconnerie);
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
            pl.addRealise(LotDeux.this.eTerrasement);
            pl.setResponsable(LotDeux.this.eTerrasement);
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
            el.addRealise(LotDeux.this.eElectricite);
            el.setResponsable(LotDeux.this.eElectricite);
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
            r.addRealise(LotDeux.this.eTerrasement);
            r.setResponsable(LotDeux.this.eTerrasement);
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
            pe.setResponsable(LotDeux.this.eTerrasement);
            pe.addEntRealise(LotDeux.this.ePeinture);
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
            c.setResponsable(LotDeux.this.eCharpente);
            c.addEntRealise(LotDeux.this.eCharpente);
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
            m.addRealise(LotDeux.this.eMaconnerie);
            m.setResponsable(LotDeux.this.eMaconnerie);
            em.persist(m);

            em.getTransaction().commit();

            return m;
        }
    }

}
