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
public class silla {
    GL gl;
    
    Cubo base;
    Cubo espaldar;
    Cubo pata1;
    Cubo basp;
    
    public silla(GL gl1){

        this.gl=gl1;
        base= new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("mesa"));
        espaldar =new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("mesa"));
        pata1=new Cubo(gl,Practica1PG.material.get("negro"));
        basp=new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("mesa"));
        
        
       
}
   public void draw(){
       
       
       // gl.glColor3f(0.6f, 0.7f, 0.4f);
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 0.2f, 0);
        gl.glScalef(0.05f, 0.2f, 0.5f);
        espaldar.draw();
        gl.glPopMatrix();
       
             
       // gl.glColor3f(0.6f, 0.7f, 0.4f);
        gl.glPushMatrix();
        gl.glScalef(0.5f, 0.05f, 0.5f);
        base.draw();
        gl.glPopMatrix();
        
      //  gl.glColor3f(0.5f, 0.5f, 0.5f);
        gl.glPushMatrix();
        gl.glTranslatef(0, -0.2f, 0);
        gl.glScalef(0.09f, 0.2f, 0.09f);
        pata1.draw();
        gl.glPopMatrix();
        
       // gl.glColor3f(0.5f, 0.5f, 0.5f);
        gl.glPushMatrix();
        gl.glTranslatef(0, -0.4f, 0);
        gl.glScalef(0.2f, 0.02f, 0.2f);
        basp.draw();
        gl.glPopMatrix();
        }
}
