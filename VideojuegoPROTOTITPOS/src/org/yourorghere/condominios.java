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
public class condominios {

    GL gl;
    edificio edifcr;

    public condominios(GL gl1) {
        this.gl = gl1;
        edifcr = new edificio(gl);
    }

    public void draw() {

        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 0f, -3.0f);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(3.5f, 0f, -3.0f);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(6.5f, 0f, -3.0f);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(9.5f, 0f, -3.0f);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(12.5f, 0f, -3.0f);

        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(20f, 0f, 3.5f);
        gl.glRotatef(270, 0, 1, 0);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(20f, 0f, 6.5f);
        gl.glRotatef(270, 0, 1, 0);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(20f, 0f, 9.5f);
        gl.glRotatef(270, 0, 1, 0);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(12.5f, 0f, 15f);
        gl.glRotatef(180, 0, 1, 0);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(9.5f, 0f, 15f);
        gl.glRotatef(180, 0, 1, 0);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(6.5f, 0f, 15f);
        gl.glRotatef(180, 0, 1, 0);
        edifcr.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(3.5f, 0f, 15f);
        gl.glRotatef(180, 0, 1, 0);
        edifcr.draw();
        gl.glPopMatrix();
    }

}
