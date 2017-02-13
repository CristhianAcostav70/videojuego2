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

/**\brief Constructor de la clase Barrio2 */
public class Barrio2 {

    GL gl;
//    Casa casa1;
    
    ///Creamos un arreglo de casas donde vamos a guardar, las casas y sus respetivas posiciones.
    ArrayList<Casa> casas = new ArrayList();
    float[] posx = new float[13];
    float[] posy = new float[13];
    float[] posz = new float[13];
    float[] angley = new float[13];

    public Barrio2(GL gl) {
        this.gl = gl;

        posx[0] = 0;
        posx[1] = 3f;
        posx[2] = 6f;
        posx[3] = 9f;
        posx[4] = 12f;
        posx[5] = 15f;
        posx[6] = 15f;
        posx[7] = 15f;
        posx[8] = 12f;
        posx[9] = 9f;
        posx[10] = 6f;
        posx[11] = 3f;
        posx[12] = 0f;

        posy[0] = 0;
        posy[1] = 0;
        posy[2] = 0;
        posy[3] = 0;
        posy[4] = 0;
        posy[5] = 0;
        posy[6] = 0;
        posy[7] = 0;
        posy[8] = 0;
        posy[9] = 0;
        posy[10] = 0;
        posy[11] = 0;
        posy[12] = 0;
        
        
        posz[0] = -6f;
        posz[1] = -6f;
        posz[2] = -6f;
        posz[3] = -6f;
        posz[4] = -6f;
        posz[5] = -3f;
        posz[6] = 0f;
        posz[7] = -3f;
        posz[8] = 5f;
        posz[9] = 5f;
        posz[10] = 5f;
        posz[11] = 5f;
        posz[12] = 5f;
        
        
        
//         posz[0] = 0.1f;
//        posz[1] = 0.1f;
//        posz[2] = 0.1f;
//        posz[3] = 0.1f;
//        posz[4] = 0.1f;
//        posz[5] = 3f;
//        posz[6] = 6f;
//        posz[7] = 9f;
//        posz[8] = 11f;
//        posz[9] = 11f;
//        posz[10] = 11f;
//        posz[11] = 11f;
//        posz[12] = 11f;
        
        
        angley[0] = 0;
        angley[1] = 0;
        angley[2] = 0;
        angley[3] = 0;
        angley[4] = 0;
        angley[5] = 270;
        angley[6] = 270;
        angley[7] = 270;
        angley[8] = 180;
        angley[9] = 180;
        angley[10] = 180;
        angley[11] = 180;
        angley[12] = 180;
        
        for (int i = 0; i < 13; i++) {
            casas.add(new Casa(gl, posx[i], posy[i], posz[i], angley[i]));

        }

    }
    
    
     public void draw() {
        for (Casa casa : casas) {
            gl.glPushMatrix();
            gl.glTranslatef(casa.x, casa.y, casa.z);
            gl.glRotatef(casa.angley, 0, 1, 0);
            casa.draw();
            gl.glPopMatrix();
        }

     }
}
