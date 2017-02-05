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
public class messilla {
    GL gl;
    meza mes;
    silla sill;

    public messilla(GL gl1) {
        this.gl=gl1;
        mes = new meza(gl);
        sill = new silla(gl);
    }
     public void draw(){
     
         gl.glPushMatrix();
         gl.glTranslatef(0.0f, 0.2f, 0.0f);
         mes.draw();
         gl.glPopMatrix();
         
         gl.glPushMatrix();
         gl.glTranslatef(0.8f, -0.07f, 0.0f);
         gl.glScalef(0.5f, 0.5f, 0.5f);
         sill.draw();
         gl.glPopMatrix();
         
         
         gl.glPushMatrix();
         gl.glRotatef(180, 0, 1, 0);
         gl.glTranslatef(0.8f, -0.07f, 0.0f);
         gl.glScalef(0.5f, 0.5f, 0.5f);
         sill.draw();
         gl.glPopMatrix();
         
     }
}
