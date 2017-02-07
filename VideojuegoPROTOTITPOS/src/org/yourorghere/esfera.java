/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

/**
 *
 * @author crisspc
 */
public class esfera {

    GL gl;
    GLU glu;
    GLUT glut = new GLUT();
    Material material;

    public esfera(GL gl, Material material) {
        this.gl = gl;
        this.material = material;
    }

    public void draw() {

        material.activar();
//        gl.glScalef(1, 1, 1);
        glut.glutSolidSphere(2, 15, 15);

    }
}
