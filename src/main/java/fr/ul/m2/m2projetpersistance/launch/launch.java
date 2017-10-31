/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ul.m2.m2projetpersistance.launch;

import fr.ul.m2.m2projetpersistance.entity.Lot;
import fr.ul.m2.m2projetpersistance.entity.Lotissement;
import fr.ul.m2.m2projetpersistance.entity.Projet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 *
 * @author alex
 */
public class launch {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();
        
        //Projet Terminé
        //1 lotissements
        Projet projet1= new Lotissement();
        Lot lot1 =new Terrassement();
        
    }
}
