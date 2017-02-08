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
public class meza {
    GL gl;
    Cubo mes;
    Cubo pata;
    Cubo base;

    public meza(GL gl1) {
        this.gl=gl1;
        mes=new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("mesa"));
        pata=new Cubo(gl,Practica1PG.material.get("negro"));
        base=new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("mesa"));
    }
    
    public void draw(){
        
        //gl.glColor3f(1.0f, 0.9f, 0.2f);
        gl.glPushMatrix();
        gl.glScalef(0.5f, 0.05f, 0.5f);
        mes.draw();
        gl.glPopMatrix();
        
        //gl.glColor3f(0.5f, 0.5f, 0.5f);
        gl.glPushMatrix();
        gl.glTranslatef(0, -0.2f, 0);
        gl.glScalef(0.09f, 0.2f, 0.09f);
        pata.draw();
        gl.glPopMatrix();
        
        //gl.glColor3f(0.5f, 0.5f, 0.5f);
        gl.glPushMatrix();
        gl.glTranslatef(0, -0.4f, 0);
        gl.glScalef(0.2f, 0.02f, 0.2f);
        base.draw();
        gl.glPopMatrix();
        
    }
    
}
