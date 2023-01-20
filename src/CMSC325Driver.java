/*
 * Filename: CMSC325Driver.java
 * Author: Will Feighner (Modified from CMSC325Driver.java)
 * Date: 2023 01 20
 * Purpose: This program creates a JFrame to be used as a drawing canvas by a simple 2D graphics object
 */

import javax.swing.*;

public class CMSC325Driver extends JFrame {

  public CMSC325Driver() {

    // Construct Class with Graphics Component
    CMSC325HW1 myExample = new CMSC325HW1();
    // Add to JFrame
    add(myExample);
    // Set the Default Size and title
    setSize(400, 400);
    setTitle("Newton's Orbital Cannon");

    // Frame Default to be able to closed
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Center the Frame
    setLocationRelativeTo(null);
  }


  public static void main(String[] args) {
    CMSC325Driver myDriver = new CMSC325Driver();
    myDriver.setVisible(true);
  }
}