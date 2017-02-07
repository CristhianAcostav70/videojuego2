/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.opengl.glu.GLU;

/**
 *
 * @author LABCOM
 */
public class ManejadorTeclado implements KeyListener {

    Personaje movil;
    Practica1PG principal;
    Light luz;
    SpotLight linterna;
    GLU glu = new GLU();

    public ManejadorTeclado(Personaje movil, Practica1PG principal, Light luz, SpotLight linterna) {
        this.movil = movil;
        this.principal = principal;
        this.luz = luz;
        this.linterna = linterna;
    }

    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'w') {
            this.movil.avanzar();
        } else if (e.getKeyChar() == 's') {
            this.movil.retro();
        } else if (e.getKeyChar() == 'd') {
            this.movil.der();
        } else if (e.getKeyChar() == 'a') {
            this.movil.izq();
        } else if (e.getKeyChar() == '1') {
            this.principal.camaracr = 1;
        } else if (e.getKeyChar() == '2') {
            this.principal.camaracr = 2;
        } else if (e.getKeyChar() == '3') {
            this.principal.camaracr = 3;
        } else if (e.getKeyChar() == 'l') {
            this.principal.interruptor = 4;
        } else if (e.getKeyChar() == 'o') {
            this.principal.interruptor = 5;
        } else if (e.getKeyChar() == 'k') {
            this.principal.interruptor = 6;
        } else if (e.getKeyChar() == 'i') {
            this.principal.interruptor = 7;
        } else if (e.getKeyChar()==' ' ) {
            this.movil.disparar();
//To change body of generated methods, choose Tools | Templates.
        } else if (e.getKeyChar()=='9'){
        this.principal.camaracr=9;
        }
    }

    public void keyPressed(KeyEvent ke) {

    }

    public void keyReleased(KeyEvent ke) {
    }

}
