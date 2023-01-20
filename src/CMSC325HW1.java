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
    drawMountain(g);
    drawArcs(g);
    drawCannon(g);
    drawCannonBall(g);
    drawLand(g);
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
    graphics2D.setColor(new Color(102, 51, 0));
    graphics2D.setPaint(new Color(102, 51, 0));
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

  private void drawLand(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    int[] x1Points = {210, 240, 260, 220, 220, 200};
    int[] y1Points = {200, 200, 220, 290, 230, 210};
    GeneralPath sAmerica = new GeneralPath(GeneralPath.WIND_EVEN_ODD, x1Points.length);
    sAmerica.moveTo(x1Points[0], y1Points[0]);
    for (int index = 1; index < x1Points.length; index++) {
      sAmerica.lineTo(x1Points[index], y1Points[index]);
    }
    sAmerica.closePath();

    int[] x2Points = {210, 155, 150, 175, 200, 230, 250, 225, 230, 200, 190};
    int[] y2Points = {200, 180, 130, 105, 120, 108, 120, 165, 180, 170, 180,};

    GeneralPath nAmerica = new GeneralPath(GeneralPath.WIND_EVEN_ODD, x2Points.length);
    nAmerica.moveTo(x2Points[0], y2Points[0]);

    for (int index = 1; index < x2Points.length; index++) {
      nAmerica.lineTo(x2Points[index], y2Points[index]);
    }
    nAmerica.closePath();
    Color darkGreen = new Color(0, 100, 0);
    graphics2D.setPaint(darkGreen);
    graphics2D.fill(sAmerica);
    graphics2D.draw(sAmerica);
    graphics2D.fill(nAmerica);
    graphics2D.draw(nAmerica);
  }
}