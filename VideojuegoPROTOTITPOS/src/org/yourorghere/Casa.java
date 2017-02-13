/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Crissv_70
 */

/**\brief Clase Casa implementa la interfaz Movil*/
public class Casa implements Movil {

    GL gl;
    Cubo ventana1;
    Cubo ventana2;
    Cubo puerta;
    Cubo bloque;
    piramide techo;
     float x;
    float y;
    float z;
    float angley;
    
/**\brief Constructor de la clase Casa */
    public Casa(GL gl1,float x1, float y1, float z1, float angley1) {
        /**\param gl objeto de la libreria OpenGl*/
        this.gl = gl1;
        /**\param x1 parametro que nos da la posición en x*/
        this.x=x1;
        /**\param y1 parametro que nos da la posición en y*/
        this.y=y1;
        /**\param z1 parametro que nos da la posición en z*/
        this.z=z1;
        /**\param agnleyz nos da el ángulo*/
        this.angley=angley1;
        
        ///declaramos los objetos a graficar con su respectivo material y textura.
        ventana1 = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("vidrio"));
        
        ventana2 = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("vidrio"));
        
        puerta = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("puerta"));
        
        bloque = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("paredL"));
        
        techo = new piramide(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("tejas"));
    }

   
///Método Draw para dibujar la casa.
    public void draw() {

    
        gl.glPushMatrix();
        bloque.draw();
        gl.glPopMatrix();
        
        gl.glColor3f(1, 1, 1);
        gl.glPushMatrix();
        gl.glTranslatef(0, -0.5f, 0.1f);
        gl.glScalef(0.3f, 0.4f, 1f);
        puerta.draw();
        gl.glPopMatrix();
      
        gl.glPushMatrix();
        gl.glTranslatef(-0.5f, 0.5f, 0.1f);
        gl.glScalef(0.2f, 0.2f, 1f);
        ventana1.draw();
        gl.glPopMatrix();
    
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 0.5f, 0.1f);
        gl.glScalef(0.2f, 0.2f, 1f);
        ventana2.draw();
        gl.glPopMatrix();

       
        gl.glPushMatrix();
        gl.glTranslatef(0f, 1f, 0f);
        gl.glScalef(1.2f, 1.2f, 1.2f);
       
        techo.draw();
        gl.glPopMatrix();
        
    }
    /// metodo getX perteneciente a la interfaz
     public float getX() {
        return x;
    }
/// metodo getY perteneciente a la interfaz
    public float getY() {
        return y;
    }
 /// método getZ perteneciente a la interfaz
    public float getZ() {
        return z;
    }
    /// método getWidth perteneciente a la interfaz
    public float getWidth() {
        return 2.5f;
    }
}
