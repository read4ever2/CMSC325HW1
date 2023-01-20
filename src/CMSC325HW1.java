import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class CMSC325HW1 extends JPanel {


  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // Call methods to draw
    drawBackground(g);
    drawCircle(g);
    drawArcs(g);
    drawCannonBall(g);
    drawMountain(g);
    drawCannon(g);

  }

  // Method to draw an Ellipse


  // Method to draw a Line


  // Method to draw a Circle
  private void drawCircle(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    Ellipse2D myCircle = new Ellipse2D.Double(100, 100, 200, 200);
    g2d.setColor(Color.blue);
    g2d.setPaint(Color.blue);
    g2d.fill(myCircle);
    g2d.draw(myCircle);
  }

  private void drawCannonBall(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    Ellipse2D cannonBall = new Ellipse2D.Double(60, 190, 20, 20);
    GradientPaint blackToGrey = new GradientPaint(0, 0, Color.darkGray, 100, 0, Color.lightGray);
    g2d.setPaint(blackToGrey);
    g2d.fill(cannonBall);
    g2d.draw(cannonBall);
  }

  // Method to draw a Rectangle


  private void drawMountain(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    GeneralPath mountain = new GeneralPath();
    mountain.moveTo(180, 102);
    mountain.lineTo(220, 102);
    mountain.lineTo(210, 80);
    mountain.lineTo(190, 80);
    mountain.closePath();
    graphics2D.setColor(Color.MAGENTA);
    graphics2D.setPaint(Color.magenta);
    graphics2D.fill(mountain);
    graphics2D.draw(mountain);
  }

  private void drawBackground(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    Rectangle2D background = new Rectangle2D.Double(0, 0, 400, 400);
    graphics2D.setPaint(Color.black);
    graphics2D.fill(background);
    graphics2D.draw(background);
  }

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

  private void drawArcs(Graphics g){
    Graphics2D graphics2D=(Graphics2D) g;
    Arc2D orbit = new Arc2D.Double(70,70,260,260,180,270,Arc2D.OPEN);
    graphics2D.setPaint(Color.white);
    graphics2D.draw(orbit);
  }
}