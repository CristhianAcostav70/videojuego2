/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

/**
 *
 * @author LABCOM
 */
public class ManejadorRaton implements GLEventListener, MouseListener,MouseMotionListener  {
    
    
    float oldx;
    float oldy;
    Personaje personaje;
    
    public void init (GLAutoDrawable  drawable, Personaje p){
    drawable.addMouseMotionListener(this);
    oldx=0;
    oldy=0;
    personaje=p;
    }

    public void init(GLAutoDrawable drawable) {
       
    }

    public void display(GLAutoDrawable drawable) {
        
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
      
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
       
    }

    public void mouseClicked(MouseEvent me) {
        
    }

    public void mousePressed(MouseEvent me) {
       
    }

    public void mouseReleased(MouseEvent me) {
        
    }

    public void mouseEntered(MouseEvent me) {
       
    }

    public void mouseExited(MouseEvent me) {
        
    }

    public void mouseDragged(MouseEvent me) {
       
    }

    public void mouseMoved(MouseEvent e) {
        float x=e.getX();
        float y=e.getY();
        personaje.angley+=(x-oldx)/100;
        personaje.anglex+=(y-oldy)/100;
        oldx=x;
        oldy=y;
    }
    
}
