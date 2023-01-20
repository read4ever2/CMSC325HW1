import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

public class CMSC325HW1 extends JPanel {


  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // Call methods to draw
    drawBackground(g);
    drawEllipse(g);
    drawLine(g);
    drawCircle(g);
    drawRect(g);
    drawCannonBall(g);
    drawMountain(g);
  }

  // Method to draw an Ellipse
  private void drawEllipse(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    Ellipse2D e = new Ellipse2D.Double(5, 10, 80, 130);
    g2d.setColor(Color.red);
    g2d.draw(e);
  }

  // Method to draw a Line
  private void drawLine(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    Line2D myLine = new Line2D.Double(150, 150, 150, 250);
    g2d.setColor(Color.blue);
    g2d.draw(myLine);
  }

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
    Ellipse2D cannonBall = new Ellipse2D.Double(65, 190, 20, 20);
    GradientPaint blackToGrey = new GradientPaint(0, 0, Color.darkGray, 100, 0, Color.lightGray);
    g2d.setPaint(blackToGrey);
    g2d.fill(cannonBall);
    g2d.draw(cannonBall);
  }

  // Method to draw a Rectangle
  private void drawRect(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D myRect = new Rectangle2D.Double(300, 30, 50, 50);

    g2d.setColor(Color.blue);
    g2d.draw(myRect);
  }

  private void drawMountain(Graphics g) {
    Graphics2D graphics2D = (Graphics2D) g;
    GeneralPath mountain = new GeneralPath();
    mountain.moveTo(180,102);
    mountain.lineTo(220,102);
    mountain.lineTo(210,80);
    mountain.lineTo(190,80);
    mountain.closePath();
    graphics2D.setColor(Color.MAGENTA);
    graphics2D.setPaint(Color.magenta);
    graphics2D.fill(mountain);
    graphics2D.draw(mountain);
  }

  private void drawBackground(Graphics g){
    Graphics2D graphics2D = (Graphics2D) g;
    Rectangle2D background = new Rectangle2D.Double(0,0,400,400);
    graphics2D.setPaint(Color.black);
    graphics2D.fill(background);
    graphics2D.draw(background);
  }
}