/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

/**
 *
 * @author LABCOM
 */
public class mismetodos {
    public static  boolean colision (Movil m1, Movil m2){
//    return Math.sqrt(((b.getX()-e.getX()))*((b.getX()-e.getX()))) +((b.getZ()-e.getZ())*(b.getZ()-e.getZ()))<((b.getWidth()/2) +(e.getWidth()/2));
    return distance(m1,m2)<(m1.getWidth()/2)+(m2.getWidth()/2);
    }

    
    
    public static double distance (Movil m1,Movil m2){
    return Math.sqrt(((m1.getX()-m2.getX())*(m1.getX()-m2.getX()))+((m1.getZ()-m2.getZ())*(m1.getZ()-m2.getZ())));
    }
    
    
}
