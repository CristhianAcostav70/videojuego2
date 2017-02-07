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
 * @author crisspc
 */
public class Monedas {
    
    GL gl;
//    Casa casa1;
    ArrayList<Moneda> monedas = new ArrayList();
    float[] posx = new float[8];
    float[] posy = new float[8];
    float[] posz = new float[8];
    float[] angley = new float[8];

    public Monedas(GL gl) {
        this.gl = gl;
        posx[0] = 4;
        posx[1] = 10f;
        posx[2] = 8f;
        posx[3] = 8f;
        posx[4] = 10f;
        posx[5] = 0f;
        posx[6] = 11f;
        posx[7] = 5f;

        posy[0] = 0;
        posy[1] = 0;
        posy[2] = 0;
        posy[3] = 0;
        posy[4] = 0;
        posy[5] = 0;
        posy[6] = 0;
        posy[7] = 0;

        posz[0] = 10f;
        posz[1] = 7f;
        posz[2] = 6f;
        posz[3] = 9f;
        posz[4] = 3f;
        posz[5] = 3f;
        posz[6] = 2f;
        posz[7] = 8f;
        
        
         angley[0] = 0;
        angley[1] = 0;
        angley[2] = 0;
        angley[3] = 0;
        angley[4] = 0;
        angley[5] = 270;
        angley[6] = 270;
        angley[7] = 270;
        
        
         for (int i = 0; i < 7; i++) {
            int var = (int) Math.floor(Math.random() * 8);
            monedas.add(new Moneda(gl, posx[i], posy[i], posz[i], angley[i]));

        }
        
    }
    
     public void draw() {
        for (Moneda moneda : monedas) {
            gl.glPushMatrix();
            
            
            gl.glTranslatef(moneda.x, moneda.y, moneda.z);
            gl.glRotatef(moneda.angley, 0, 1, 0);
            moneda.draw();
            gl.glPopMatrix();
        }

     }
    
    
    
}
