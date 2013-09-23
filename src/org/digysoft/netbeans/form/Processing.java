/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.digysoft.netbeans.form;

import org.digysoft.processing.sketch.SketchCirculo;

/**
 *
 * @author root
 */
public class Processing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SketchCirculo sc = new SketchCirculo();
        new CuadroDespliegue(sc).setVisible(true);
    }
}
