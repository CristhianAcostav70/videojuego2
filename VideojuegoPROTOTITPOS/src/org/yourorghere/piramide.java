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
public class piramide {
GL gl;
    public piramide(GL gl1) {
        this.gl = gl1;
    }
    public void draw() {
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3f(-1, 0, -1);
        gl.glVertex3f(-1, 0, 1);
        gl.glVertex3f(1, 0, 1);
        gl.glVertex3f(1, 0, -1);
        gl.glEnd();
        
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(-1, 0, -1);
        gl.glVertex3f(1, 0, -1);
        gl.glEnd();
        
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(1, 0, -1);
        gl.glVertex3f(1, 0, 1);
        gl.glEnd();
        
         gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(-1, 0, 1);
        gl.glVertex3f(-1, 0, -1);
        gl.glEnd();
        
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(1, 0, 1);
        gl.glVertex3f(-1, 0, 1);
        gl.glEnd();
        
    }
    }
    

