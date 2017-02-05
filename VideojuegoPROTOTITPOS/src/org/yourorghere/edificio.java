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
public class edificio {

    GL gl;
    Cubo ventana1;
    Cubo ventana2;
    Cubo ventana3;
    Cubo ventana4;
    Cubo puerta;
    Cubo bloque;

    public edificio(GL gl1) {
        this.gl = gl1;
        ventana1=new Cubo(gl);
        ventana2=new Cubo(gl);
        ventana3=new Cubo(gl);
        ventana4=new Cubo(gl);
        puerta=new Cubo(gl);
        bloque=new Cubo(gl);
        
        
    }
    
     public void draw() {
         
      gl.glColor3f(0.0f,0.6f,0.5f);
      
      gl.glPushMatrix();
      gl.glTranslatef(0.0f, 1.0f, 0.0f);
      gl.glScalef(1.0f, 2.0f, 1.0f);
      bloque.draw();
      gl.glPopMatrix();
      
    
      gl.glColor3f(1,1,1);
       gl.glPushMatrix();
      gl.glTranslatef(0,-0.5f,0.1f);
      gl.glScalef(0.3f,0.4f, 1f);
      puerta.draw();
      gl.glPopMatrix();
      gl.glColor3f(0.6f, 0.8f, 0.9f);
      gl.glPushMatrix();
      gl.glTranslatef(-0.5f, 0.5f, 0.1f);
      gl.glScalef(0.2f,0.2f, 1f);
      ventana1.draw();
      gl.glPopMatrix();
      gl.glColor3f(0.6f, 0.8f, 0.9f);
       gl.glPushMatrix();
      gl.glTranslatef(0.5f, 0.5f, 0.1f);
      gl.glScalef(0.2f,0.2f, 1f);
      ventana2.draw();
      gl.glPopMatrix();
      
      gl.glColor3f(0.6f, 0.8f, 0.9f);
      gl.glPushMatrix();
      gl.glTranslatef(-0.5f, 1.5f, 0.1f);
      gl.glScalef(0.2f,0.2f, 1f);
      ventana3.draw();
      gl.glPopMatrix();
      
      gl.glColor3f(0.6f, 0.8f, 0.9f);
       gl.glPushMatrix();
      gl.glTranslatef(0.5f, 1.5f, 0.1f);
      gl.glScalef(0.2f,0.2f, 1f);
      ventana4.draw();
      gl.glPopMatrix();
      
      
      /*
      
      
     
      
      /*
      
     
      
      
     
      
      
              */
      
      
       
      
        
        
        
        
        
    }
    
}
