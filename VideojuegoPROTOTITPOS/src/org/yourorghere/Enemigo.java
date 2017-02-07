/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author LABCOM
 */
public class Enemigo extends Personaje{
    
   Cubo cuerpo;
    piramide cabeza;

    public Enemigo(GL gl1, float x, float y, float z, float v, float a) {
        super(gl1, x, y, z, v, a);
        
        cuerpo = new Cubo(gl, Practica1PG.material.get("blanco"),Practica1PG.textura.get("poli"));
        cabeza = new piramide(gl, Practica1PG.material.get("blanco"),Practica1PG.textura.get("bala"));
        
    }
    
 public void draw() {
        if (this.alive) {

            gl.glPushMatrix();
            gl.glTranslatef(x, y, z);
            gl.glRotatef((float) Math.toDegrees(-angley + Math.PI / 2), 0, 1, 0);
            //gl.glRotatef(personaje.anglex, 1, 0, 0);
            gl.glScalef(0.3f, 0.3f, 0.3f);

            gl.glColor3f(0.0f, 1.0f, 0.0f);
            gl.glPushMatrix();

            gl.glScalef(0.5f, 1.5f, 0.1f);
            cuerpo.draw();
            gl.glPopMatrix();
            gl.glColor3f(1.0f, 0.0f, 0.0f);
            gl.glPushMatrix();
            // gl.glTranslatef(0.0f, 0.5f, 0.1f);
             gl.glScalef(0.5f, 0.5f, 0.5f);;
            gl.glRotatef(90, 1, 0, 0);
            cabeza.draw();
            gl.glPopMatrix();

            gl.glPopMatrix();

            for (Bala bala : balas) {
                bala.draw();
            }
        }

    }
    
    
    
    
    
    public void actuar(){
     super.actuar();
     angley=(float) getAngle(Practica1PG.jugador);
     avanzar();
     
     if ((mismetodos.distance(this,Practica1PG.jugador)<3)&(Math.random()>0.97)){
     disparar();
     }
    
    }
    
}
