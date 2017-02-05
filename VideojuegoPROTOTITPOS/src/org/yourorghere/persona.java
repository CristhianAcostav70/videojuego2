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
public class persona {

    GL gl;
    piramide cabeza;
    Cubo torzo;
    Cubo pierna1;
    Cubo pierna2;
    Cubo braso1;
    Cubo braso2;

    public persona(GL gl1) {
        this.gl = gl1;
        cabeza = new piramide(gl);
        torzo = new Cubo(gl);
        pierna1 = new Cubo(gl);
        pierna2 = new Cubo(gl);
        braso1 = new Cubo(gl);
        braso2 = new Cubo(gl);
    }

    public void draw() {

        gl.glColor3f(1.0f, 1.0f, 0.7f);
        gl.glPushMatrix();

        gl.glTranslatef(0.0f, 0.2f, 0.0f);
        gl.glScalef(0.2f, 0.2f, 0.2f);

        cabeza.draw();
        gl.glPopMatrix();
        gl.glColor3f(0.7f, 0.0f, 0.0f);
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 0.1f, 0.0f);
        gl.glScalef(0.1f, 0.16f, 0.1f);
        torzo.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 0.15f, 0.0f);
        gl.glScalef(0.3f, 0.01f, 0.1f);
        braso1.draw();
        gl.glPopMatrix();
        gl.glColor3f(0.0f, 0.0f, 0.7f);
        gl.glPushMatrix();
        gl.glTranslatef(-0.06f, 0.0f, 0.0f);
        gl.glScalef(0.03f, 0.2f, 0.1f);
        pierna1.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0.06f, 0.0f, 0.0f);
        gl.glScalef(0.03f, 0.2f, 0.1f);
        pierna2.draw();
        gl.glPopMatrix();

        /*
      
      
     
      
      /*
      
     
      
      
     
      
      
         */
    }

}
