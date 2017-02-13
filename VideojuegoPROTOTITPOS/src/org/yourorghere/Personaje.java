/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.util.ArrayList;
import javax.media.opengl.GL;

/**
 *
 * @author LABCOM
 */

/**\breif Clase personaje implemente la interfaz Movil*/
public class Personaje implements Movil{

    GL gl;
    Cubo cuerpo;
    piramide cabeza;
    float x, y, z, vel, anglex, angley, a;
    ArrayList<Bala> balas = new ArrayList();
    public boolean alive=true;

    /**\brief Constructo de la clase personaje*/
    public Personaje(GL gl1, float x, float y, float z, float v, float a) {
        this.gl = gl1;

        this.x = x;
        this.y = y;
        this.z = z;
        this.vel = v;
        this.angley = 0;

        this.angley = a;
        this.anglex = 0;

        cuerpo = new Cubo(gl, Practica1PG.material.get("blanco"),Practica1PG.textura.get("cj"));
        cabeza = new piramide(gl, Practica1PG.material.get("blanco"),Practica1PG.textura.get("bala"));

    }

        /**\brief metodo Draw para grafica el personaje*/
    public void draw() {
        ///si el personaje esta vivo se gráfica
        if(this.alive){

        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef((float) Math.toDegrees(-angley + Math.PI / 2), 0, 1, 0);
        //gl.glRotatef(personaje.anglex, 1, 0, 0);
        gl.glScalef(0.3f, 0.3f, 0.3f);

        gl.glColor3f(0.0f, 1.0f, 0.0f);
        gl.glPushMatrix();

        gl.glScalef(0.5f, 1.5f, 0.1f);
        cuerpo.draw();
        gl.glPopMatrix();
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glPushMatrix();
        // gl.glTranslatef(0.0f, 0.5f, 0.1f);
         gl.glScalef(0.5f, 0.5f, 0.5f);
        gl.glRotatef(90, 1, 0, 0);
        cabeza.draw();
        gl.glPopMatrix();

        gl.glPopMatrix();
       

        for (Bala bala : balas) {
            bala.draw();
        }
         }

    }

    ///El método actuar no indica el numero de balas y como se mueve
    public void actuar() {
        ArrayList<Bala> balast = new ArrayList();
        for (Bala bala : balas) {
            bala.actuar();
            
            if(bala.cont>182){
            balast.add(bala);
            }
        }
        for (Bala bala : balast) {
            balas.remove(bala);
            
        }
        
    }
    
    ///Método no actuar hace que las balas dejen de mover
    public void noactuar() {
     ArrayList<Bala> balast = new ArrayList();
        for (Bala bala : balas) {
            bala.actuar();
            
            if(bala.cont>0){
            balast.add(bala);
            }
        }
        for (Bala bala : balast) {
            balas.remove(bala);
            
        }
    
    }
    
    
    

    ///metodo avanzar mueve la bala en cada instante de tiempo con una velocidad determinada
    public void avanzar() {
        this.x += Math.cos(this.angley) * vel;
        this.z += Math.sin(this.angley) * vel;
      

    }

    public void retro() {
        this.x -= Math.cos(this.angley) * vel;
        this.z -= Math.sin(this.angley) * vel;
      

    }

    public void der() {
        this.x += Math.cos(this.angley + Math.PI / 2)*vel;
        this.z += Math.sin(this.angley + Math.PI / 2)*vel;

    }

    public void izq() {
        this.x += Math.cos(this.angley - Math.PI / 2)*vel;
        this.z += Math.sin(this.angley - Math.PI / 2)*vel;

    }

    public void disparar() {
        balas.add(new Bala(x, y, z, 0.5f, angley, gl));
    }
    
    
    public void nodisparar() {
       // balas.add(new Bala(x, y, z, 0.5f, angley, gl));
        balas.remove(new Bala(x,y,z,0.5f,angley,gl));
    }

    
    /// implementamos los metodos de la interfaz.
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
        return 0.4f;
    }
    public void die(){
    this.alive=false;
    
    }
    public void live(){
    this.alive=true;
    }
    public float getAngle(Movil o){
    return (float) Math.atan2(o.getZ()-z,o.getX()-x);
    }

}
