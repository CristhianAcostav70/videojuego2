package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * Practica1PG.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel)
 * <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Practica1PG implements GLEventListener {

    GL gl;
    float i = 0;
    Cubo cubo1;
    Cubo cubo2;
    Casa casa1;
    Barrio bar;
    arbol ar;
    bosque bos;
    bosque bos1;
    edificio ed;
    condominios con;
    persona per;
    meza mes;
    silla sill;
    
    silla dis;
    mueblesjar mys1;

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Practica1PG());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();

    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();

        bar = new Barrio(gl);
        //ar = new arbol(gl);
        //casa1 = new Casa(gl);
        //cubo1 = new Cubo(gl);
        //cubo2 = new Cubo(gl);
        bos = new bosque(gl);
        bos1 = new bosque(gl);
        ed = new edificio(gl);
        con = new condominios(gl);
        mes = new meza(gl);
        sill = new silla(gl);
        mys1 = new mueblesjar(gl);
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
        gl.glEnable(GL.GL_DEPTH_TEST);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!

            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

//        i += 0.4f;
        camara.simular(gl, 0, 0, 0, (-MouseInfo.getPointerInfo().getLocation().y / 10), (-MouseInfo.getPointerInfo().getLocation().x / 10), 0);

        gl.glPushMatrix();
        gl.glTranslatef(-1.5f, 0.0f, -6.0f);
        con.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(-1.5f, 0.0f, -6.0f);
        bar.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(1.5f, -0.2f, -2.0f);
        gl.glScalef(0.5f, 0.8f, 0.5f);
        bos.draw();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, -0.2f, 2.0f);
        gl.glScalef(0.5f, 0.8f, 0.5f);
        bos.draw();
        gl.glPopMatrix();

        /*
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -0.2f, -1.0f);
        gl.glScalef(0.5f, 0.8f, 0.5f);
        mes.draw();
        gl.glPopMatrix();
         */
        gl.glPushMatrix();
        gl.glTranslatef(1.0f, -0.2f, -0.8f);
        gl.glScalef(0.5f, 0.8f, 0.5f);
        mys1.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(1.0f, -0.2f, 0.8f);
        gl.glScalef(0.5f, 0.8f, 0.5f);
        mys1.draw();
        gl.glPopMatrix();

        gl.glFlush();

    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}
