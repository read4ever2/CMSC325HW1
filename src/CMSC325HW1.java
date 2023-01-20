/*
 * Filename: CMSC325HW1.java
 * Author: Will Feighner (Modified from CMSC325EX1.java)
 * Date: 2023 01 20
 * Purpose: This program uses simple Java graphics objects to create a simple scene.
 * The scene is a representation of Isaac Newton's thought experiment of placing a cannon on a mountain
 * and firing cannonballs at different speeds to finally achieve orbit.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class CMSC325HW1 extends JPanel {

  /**
   * Draw all graphical objects
   *
   * @param g the <code>Graphics</code> object to protect
   */
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // Call methods to draw
    drawBackground(g);
    drawCircle(g);
    drawMountain(g);
    drawArcs(g);
    drawCannon(g);
    drawCannonBall(g);
    drawLand(g);
  }

  /**
   * Method to draw Blue circle
   *
   * @param g Graphics object
   */
  private void drawCircle(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    Ellipse2D myCircle = new Ellipse2D.Double(100, 100, 200, 200);
    g2d.setColor(Color.blue);
    g2d.setPaint(Color.blue);
    g2d.fill(myCircle);
    g2d.draw(myCircle);
  }

  /**
   * Draw cannonball with gradient
   *
   * @param g Graphics object
   */
  private void drawCannonBall(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    Ellipse2D cannonBall = new Ellipse2D.Double(60, 190, 20, 20);
    GradientPaint blackToGrey = new GradientPaint(0, 0, Color.darkGray, 100, 0, Color.lightGray);
    g2d.setPaint(blackToGrey);
    g2d.fill(cannonBall);
    g2d.draw(cannonBall);
  }

  /**
   * Draw brown trapezoid for mountain
   *
   * @param g Graphics Object
   */
  private void drawMountain(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    GeneralPath mountain = new GeneralPath();
    mountain.moveTo(180, 102);
    mountain.lineTo(220, 102);
    mountain.lineTo(210, 80);
    mountain.lineTo(190, 80);
    mountain.closePath();
    graphics2D.setColor(new Color(102, 51, 0));
    graphics2D.setPaint(new Color(102, 51, 0));
    graphics2D.fill(mountain);
    graphics2D.draw(mountain);
  }

  /**
   * Draw Black background to fill panel
   *
   * @param g Graphics Object
   */
  private void drawBackground(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    Rectangle2D background = new Rectangle2D.Double(0, 0, 400, 400);
    graphics2D.setPaint(Color.black);
    graphics2D.fill(background);
    graphics2D.draw(background);
  }

  /**
   * Draw ellipses and rectangle to form cannon
   *
   * @param g Graphics Object
   */
  private void drawCannon(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    Ellipse2D breech = new Ellipse2D.Double(170, 60, 10, 20);
    Rectangle2D barrel = new Rectangle2D.Double(175, 60, 50, 20);
    Ellipse2D muzzle = new Ellipse2D.Double(220, 60, 10, 20);

    graphics2D.setPaint(Color.darkGray);
    graphics2D.fill(barrel);
    graphics2D.fill(breech);
    graphics2D.fill(muzzle);

    graphics2D.draw(barrel);
    graphics2D.draw(breech);

    graphics2D.setStroke(new BasicStroke(1.5f));
    graphics2D.setPaint(Color.black);
    graphics2D.draw(muzzle);

    Ellipse2D hole = new Ellipse2D.Double(222.5, 65, 5, 10);
    graphics2D.fill(hole);
    graphics2D.draw(hole);
  }

  /**
   * Draw arcs to represent cannonball paths
   *
   * @param g Graphics Object
   */
  private void drawArcs(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    Arc2D orbit = new Arc2D.Double(70, 70, 260, 260, 180, 270, Arc2D.OPEN);
    Arc2D failQuarter = new Arc2D.Double(100, 70, 200, 250, 0, 90, Arc2D.OPEN);
    Arc2D failHalf = new Arc2D.Double(110, 70, 200, 230, 270, 180, Arc2D.OPEN);
    graphics2D.setPaint(Color.white);
    graphics2D.draw(orbit);
    graphics2D.draw(failQuarter);
    graphics2D.draw(failHalf);
  }

  /**
   * Draw polygons to represent landmasses
   *
   * @param g Graphics Object
   */
  private void drawLand(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    int[] x1Points = {210, 240, 260, 220, 220, 200};
    int[] y1Points = {200, 200, 220, 290, 230, 210};
    GeneralPath sAmerica = drawPath(x1Points, y1Points);

    int[] x2Points = {210, 155, 150, 175, 200, 230, 250, 225, 230, 200, 190};
    int[] y2Points = {200, 180, 130, 105, 120, 108, 120, 165, 180, 170, 180,};
    GeneralPath nAmerica = drawPath(x2Points, y2Points);

    Color darkGreen = new Color(0, 100, 0);
    graphics2D.setPaint(darkGreen);
    graphics2D.fill(sAmerica);
    graphics2D.draw(sAmerica);
    graphics2D.fill(nAmerica);
    graphics2D.draw(nAmerica);
  }

  /**
   * Takes arrays of x coordinates and y coordinates and draws a 2d line path
   *
   * @param xPoints Int array of x coordinates
   * @param yPoints Int array of y coordinates
   * @return Closed 2d path of points from x and y coordinates
   */
  private GeneralPath drawPath(int[] xPoints, int[] yPoints) {
    GeneralPath border = new GeneralPath(GeneralPath.WIND_EVEN_ODD, xPoints.length);
    border.moveTo(xPoints[0], yPoints[0]);
    for (int index = 1; index < xPoints.length; index++) {
      border.lineTo(xPoints[index], yPoints[index]);
    }
    border.closePath();
    return border;
  }
}