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
public class Condominios2 {
    
     GL gl;
///Creamos un arreglo de edificios donde vamos a guardar, los edificios y sus respetivas posiciones.
    ArrayList<edificio> edificios = new ArrayList();
    float[] posx = new float[13];
    float[] posy = new float[13];
    float[] posz = new float[13];
    float[] angley = new float[13];

    /**\brief Constructor de la clase Condominios2 */
    public Condominios2(GL gl) {
        /**\param gl objeto de la libreria OpenGl*/
        this.gl = gl;
         /// colocamos las posiciones en cada arreglo. Que asignaremos a las casas.
        posx[0] = 0.5f;
        posx[1] = 3.5f;
        posx[2] = 6.5f;
        posx[3] = 9.5f;
        posx[4] = 12.5f;
        posx[5] = 20f;
        posx[6] = 20f;
        posx[7] = 20f;
        posx[8] = 12.5f;
        posx[9] = 9.5f;
        posx[10] = 6.5f;
        posx[11] = 3.5f;
        posx[12] = 0.5f;
        
        
        
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
        posz[5] = 3.5f;
        posz[6] = 6.5f;
        posz[7] = 9.5f;
        posz[8] = 16f;
        posz[9] = 16f;
        posz[10] = 16f;
        posz[11] = 16f;
        posz[12] = 16f;
        
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
        ///recorremoas las posicones de los arreglos y los guardamos como atributos del objeto edificio en el arreglo.
        for (int i = 0; i < 13; i++) {
            edificios.add(new edificio(gl, posx[i], posy[i], posz[i], angley[i]));

        }
    }
    /**\brief Método para dibujar los edificios*/
    public void draw() {
        ///Recorremos el arreglo de edificios para graficárlas.
        for (edificio edificio : edificios) {
            gl.glPushMatrix();
            gl.glTranslatef(edificio.x, edificio.y, edificio.z);
            gl.glRotatef(edificio.angley, 0, 1, 0);
            edificio.draw();
            gl.glPopMatrix();
        }

     }
    
    
    
}
