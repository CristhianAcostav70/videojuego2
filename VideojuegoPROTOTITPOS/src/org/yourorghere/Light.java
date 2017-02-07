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
public class Light {

    float[] ambiental;
    float[] diffuse;
    float[] specular;
    float x, y, z;
    GL gl;
    boolean puntual;
    int id;
    esfera bombillo;
    Cubo bomb;

    public Light(GL gl1, float x1, float y1, float z1, float[] a, float[] d, float[] s, boolean p, int id1) {

        ambiental = a;
        diffuse = d;
        specular = s;
        puntual = p;
        gl = gl1;
        x = x1;
        y = y1;
        z = z1;
        id = id1;
        
        bombillo = new esfera(gl, Practica1PG.material.get("amarillo"));
        bomb=new Cubo(gl, Practica1PG.material.get("amarillo"));

    }

    public void activate() {
        float[] pos = new float[4];
        if (puntual) {
            pos[0] = x;
            pos[1] = y;
            pos[2] = z;
            pos[3] = 1;

        } else {
            pos[0] = x;
            pos[1] = y;
            pos[2] = z;
            pos[3] = 0;
        }
        gl.glLightfv(id, GL.GL_SPECULAR, specular, 0);
        gl.glLightfv(id, GL.GL_AMBIENT, ambiental, 0);
        gl.glLightfv(id, GL.GL_DIFFUSE, diffuse, 0);
        gl.glLightfv(id, GL.GL_POSITION, pos, 0);

    }
    
    
    
     public void dactivate() {
        float[] pos = new float[4];
        float[] specular = {0.0f, 0.0f, 0.0f, 1.0f};  //w=0(direccional)sitio concreto, w=1(puntual... todas las direcciones) donde quiero q este la posicion de la luz
        float[] ambiental = {0.0f, 0.0f, 0.0f, 1.0f};
        float[] diffuse= {0.0f, 0.0f, 0.0f, 1.0f};
       
        
        if (puntual) {
            pos[0] = x;
            pos[1] = y;
            pos[2] = z;
            pos[3] = 1;

        } else {
            pos[0] = x;
            pos[1] = y;
            pos[2] = z;
            pos[3] = 0;
        }
        gl.glLightfv(id, GL.GL_SPECULAR, specular, 0);
        gl.glLightfv(id, GL.GL_AMBIENT, ambiental, 0);
        gl.glLightfv(id, GL.GL_DIFFUSE, diffuse, 0);
        gl.glLightfv(id, GL.GL_POSITION, pos, 0);

    }

//    public void draw() {
//        gl.glPushMatrix();
//        gl.glTranslatef(x, y, z);
//        gl.glScalef(0.3f, 0.3f, 0.3f);
//        bombillo.draw();
//        gl.glPopMatrix();
//    }

}
