/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.digysoft.processing.sketch;

import java.awt.Color;
import processing.core.PApplet;

/**
 *
 * @author root
 */
public class SketchCirculo extends PApplet {
    
 
  public void setup() {
    size(400, 400);
    background(0);
  }
  public void draw() {
    background(0);
    Color c = Color.decode("#ff3322");
    fill(c.getRGB());
    ellipseMode(CENTER);
    ellipse(mouseX,mouseY,40,40);
  }
}