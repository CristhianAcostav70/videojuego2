/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;
import javax.media.opengl.GL;

/**
 *
 * @author fing.labcom
 */
public class camara {
    public static void simular(GL gl,float x, float y, float z,float ax ,float ay ,float az){
        gl.glTranslatef(-x, -y, -z);
        gl.glRotatef(-ax, 1, 0, 0);
        gl.glRotatef(-ay, 0, 1, 0);
        gl.glRotatef(-az, 0, 0, 1);
        
    }
    
}
