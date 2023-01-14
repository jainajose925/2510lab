package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * Draws a turtle.
 *
 * @author Jaina Jose
 *
 * @version 01/09/23
 */
public class Window extends PApplet {
  /**
   * Sets window size to 500x500.
   */
  public void settings() {
    size(500, 500);
  }

  /**
   * Draws a turtle.
   */
  public void draw() {
    background(255);
    noStroke();
    fill(0, 255, 0);
    ellipse(150, 150, 70, 50);
    ellipse(120, 200, 65, 50);
    ellipse(250, 150, 70, 50);
    ellipse(150, 250, 70, 50);
    ellipse(250, 250, 70, 50);
    fill(0, 102, 0);
    ellipse(200, 200, 100, 100);
  }

  /**
   * Drives the program.
   *
   * @param args unused.
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
