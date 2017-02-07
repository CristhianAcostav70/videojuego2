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
public class Bala implements Movil{
    float x,y,z,vel,angley;
    Cubo cuerpo;
    piramide p;
    GL gl;
    int cont;

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
    
      public void avanzar() {
       this.x += Math.cos(this.angley)*vel;
        this.z += Math.sin(this.angley)*vel;
    }
      
      public void draw(){
      gl.glPushMatrix();
      gl.glTranslatef(x, y, z);
      gl.glScalef(0.1f, 0.1f, 0.1f);
      cuerpo.draw();
      gl.glPopMatrix();
      }
      
      
      public void actuar(){
      avanzar();
      cont++;
      }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
       return z;
    }

    public float getWidth() {
       return 0.3f;
    }
    
    
}
