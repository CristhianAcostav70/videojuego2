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
    
    /**\brief Constructor de la clase arbol */
    public arbol(GL gl1) {
        /**\param gl objeto de la libreria OpenGl*/
        this.gl = gl1;
        copa = new piramide(gl,Practica1PG.textura.get("h1"));
        hojas = new piramide(gl,Practica1PG.textura.get("h2"));
        tallo = new Cubo(gl,Practica1PG.textura.get("tallo"));
    }

    
    /**\brief Metodo para graficar el arbol*/
    public void draw() {
      
        gl.glScalef(0.2f, 0.5f, 0.2f);
        tallo.draw();
        
        ///usamos la pila de matrices de open gl para guardar la pocion, para que las transformacion de RTS solo afecten al objeto requerido
        gl.glPushMatrix();
       
        gl.glTranslatef(0f, 1f, 0f);
        gl.glScalef(2.0f, 1.5f, 2.0f);
        
        copa.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
      
        gl.glTranslatef(0f, 1.5f, 0f);
        gl.glScalef(2.0f, 1.5f, 2.0f);
        
        copa.draw();
        gl.glPopMatrix();

    }
}
