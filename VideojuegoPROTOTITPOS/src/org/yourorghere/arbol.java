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
public class arbol {

    GL gl;
    piramide copa;
    piramide hojas;
    Cubo tallo;

    public arbol(GL gl1) {
        this.gl = gl1;
        copa = new piramide(gl);
        hojas = new piramide(gl);
        tallo = new Cubo(gl);
    }

    public void draw() {
        gl.glColor3f(0.6f, 0.4f, 0.1f);
        //gl.glPushMatrix();
       // gl.glTranslatef(0, 0, 0);
        gl.glScalef(0.2f, 0.5f, 0.2f);
        tallo.draw();
        //gl.glPopMatrix();
        //gl.glPushMatrix();
        // gl.glTranslatef(0,0.5f,0.1f);

        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.7f, 0.3f);
        gl.glTranslatef(0f, 1f, 0f);
        gl.glScalef(2.0f, 1.5f, 2.0f);
        // gl.glScalef(0.2f,0.2f, 1f);
        copa.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3f(0.6f, 0.7f, 0.1f);
        gl.glTranslatef(0f, 1.5f, 0f);
        gl.glScalef(2.0f, 1.5f, 2.0f);
        // gl.glScalef(0.2f,0.2f, 1f);
        copa.draw();
        gl.glPopMatrix();

    }
}
