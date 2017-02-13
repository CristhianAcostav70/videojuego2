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


public class Material {
    GL gl;
    float[] ambiental = {0, 0, 0, 1.0f};
    float[] diffuse = {0, 0, 0, 1.0f};
    float[] specular = {0, 0, 0, 1.0f};
    float[] emisive = {0, 0, 0, 1.0f};
    float shininess;

    
    /**\Cosntructor de la clase material*/
    public Material(GL gl, float []a, float[]d, float[]sp, float sh) {
        this.gl = gl;
        ambiental= a;
        diffuse=d;
        specular=sp;
        this.shininess = sh;
    }

    public void setGl(GL gl) {
        this.gl = gl;
    }

    public void setAmbiental(float[] ambiental) {
        this.ambiental = ambiental;
    }

    public void setDiffuse(float[] diffuse) {
        this.diffuse = diffuse;
    }

    public void setSpecular(float[] specular) {
        this.specular = specular;
    }

    public void setEmisive(float[] emisive) {
        this.emisive = emisive;
    }

    public void setShininess(float shininess) {
        this.shininess = shininess;
    }
    
    ///Con el metodo activar activamos las luces 
    public void activar() {
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, ambiental, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, specular, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_EMISSION, emisive, 0);
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS,  this.shininess);
    }
    ///Con este metodo los valores de los parametos son 0 y asi se desactiva la luz
    public void desactivar() {
        float[] ambiental1 = {0, 0, 0, 1.0f};
        float[] diffuse1 = {0, 0, 0, 1.0f};
        float[] specular1 = {0, 0, 0, 1.0f};
        float[] emisive1 = {0, 0, 0, 1.0f};
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, ambiental1, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diffuse1, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, specular1, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_EMISSION, emisive1, 0);
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS,  this.shininess);
        
    }
    
    
}
