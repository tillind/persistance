/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ul.m2.m2projetpersistance.launch;

import fr.ul.m2.m2projetpersistance.fabric.LotDeux;
import fr.ul.m2.m2projetpersistance.fabric.LotUn;

/**
 *
 * @author alex
 */
public class launch {
    
    public static void main(String[] args) {
        LotUn lot = new LotUn();
        lot.createProjectEnded();
        LotDeux lot2 = new LotDeux();
        lot2.createProjectEnded();
    }
}
