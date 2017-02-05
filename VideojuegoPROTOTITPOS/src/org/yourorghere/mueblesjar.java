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
public class mueblesjar {
    GL gl;
    messilla mys1;
    
    public mueblesjar(GL gl1){
    this.gl=gl1;
    mys1=new messilla(gl);
}
    
    public void draw(){
    
         gl.glPushMatrix();
         mys1.draw();
         gl.glPopMatrix();
         
         gl.glPushMatrix();
         gl.glTranslatef(3.0f, 0.0f, 0.0f);
         mys1.draw();
         gl.glPopMatrix();
         gl.glPushMatrix();
         gl.glTranslatef(6.0f, 0.0f, 0.0f);
         mys1.draw();
         gl.glPopMatrix();
        
    }
    
    
}
