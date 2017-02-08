/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;

/**
 *
 * @author LABCOM
 */
public class piramide {

    GL gl;
    Material material;
    Texture tex;

    public piramide(GL gl) {
        this.gl = gl;

    }

    public piramide(GL gl, Material mat, Texture tex) {
        this.gl = gl;
        this.material = mat;
        this.tex = tex;
    }

    public piramide(GL gl1, Material mat) {
        this.gl = gl1;
        this.material = mat;
    }

    public piramide(GL gl, Texture tex) {
        this.gl = gl;
        this.tex = tex;
    }

    public void draw() {
          
        if (material !=null){
        material.activar();
        }
        
         if(tex!=null){
         
        tex.enable();
        tex.bind();
        }
        
        
        gl.glBegin(GL.GL_QUADS);
         gl.glTexCoord2f(0,1);
        gl.glVertex3f(-1, 0, -1);
         gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, 0, 1);
         gl.glTexCoord2f(1,1);
        gl.glVertex3f(1, 0, 1);
         gl.glTexCoord2f(1,-1);
        gl.glVertex3f(1, 0, -1);
        gl.glEnd();

        gl.glBegin(GL.GL_TRIANGLES);
         gl.glTexCoord2f(0.5f,1);
        gl.glVertex3f(0, 1, 0);
         gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, 0, -1);
         gl.glTexCoord2f(0,1);
        gl.glVertex3f(1, 0, -1);
        gl.glEnd();

        gl.glBegin(GL.GL_TRIANGLES);
         gl.glTexCoord2f(0.5f,1);
        gl.glVertex3f(0, 1, 0);
         gl.glTexCoord2f(1,0);
        gl.glVertex3f(1, 0, -1);
         gl.glTexCoord2f(0,0);
        gl.glVertex3f(1, 0, 1);
        gl.glEnd();

        gl.glBegin(GL.GL_TRIANGLES);
         gl.glTexCoord2f(0.5f,1);
        gl.glVertex3f(0, 1, 0);
         gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, 0, 1);
         gl.glTexCoord2f(1,0);
        gl.glVertex3f(-1, 0, -1);
        gl.glEnd();

        gl.glBegin(GL.GL_TRIANGLES);
         gl.glTexCoord2f(0.5f,1);
        gl.glVertex3f(0, 1, 0);
         gl.glTexCoord2f(1,0);
        gl.glVertex3f(1, 0, 1);
         gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, 0, 1);
        gl.glEnd();
        
         if(tex!=null){
        tex.disable();
        
        }

    }
}
