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

/**\brief Clase jugador extiende de la clase personaje*/
public class jugador extends Personaje {

    public jugador(GL gl1, float x, float y, float z, float v, float a) {
        super(gl1, x, y, z, v, a);
    }


    ///se reescriben los metodos de la calse mas general-
    
    ///declaramos las colisiones
    @Override
    public void avanzar() {
        this.x += Math.cos(this.angley) * vel;
        this.z += Math.sin(this.angley) * vel;

        if (mismetodos.colision(this, Practica1PG.enemigo)) {
            retro();
        }// this.y += Math.cos(this.anglex) * vel;
        for (Casa casa : Practica1PG.bar.casas) {
            if (mismetodos.colision(this, casa)) {
                retro();
            }
        }
        
        for (Moneda moneda : Practica1PG.moneda.monedas) {
            if (mismetodos.colision(this, moneda)) {
                retro();
            }
        }

    }
    
    public void avanzar1() {
        this.x += Math.cos(this.angley) * vel;
        this.z += Math.sin(this.angley) * vel;

    }

    @Override
    public void retro() {
        this.x -= Math.cos(this.angley) * vel;
        this.z -= Math.sin(this.angley) * vel;
        // this.y -= Math.cos(this.anglex) * vel;

        if (mismetodos.colision(this, Practica1PG.enemigo)) {
            avanzar1();
        }// this.y += Math.cos(this.anglex) * vel;
        for (Casa casa : Practica1PG.bar.casas) {
            if (mismetodos.colision(this, casa)) {
                avanzar1();
            }
        }
        
        for (Moneda moneda : Practica1PG.moneda.monedas) {
            if (mismetodos.colision(this, moneda)) {
                avanzar1();
            }
        }

    }
    
    
      public void retro1() {
        this.x -= Math.cos(this.angley) * vel;
        this.z -= Math.sin(this.angley) * vel;
        // this.y -= Math.cos(this.anglex) * vel;

    }

    
    
    
    
    
    

}
