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
    

    public Casa(GL gl1,float x1, float y1, float z1, float angley1) {
        this.gl = gl1;
        this.x=x1;
        this.y=y1;
        this.z=z1;
        this.angley=angley1;
        ventana1 = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("vidrio"));
        
        ventana2 = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("vidrio"));
        
        puerta = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("puerta"));
        
        bloque = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("paredL"));
        
        techo = new piramide(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("tejas"));
    }

   

    public void draw() {

      //  gl.glColor3f(0.5f, 0.3f, 0);
        gl.glPushMatrix();
        bloque.draw();
        gl.glPopMatrix();
        // gl.glPushMatrix();
        gl.glColor3f(1, 1, 1);
        gl.glPushMatrix();
        gl.glTranslatef(0, -0.5f, 0.1f);
        gl.glScalef(0.3f, 0.4f, 1f);
        puerta.draw();
        gl.glPopMatrix();
       // gl.glColor3f(0.6f, 0.8f, 0.9f);
        gl.glPushMatrix();
        gl.glTranslatef(-0.5f, 0.5f, 0.1f);
        gl.glScalef(0.2f, 0.2f, 1f);
        ventana1.draw();
        gl.glPopMatrix();
     //   gl.glColor3f(0.6f, 0.8f, 0.9f);
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 0.5f, 0.1f);
        gl.glScalef(0.2f, 0.2f, 1f);
        ventana2.draw();
        gl.glPopMatrix();

       // gl.glColor3f(0.7f, 0.0f, 0.2f);
        gl.glPushMatrix();
        gl.glTranslatef(0f, 1f, 0f);
        gl.glScalef(1.2f, 1.2f, 1.2f);
        // gl.glScalef(0.2f,0.2f, 1f);
        techo.draw();
        gl.glPopMatrix();
        
    }
    
     public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
    public float getWidth() {
        return 2.5f;
    }
}
