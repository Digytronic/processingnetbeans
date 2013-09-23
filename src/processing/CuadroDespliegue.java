/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package processing;

import processing.core.PApplet;

/**
 *
 * @author root
 */

public class CuadroDespliegue extends javax.swing.JFrame {
     processing.core.PApplet sketch;
    CuadroDespliegue(PApplet p){
        this.setBounds(200, 200, 600, 600);
        this.setSize(600, 600); //Las Dimensiones de la Ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBounds(200, 200, 600, 600);
         sketch = p;
        panel.add(sketch);
        this.add(panel);
        sketch.init(); //Esto es necesario para iniciar el Sketch
        this.setVisible(true);
    }

    
    public void dispose() {
       sketch.stop();
       setVisible(false);
       super.dispose();
    }
    
}