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

    /// Declaramos las componentes de la luz
    float[] ambiental;
    float[] diffuse;
    float[] specular;
    ///Declaramos los valores de las posiciones en cada eje.
    float x, y, z;
    GL gl;
    boolean puntual;
    int id;
    esfera bombillo;
    Cubo bomb;

    /**\brief Método constructor de la Clase Light*/
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

        /**\brief Metodo activate*/
    public void activate() {
        ///definimos el arreglo de posiciones de 4.
        float[] pos = new float[4];
        ///si la luz es puntual
        if (puntual) {
            pos[0] = x;
            pos[1] = y;
            pos[2] = z;
            pos[3] = 1;
        ///si la luz es direccional
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
    
    
    
    ///definimos in metodo para desactivar la luz
     public void dactivate() {
         
         ///asiganmos los valores de 0 para que la luz no se pueda ver. (se apague).
        float[] pos = new float[4];
        float[] specular = {0.0f, 0.0f, 0.0f, 1.0f};  
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



}
