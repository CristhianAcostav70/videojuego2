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
public class Barrio {
    GL gl;
    Casa casacr;

    public Barrio(GL gl1) {
        this.gl = gl1;
        casacr=new Casa(gl);
        
    }
    
    public void draw() {
     
      gl.glPushMatrix();
      casacr.draw();
      gl.glPopMatrix();
      gl.glPushMatrix();
      gl.glTranslatef(3f,0f,0.1f);
        casacr.draw();
      gl.glPopMatrix();
      gl.glPushMatrix();
      gl.glTranslatef(6f,0f,0.1f);
        casacr.draw();
      gl.glPopMatrix();
      gl.glPushMatrix();
      gl.glTranslatef(9f,0f,0.1f);
        casacr.draw();
      gl.glPopMatrix();
       gl.glPushMatrix();
      gl.glTranslatef(12f,0f,1f);
     
        casacr.draw();
      gl.glPopMatrix();
       gl.glPushMatrix();
      gl.glTranslatef(15f,0f,3f);
      gl.glRotatef(270, 0, 1, 0);
        casacr.draw();
      gl.glPopMatrix();
       gl.glPushMatrix();
      gl.glTranslatef(15f,0f,6f);
      gl.glRotatef(270, 0, 1, 0);
        casacr.draw();
      gl.glPopMatrix();
       gl.glPushMatrix();
      gl.glTranslatef(15f,0f,9f);
      gl.glRotatef(270, 0, 1, 0);
        casacr.draw();
      gl.glPopMatrix();
       gl.glPushMatrix();
      gl.glTranslatef(12f,0f,11f);
      gl.glRotatef(180, 0, 1, 0);
        casacr.draw();
      gl.glPopMatrix();
       gl.glPushMatrix();
      gl.glTranslatef(9f,0f,11f);
      gl.glRotatef(180, 0, 1, 0);
        casacr.draw();
      gl.glPopMatrix();
      gl.glPushMatrix();
      gl.glTranslatef(6f,0f,11f);
      gl.glRotatef(180, 0, 1, 0);
        casacr.draw();
      gl.glPopMatrix();
       gl.glPushMatrix();
      gl.glTranslatef(3f,0f,11f);
      gl.glRotatef(180, 0, 1, 0);
        casacr.draw();
      gl.glPopMatrix();
    }
    }
    

