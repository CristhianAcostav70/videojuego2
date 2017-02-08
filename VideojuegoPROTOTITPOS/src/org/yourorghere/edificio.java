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
public class edificio implements Movil {

    GL gl;
    Cubo ventana1;
    Cubo ventana2;
    Cubo ventana3;
    Cubo ventana4;
    Cubo puerta;
    Cubo bloque;
    float x;
    float y;
    float z;
    float angley;

    public edificio(GL gl1,float x1, float y1, float z1, float angley1) {
        this.gl = gl1;
        this.x=x1;
        this.y=y1;
        this.z=z1;
        this.angley=angley1;
        ventana1 = new Cubo(gl, Practica1PG.textura.get("vidrio"));
        ventana2 = new Cubo(gl, Practica1PG.textura.get("vidrio"));
        ventana3 = new Cubo(gl, Practica1PG.textura.get("vidrio"));
        ventana4 = new Cubo(gl, Practica1PG.textura.get("vidrio"));
        puerta = new Cubo(gl, Practica1PG.textura.get("puerta"));
        bloque = new Cubo(gl, Practica1PG.material.get("blanco"),Practica1PG.textura.get("edificio"));

    }

    public void draw() {

      //gl.glColor3f(0.0f,0.6f,0.5f);
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 1.0f, 0.0f);
        gl.glScalef(1.0f, 2.0f, 1.0f);
        bloque.draw();
        gl.glPopMatrix();

        //  gl.glColor3f(1,1,1);
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
        // gl.glColor3f(0.6f, 0.8f, 0.9f);
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 0.5f, 0.1f);
        gl.glScalef(0.2f, 0.2f, 1f);
        ventana2.draw();
        gl.glPopMatrix();

        // gl.glColor3f(0.6f, 0.8f, 0.9f);
        gl.glPushMatrix();
        gl.glTranslatef(-0.5f, 1.5f, 0.1f);
        gl.glScalef(0.2f, 0.2f, 1f);
        ventana3.draw();
        gl.glPopMatrix();

        // gl.glColor3f(0.6f, 0.8f, 0.9f);
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 1.5f, 0.1f);
        gl.glScalef(0.2f, 0.2f, 1f);
        ventana4.draw();
        gl.glPopMatrix();

        /*
      
      
     
      
         /*
      
     
      
      
     
      
      
         */
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
        return 3f;
    }

}
