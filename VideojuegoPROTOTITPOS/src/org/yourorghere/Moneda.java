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
public class Moneda  implements Movil {
     GL gl;   
    Cubo bloque;
    
    float x;
    float y;
    float z;
    float angley;
    public boolean alive=true;
    

    public Moneda(GL gl1,float x1, float y1, float z1, float angley1) {
        this.gl = gl1;
        this.x=x1;
        this.y=y1;
        this.z=z1;
        this.angley=angley1;
       
        
        bloque = new Cubo(gl,Practica1PG.material.get("blanco"),Practica1PG.textura.get("dolar"));
        
        
    }

   

    public void draw() {
        if(this.alive){

      //  gl.glColor3f(0.5f, 0.3f, 0);
        gl.glPushMatrix();
        //gl.glTranslatef(0, 1, 0);
        gl.glScalef(0.1f, 0.1f, 0.1f);
        
        bloque.draw();
        gl.glPopMatrix();
        
        }  
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
        return 1f;
    }
    
    public void die(){
    if(alive){
        this.alive = false;
        Practica1PG.contador ++;
       
    }
}
}


