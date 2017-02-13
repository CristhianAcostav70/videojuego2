/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author crisspc
 */

/**\brief Clase bala implementa la interfaz Movil*/
public class Bala implements Movil{
    float x,y,z,vel,angley;
    Cubo cuerpo;
    piramide p;
    GL gl;
    int cont;

    /**\brief Constructor de la clase Bala */
    public Bala(float x, float y, float z,float vel, float angley, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.vel=vel;
        this.angley = angley;
        this.cuerpo = cuerpo;
        this.gl = gl;
        cuerpo = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("bala"));
        p= new piramide(gl,Practica1PG.material.get("gris"));
        cont=0;
        
    }
    
    /**\brief Metodo avanzar  */
      public void avanzar() {
       ///Método para qeu la Bala no se qeude estàtica sino que avance en cada instante de tiempo.
       this.x += Math.cos(this.angley)*vel;
        this.z += Math.sin(this.angley)*vel;
    }
      
      
      /// metodo Darw para dibujar la bala.
      public void draw(){
      gl.glPushMatrix();
      gl.glTranslatef(x, y, z);
      gl.glScalef(0.1f, 0.1f, 0.1f);
      cuerpo.draw();
      gl.glPopMatrix();
      }
      
      /// Metodo actuar qeu utilizar el metodo avanzar.
      public void actuar(){
      avanzar();
      cont++;
      }

      /// metodo getX perteneciente a la interfaz
    public float getX() {
        return x;
    }
    /// metodo getY perteneciente a la interfaz
    public float getY() {
        return y;
    }
    /// metodo getZ perteneciente a la interfaz
    public float getZ() {
       return z;
    }

    /// metodo getWidth perteneciente a la interfaz
    public float getWidth() {
       return 0.3f;
    }
    
    
}
