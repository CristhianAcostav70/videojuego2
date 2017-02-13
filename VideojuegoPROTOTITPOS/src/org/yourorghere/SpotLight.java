/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.nio.FloatBuffer;
import javax.media.opengl.GL;

/**
 *
 * @author LABCOM
 */


/**\brief Clase SpotLight extiene de la clase Light */
public class SpotLight extends Light{

     float cutoff;
    float exponent;
    float[] direction;

        /**\brief constructor de la clase SpotLight*/
    public SpotLight(GL gl1, float x1, float y1, float z1, float[] a, float[] d, float[] s, boolean p, int id1) {
        super(gl1, x1, y1, z1, a, d, s, p, id1);
        cutoff = 45;
        direction = new float[4];
        direction[0] = 1;
        direction[1] = 0;
        direction[2] = 0;
        direction[3] = 0;
        exponent = 100;
    }

    public void setCutoff(int cutoff) {
        this.cutoff = cutoff;
    }

    public void setExponent(float exponent) {
        this.exponent = exponent;
    }

    public void setDirection(float[] direction) {
        this.direction = direction;
    }
/// metodo activa la luz direccional
    
    public void activate() {
        super.activate();
        gl.glLightf(id, GL.GL_SPOT_CUTOFF, cutoff);
        gl.glLightfv(id, GL.GL_SPOT_DIRECTION, direction, 0);
        gl.glLightf(id, GL.GL_SPOT_EXPONENT, exponent);

    }

    
///método activa la luz direcional qeu tiene la posicion de los personaje
    public void activate_p(Personaje p) {
        super.activate();
        float[] direction_p = {p.x + (float) Math.toDegrees(Math.cos(p.angley)),0, p.z + (float) Math.toDegrees(Math.sin(p.angley)), 1.0f};
        float[] position_p = {p.x, p.y, p.z,1};
        
        gl.glLightfv(id, GL.GL_POSITION, position_p,0);
        gl.glLightf(id, GL.GL_SPOT_CUTOFF, cutoff);
        gl.glLightfv(id, GL.GL_SPOT_DIRECTION, direction_p, 0);
        gl.glLightf(id, GL.GL_SPOT_EXPONENT, exponent);

    }
    
    ///método desactiva la luz direcional qeu tiene la posicion de los personaje
     public void dactivate_p(Personaje p) {
        super.dactivate();
        float[] direction_p = {p.x + (float) Math.toDegrees(Math.cos(p.angley)),0, p.z + (float) Math.toDegrees(Math.sin(p.angley)), 1.0f};
        float[] position_p = {p.x, p.y, p.z,1};
        
        gl.glLightfv(id, GL.GL_POSITION, position_p,0);
        gl.glLightf(id, GL.GL_SPOT_CUTOFF, cutoff);
        gl.glLightfv(id, GL.GL_SPOT_DIRECTION, direction_p, 0);
        gl.glLightf(id, GL.GL_SPOT_EXPONENT, exponent);

    }
}
