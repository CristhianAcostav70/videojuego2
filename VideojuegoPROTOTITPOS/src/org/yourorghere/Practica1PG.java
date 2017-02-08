package org.yourorghere;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.j2d.TextRenderer;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.DebugGL;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLException;
import javax.media.opengl.glu.GLU;
import javax.swing.JOptionPane;

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
    int camaracr;
    int interruptor;
    Cubo cubo1;
    Cubo cubo2;
    Casa casa1;
    public static Barrio2 bar;
    public static Monedas moneda;
    arbol ar;
    bosque bos;
    bosque bos1;
    edificio ed;
    Condominios2 con;
    esfera sol;

    meza mes;
    silla sill;
    mueblesjar mys1;
    public static jugador jugador;
    public static Enemigo enemigo;

    Light luz0;
    SpotLight luz1;
    Cubo nuevo;
    public static int contador = 0;
    int time = 0;
    int vidas = 4;

    //  Material material;
    public static HashMap<String, Material> material;
    public static HashMap<String, Texture> textura;

    public static void main() {
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
                ;
            }
        )
        .start();
            }
        });
       
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();

    }

    public void init(GLAutoDrawable drawable) {

        GL gl = drawable.getGL();
        GLU glu = new GLU();
        drawable.setGL(new DebugGL(drawable.getGL()));

        float[] ambiental = {0.5f, 0.3f, 0, 1.0f};
        float[] diffuse = {0.5f, 0.3f, 0, 1.0f};
        float[] especular = {0.5f, 0.3f, 0, 1.0f};

        float[] ambiental1 = {0.7f, 0.0f, 0.2f, 1.0f};
        float[] diffuse1 = {0.7f, 0.0f, 0.2f, 1.0f};
        float[] especular1 = {0.7f, 0.0f, 0.2f, 1.0f};

        float[] ambiental2 = {0.6f, 0.8f, 0.9f, 1.0f};
        float[] diffuse2 = {0.6f, 0.8f, 0.9f, 1.0f};
        float[] especular2 = {0.6f, 0.8f, 0.9f, 1.0f};

        float[] ambiental3 = {0.0f, 0.6f, 0.5f, 1.0f};
        float[] diffuse3 = {0.0f, 0.6f, 0.5f, 1.0f};
        float[] especular3 = {0.0f, 0.6f, 0.5f, 1.0f};

        float[] ambiental4 = {0.6f, 0.7f, 0.3f, 1.0f};
        float[] diffuse4 = {0.6f, 0.7f, 0.3f, 1.0f};
        float[] especular4 = {0.6f, 0.7f, 0.3f, 1.0f};

        float[] ambiental5 = {0.6f, 0.7f, 0.1f, 1.0f};
        float[] diffuse5 = {0.6f, 0.7f, 0.1f, 1.0f};
        float[] especular5 = {0.6f, 0.7f, 0.1f, 1.0f};

        float[] ambiental6 = {0.6f, 0.7f, 0.1f, 1.0f};
        float[] diffuse6 = {0.6f, 0.7f, 0.1f, 1.0f};
        float[] especular6 = {0.6f, 0.7f, 0.1f, 1.0f};

        float[] ambiental7 = {0.5f, 0.5f, 0.5f, 1.0f};
        float[] diffuse7 = {0.5f, 0.5f, 0.5f, 1.0f};
        float[] especular7 = {0.5f, 0.5f, 0.5f, 1.0f};

        float[] ambiental8 = {1.0f, 0.9f, 0.2f, 1.0f};
        float[] diffuse8 = {1.0f, 0.9f, 0.2f, 1.0f};
        float[] especular8 = {1.0f, 0.9f, 0.2f, 1.0f};

        float[] ambiental9 = {1.0f, 1.0f, 1.0f, 1.0f};
        float[] diffuse9 = {1.0f, 1.0f, 1.0f, 1.0f};
        float[] especular9 = {1.0f, 1.0f, 1.0f, 1.0f};
        
         float[] ambiental10 = {0f,0f, 0f, 0f};
        float[] diffuse10 = {0f, 0f, 0f, 0f};
        float[] especular10 = {0f,0f, 0f, 0f};

        float shininess;
        Texture paredL = null;
        Texture loco = null;
        Texture vidrio = null;
        Texture edificio = null;
        Texture puerta = null;
        Texture tejas = null;
        Texture suelo = null;
        Texture tallo = null;
        Texture h1 = null;
        Texture h2 = null;
        Texture dolar = null;
        Texture bala = null;
        Texture cj = null;
        Texture poli = null;
        Texture mesa= null;

        textura = new HashMap<String, Texture>();
        try {
            paredL = TextureIO.newTexture(new File("pared.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }
        textura.put("paredL", paredL);

        try {
            vidrio = TextureIO.newTexture(new File("vidrio2.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("vidrio", vidrio);

        try {
            edificio = TextureIO.newTexture(new File("edificio.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("edificio", edificio);

        try {
            puerta = TextureIO.newTexture(new File("puerta1.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("puerta", puerta);

        try {
            tejas = TextureIO.newTexture(new File("tejas.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("tejas", tejas);

        try {
            suelo = TextureIO.newTexture(new File("suelo.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("suelo", suelo);

        try {
            tallo = TextureIO.newTexture(new File("tallo.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("tallo", tallo);

        try {
            h1 = TextureIO.newTexture(new File("h1.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("h1", h1);

        try {
            h2 = TextureIO.newTexture(new File("h2.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("h2", h2);

        try {
            dolar = TextureIO.newTexture(new File("dolar.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("dolar", dolar);

        try {
            bala = TextureIO.newTexture(new File("bala.png"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("bala", bala);

        try {
            cj = TextureIO.newTexture(new File("CJ.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("cj", cj);

        try {
            poli = TextureIO.newTexture(new File("poli.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("poli", poli);
        
         try {
            mesa = TextureIO.newTexture(new File("mesa.jpg"), false);
        } catch (IOException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GLException ex) {
            Logger.getLogger(Practica1PG.class.getName()).log(Level.SEVERE, null, ex);
        }

        textura.put("mesa", mesa);

      
        material = new HashMap<String, Material>();
        Material madera = new Material(gl, ambiental, diffuse, especular, 1);
        material.put("madera", madera);
        Material teja = new Material(gl, ambiental1, diffuse1, especular1, 1);
        material.put("teja", teja);
        Material cristal = new Material(gl, ambiental2, diffuse2, especular2, 1);
        material.put("cristal", cristal);
        Material verde = new Material(gl, ambiental3, diffuse3, especular3, 1);
        material.put("verde", verde);
        Material hojas1 = new Material(gl, ambiental4, diffuse4, especular4, 1);
        material.put("hojas1", hojas1);
        Material hojas2 = new Material(gl, ambiental5, diffuse5, especular5, 1);
        material.put("hojas2", hojas2);
        Material tallocol = new Material(gl, ambiental6, diffuse6, especular6, 1);
        material.put("tallocol", tallocol);
        Material gris = new Material(gl, ambiental7, diffuse7, especular7, 1);
        material.put("gris", gris);
        Material amarillo = new Material(gl, ambiental8, diffuse8, especular8, 1);
        material.put("amarillo", amarillo);
        Material blanco = new Material(gl, ambiental9, diffuse9, especular9, 1);
        material.put("blanco", blanco);
         Material negro = new Material(gl, ambiental10, diffuse10, especular10, 1);
        material.put("negro", negro);

        gl.glEnable(GL.GL_LIGHTING); 
        gl.glEnable(GL.GL_LIGHT0);   
        gl.glEnable(GL.GL_LIGHT1);
        gl.glEnable(GL.GL_LIGHT2);
        gl.glEnable(GL.GL_LIGHT3);
        gl.glEnable(GL.GL_TEXTURE_2D);

        bar = new Barrio2(gl);
        moneda = new Monedas(gl);

        nuevo = new Cubo(gl, blanco, suelo);

        bos = new bosque(gl);
        bos1 = new bosque(gl);
      
        con = new Condominios2(gl);
        mes = new meza(gl);
        sill = new silla(gl);
        mys1 = new mueblesjar(gl);
        camaracr = 1;
        interruptor = 1;
        sol = new esfera(gl, material.get("amarillo"));

        jugador = new jugador(gl, 2, 0, -3, 0.05f, 90);
        enemigo = new Enemigo(gl, 6, 0, 5, 0.1f, 90);


        float[] position = {0.0f, 5.0f, 1.0f, 1.0f};  
        float[] specularc = {1f, 1f, 1f, 1.0f};
        float[] ambient = {1f, 1f, 1f, 1.0f};
        float[] diffusec = {1f, 1f, 1f, 1.0f};
        luz0 = new Light(gl, 5, 5, 0, ambient, diffusec, specularc, true, GL.GL_LIGHT0);
        luz1 = new SpotLight(gl, 0, 0, 4, ambient, diffusec, specularc, true, GL.GL_LIGHT1);

        ManejadorTeclado mteclado = new ManejadorTeclado(jugador, this, luz0, luz1);
        drawable.addKeyListener(mteclado);

        ManejadorRaton mlistener = new ManejadorRaton();
        mlistener.init(drawable, jugador);

        System.err.println("INIT GL IS: " + gl.getClass().getName());

        
        gl.setSwapInterval(1);

        
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); 
        gl.glEnable(GL.GL_DEPTH_TEST);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { 

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
        GLU glu = new GLU();

       
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
    
        gl.glLoadIdentity();

        switch (camaracr) {
            case 1:
                glu.gluLookAt(0, 3, 3, jugador.x, jugador.y, jugador.z, 0, 1, 0);
                break;
            case 2:
                glu.gluLookAt(jugador.x, jugador.y, jugador.z, jugador.x + Math.cos(jugador.angley), jugador.y + Math.cos(jugador.anglex), jugador.z + Math.sin(jugador.angley), 0, 1, 0);
               
                break;
            case 3:

                glu.gluLookAt(jugador.x + Math.cos(jugador.angley + Math.PI) * 3, jugador.y + Math.cos(jugador.anglex) + 1, jugador.z + Math.sin(jugador.angley + Math.PI) * 3, jugador.x, jugador.y, jugador.z, 0, 1, 0);
                break;

            case 9:

                glu.gluLookAt(0, 17, 0, 6, 0, 0, 0, 1, 0);
                break;

            default:
                break;
        }

        gl.glPushMatrix();
        moneda.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 5.0f, 0.0f);
        gl.glScalef(0.5f, 0.5f, 0.5f);
        sol.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        
        enemigo.draw();
        enemigo.actuar();

        gl.glPopMatrix();

        gl.glPushMatrix();

        gl.glTranslatef(0f, -1f, 0.0f);
        gl.glScalef(20f, 0.0f, 20f);
        nuevo.draw();

        gl.glPopMatrix();

        gl.glPushMatrix();

        jugador.draw();

        jugador.actuar();
      
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(-1.5f, 0.0f, -6.0f);
        con.draw();
        gl.glPopMatrix();

        gl.glPushMatrix();
        //gl.glTranslatef(-1.5f, 0.0f, -6.0f);
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
        switch (interruptor) {
            case 4:
                luz0.activate();
                break;
            case 5:
                luz0.dactivate();
                break;
            case 6:
                luz1.activate_p(jugador);
                break;
            case 7:
                luz1.dactivate_p(jugador);
                break;
            default:
                break;
        }

        for (Bala bala : jugador.balas) {

            for (Moneda moneda1 : moneda.monedas) {
                if (mismetodos.colision(bala, moneda1)) {
                    moneda1.die();
                }

                if (mismetodos.colision(bala, enemigo)) {
                
                    enemigo.die();
                     enemigo.noactuar();
                }
            }
        }

        if (contador == 7) {
            
            JOptionPane.showMessageDialog(null, "You WIN");
            System.exit(0);
        }
        int timer = (time++) / 9;
        int timer2 = 180 - timer;

        if (timer2 == 0) {
            
            JOptionPane.showMessageDialog(null, "Tu tiempo se termino.. Ya valiste!!!!!");
            System.exit(0);
        }

        for (Bala bala : enemigo.balas) {
            if (mismetodos.colision(bala, jugador)) {
                vidas--;
                if (vidas == 0) {
                    jugador.die();
                   
                    JOptionPane.showMessageDialog(null, "¡GAME OVER!");
                    System.exit(0);
                };

            }
        }

        TextRenderer textRenderer2 = new TextRenderer(new Font("Verdana", Font.BOLD, 15));
        textRenderer2.beginRendering(500, 500);
        if (vidas == 4) {
            textRenderer2.setColor(Color.GREEN);
            textRenderer2.setSmoothing(true);
            textRenderer2.draw("VIDA: " + (25 * vidas) + "%", 0, 450);
        } else if (vidas == 3) {
            textRenderer2.setColor(Color.ORANGE);
            textRenderer2.setSmoothing(true);
            textRenderer2.draw("VIDA: " + (25 * vidas) + "%", 0, 450);
        }else if(vidas ==2 ){
            textRenderer2.setColor(Color.YELLOW);
            textRenderer2.setSmoothing(true);
            textRenderer2.draw("VIDA: " + (25 * vidas) + "%", 0, 450);
        }else if(vidas ==1){
            textRenderer2.setColor(Color.RED);
            textRenderer2.setSmoothing(true);
            textRenderer2.draw("VIDA: " + (25 * vidas) + "%", 0, 450);
        
        }

        textRenderer2.endRendering();

        TextRenderer textRenderer = new TextRenderer(new Font("Verdana", Font.BOLD, 15));
        textRenderer.beginRendering(500, 500);
        textRenderer.setColor(Color.GREEN);
        textRenderer.setSmoothing(true);
        textRenderer.draw("Monedas Capturadas:" + contador, 0, 50);
        textRenderer.endRendering();

        TextRenderer textRenderer1 = new TextRenderer(new Font("Verdana", Font.BOLD, 15));
        textRenderer1.beginRendering(500, 500);
        textRenderer1.setColor(Color.GREEN);
        textRenderer1.setSmoothing(true);
        textRenderer1.draw("Tiempo Transcurrido:" + (timer2), 250, 50);
        textRenderer1.endRendering();


    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}
