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

    
    /**\brief Constructor1 de la clase Cubo */
    public Cubo(GL gl) {
        /**\param gl objeto de la libreria OpenGl*/
        this.gl = gl;
    }

    /**\brief Constructor2 de la clase Cubo */
    public Cubo(GL gl, Material material, Texture tex) {
        /**\param gl objeto de la libreria OpenGl*/
        this.gl = gl;
        /**\param matetrial. ingresamos el material de la clase material*/
        this.material = material;
        /**\param Textura. ingresamos la textura de la clase textura*/
        this.tex = tex;
    }

    /**\brief Constructor3 de la clase Cubo */
    public Cubo(GL gl, Texture tex) {
        /**\param gl objeto de la libreria OpenGl*/
        this.gl = gl;
        /**\param Textura. ingresamos la textura de la clase textura*/
        this.tex = tex;
    }
    
    /**\brief Constructor4 de la clase Cubo */
    public Cubo(GL gl1, Material mat) {
        /**\param gl objeto de la libreria OpenGl*/
        this.gl = gl1;
        /**\param matetrial. ingresamos el material de la clase material*/
        this.material=mat;
    }

    
     /**\brief Método para dibujar los edificios*/
    public void draw() {
        
        ///si el material es distinto de null se activa
        if (material !=null){
        material.activar();
        }
        
        ///si l atextura es diferente de null se activa
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
