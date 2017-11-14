/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ul.m2.m2projetpersistance.requete;

import fr.ul.m2.m2projetpersistance.entity.Acteur;
import fr.ul.m2.m2projetpersistance.entity.Entreprise;
import fr.ul.m2.m2projetpersistance.entity.Lot;
import fr.ul.m2.m2projetpersistance.entity.Projet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alex
 */
public class Requete {
    EntityManagerFactory emf ;
    EntityManager em;
    
    public Requete(){
       emf = Persistence.createEntityManagerFactory("test");
       em = emf.createEntityManager(); 
    }
    
    public void requeteDeux(){
        /************ Requete Deux **************/
        Query q1 = em.createNamedQuery("Projet.enCours");
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteDeux()");
        List<Projet> lesBuv1 = q1.getResultList();
        for ( Projet unBuv1 : lesBuv1) {
            System.out.println("Projet : " + unBuv1.getNom()+" est en cours");
        }
    }
    
     public void requeteTrois(){
         /**************** requete trois ******************/
         System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteTrois()");
        Query q1 = em.createNamedQuery("Projet.avancementPlot12");
        String plot12 = (String) q1.getSingleResult();
        System.out.println("Avancement Plot12 : " + plot12);
    }
    
    public void requeteSept(){
        /****************************** requete sept**********///
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteSept()");
        Query q1 = em.createNamedQuery("Projet.projetTerminerDeGeneralBatiment");
        List<Projet> lesActeurs = q1.getResultList();
        for ( Projet unActeur : lesActeurs) {
            System.out.println("Acteur : " + unActeur.getNom()+" est un acteur de general batiment");
        }
    }
    /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    public void requeteNeuf(){
        /******************** requete neuf *************************/
        /********************p  assse pas*************/////////
        Query q1 = em.createNamedQuery("Projet.entrepriseDePlot12");
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteNeuf()");
        List<Object[]> rs = q1.getResultList();
        
        rs.stream().forEach((result)->{
          Acteur acteur = (Acteur) result[0];
          Entreprise nom = (Entreprise) result[1];
            System.out.println("Acteur de Plot 12: "+acteur.getNom()+" entreprise -> "+nom.getNom());
        });
    }
    
    public void requeteDix(){
        /************************ requete dix**********************/
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteDix()");
        Query q1 = em.createNamedQuery("Projet.nbLotProjetPlot12");
        Long nbLot = (Long) q1.getSingleResult();
        System.out.println("Nombre de lot de Plot12 : " + nbLot);
    }
    

    public void requeteOnze(){
        /********************** requete onze ********************/
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteOnze()");
        Query q1 = em.createNamedQuery("Projet.coutTotalPlot12");
        String coutTotal = (String) q1.getSingleResult();
        System.out.println("Cout total de Plot12 : " + coutTotal);
    }
    
    public void requeteHuigt(){
       /********** requete huight *****************/
        Query q1 = em.createNamedQuery("Projet.lotEnCoursDeGeneralBatiment");
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteHuigt()");
        List<Lot> lesLots = q1.getResultList();
        System.out.println("General batiment");
        for ( Lot unLot : lesLots) {
            System.out.println("Lot en cours : " + unLot.getId());
        }
    }
    
    public void requeteTreize(){
        /******************* requete treize *****************/
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteTreize()");
        Query q1 = em.createNamedQuery("Projet.dureeEstimeProjetEnCours");
        List<String> lesLots = q1.getResultList();
        for ( String unLot : lesLots) {
            System.out.println("Duree estime des lot d'un projet en cours : " + unLot);
        }
    }
    
    /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    public void requeteQuatorze(){
        /****************** requete quatoze *************************/
        Query q1 = em.createNamedQuery("Projet.avacementsTypeLots");
        
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteQuatorze()");
        List<Object[]> lesLots = q1.getResultList();
        
        lesLots.stream().forEach((result)->{
          String avancement = (String) result[0];
          String nom = (String) result[1];
            System.out.println("Avancemùent de l'entreprise: "+nom+" ->"+avancement);
        });
        
    }
    
    public void requeteUn(){
        /********* Requete Un *****************/
        /********* passer ok *******************/
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteUn()");
        Query q1 = em.createNamedQuery("Entreprise.findEnt");
        List<Entreprise> lesEntreprises = q1.getResultList();
        for ( Entreprise uneEntreprise : lesEntreprises) {
            System.out.println("Entreprise : " + uneEntreprise.getNom());
        }
    }
    
    public void requeteCinque(){
        /*************** requete cinque ******************/
        Query q1 = em.createNamedQuery("Entreprise.nbPlombier");
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteCinque()");;
        List<Entreprise> lesEntreprises = q1.getResultList();
        for ( Entreprise uneEntreprise : lesEntreprises) {
            System.out.println("Entreprise de plomberie: " + uneEntreprise.getNom());
        }
    }
    
    public void requeteSix(){
        //************* requete six **************/
        Query q1 = em.createNamedQuery("Entreprise.contactsGeneralBatiment");
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteSix()");
        List<Acteur> lesActeurs = q1.getResultList();
        for ( Acteur unActeur : lesActeurs) {
            System.out.println("Acteur de general Batiment: " + unActeur.getNom());
        }
    }
    
    public void requeteDouze(){
        //////************************ requete douze**********************/
        System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteDouze()");
        Query q1 = em.createNamedQuery("Musee.entMenuiserie");
        List<Entreprise> lesEntreprises = q1.getResultList();
        for ( Entreprise uneEntreprise : lesEntreprises) {
            System.out.println("Entreprise de menuiserie pour un projet musee: " + uneEntreprise.getNom()+" adresse" + uneEntreprise.getAdresse().getRue()+" " +uneEntreprise.getAdresse().getVille());
        }
    }
    
    public void requeteQuatre(){
         /***************** requete quatre *************************/
         System.out.println("fr.ul.m2.m2projetpersistance.requete.Requete.requeteQuatre()");
        Query q1 = em.createNamedQuery("EtablissementScolaire.nbProjet");
        Long nbLot = (Long) q1.getSingleResult();
        System.out.println("Nombre de lot de d'etablissement scolaire : " + nbLot);
    }
}
