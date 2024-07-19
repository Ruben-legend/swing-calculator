package org.example;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class CalculatorFrame extends JFrame {

  static Boolean INIT;
  static JLabel label = new JLabel("0");

  CalculatorFrame() {
    INIT = true;

    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());
    setVisible(true);

    label.setHorizontalAlignment(JLabel.CENTER);
    label.setFont(new Font("MV Boli", Font.BOLD, 20));

    add(label, BorderLayout.NORTH);
    add(new CalculatorButtons(), BorderLayout.CENTER);
  }
}
