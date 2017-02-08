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
public class Cubo {

    GL gl;
    Material material;
    Texture tex;

    public Cubo(GL gl) {
        this.gl = gl;
    }

    public Cubo(GL gl, Material material, Texture tex) {
        this.gl = gl;
        this.material = material;
        this.tex = tex;
    }

    public Cubo(GL gl, Texture tex) {
        this.gl = gl;
        this.tex = tex;
    }
    

    public Cubo(GL gl1, Material mat) {
        this.gl = gl1;
        this.material=mat;
    }

    public void draw() {
        //FRONT
        
        if (material !=null){
        material.activar();
        }
        

        if(tex!=null){
         
        tex.enable();
        tex.bind();
        }
        //material.activar();
         gl.glBegin(gl.GL_QUADS);
        gl.glNormal3f(0, 0, -1);
        gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, -1, -1);
        gl.glTexCoord2f(0,1);
        gl.glVertex3f(-1, 1, -1);
        gl.glTexCoord2f(1,1);
        gl.glVertex3f(1, 1, -1);
        gl.glTexCoord2f(1,0);
        gl.glVertex3f(1, -1, -1);

        //Front
//        gl.glColor3f(1.0f, 1.0f, 0.5f);
        gl.glNormal3f(0, 0, 1);
        gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, -1, 1);
        gl.glTexCoord2f(0,1);
        gl.glVertex3f(-1, 1, 1);
        gl.glTexCoord2f(1,1);
        gl.glVertex3f(1, 1, 1);
        gl.glTexCoord2f(1,0);
        gl.glVertex3f(1, -1, 1);

        //Left
//        gl.glColor3f(0.0f, 0.0f, 1.0f);
        gl.glNormal3f(-1, 0, 0);
        gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, -1, -1);
        gl.glTexCoord2f(0,1);
        gl.glVertex3f(-1, 1, -1);
        gl.glTexCoord2f(1,1);
        gl.glVertex3f(-1, 1, 1);
        gl.glTexCoord2f(1,0);
        gl.glVertex3f(-1, -1, 1);

        //Right
//        gl.glColor3f(0.0f, 1.0f, 0.0f);
        gl.glNormal3f(1, 0, 0);
        gl.glTexCoord2f(0,0);
        gl.glVertex3f(1, -1, -1);
        gl.glTexCoord2f(0,1);
        gl.glVertex3f(1, 1, -1);
        gl.glTexCoord2f(1,1);
        gl.glVertex3f(1, 1, 1);
        gl.glTexCoord2f(1,0);
        gl.glVertex3f(1, -1, 1);

        //Top
//        gl.glColor3f(0.0f, 1.0f, 1.0f);
        gl.glNormal3f(0, 1, 0);
        gl.glTexCoord2f(0,0);
        gl.glVertex3f(-1, 1, 1);
        gl.glTexCoord2f(0,1);
        gl.glVertex3f(-1, 1, -1);
        gl.glTexCoord2f(1,1);
        gl.glVertex3f(1, 1, -1);
        gl.glTexCoord2f(1,0);
        gl.glVertex3f(1, 1, 1);

        //Bottom
//        gl.glColor3f(1.0f, 0.0f, 1.0f);
        gl.glNormal3f(0, -1, 0);
        gl.glVertex3f(-1, -1, 1);
        gl.glVertex3f(-1, -1, -1);
        gl.glVertex3f(1, -1, -1);
        gl.glVertex3f(1, -1, 1);
        gl.glEnd();
        
        if(tex!=null){
        tex.disable();
        
        }
       
    }
}
