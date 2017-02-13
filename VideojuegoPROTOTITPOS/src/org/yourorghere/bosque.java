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
public class bosque {
    GL gl;
    arbol arbolcr;
    
    
    
    /**\breif Constructor de la clase bosque*/
    public bosque(GL gl1) {
       
        this.gl = gl1;
        arbolcr=new arbol(gl);
        
    }
    
    /**\breif Metodo Draw para graficar el bosque*/
    public void draw(){
     gl.glPushMatrix();
      arbolcr.draw();
      gl.glPopMatrix();
      gl.glPushMatrix();
      gl.glTranslatef(3f,0f,0.1f);
      arbolcr.draw();
      gl.glPopMatrix();
      gl.glPushMatrix();
      gl.glTranslatef(6f,0f,0.1f);
      arbolcr.draw();
      gl.glPopMatrix();
      gl.glPushMatrix();
      gl.glTranslatef(9f,0f,0.1f);
      arbolcr.draw();
      gl.glPopMatrix();
    }
}
