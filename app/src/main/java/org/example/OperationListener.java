package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

class OperationListener implements ActionListener {
  private JLabel label;
  private String operation;
  private double total;
  private static String lastOperation;
  private static double num1, num2;

  OperationListener(JLabel label) {
    this.label = label;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    var op = e.getActionCommand();
    operation = op;
    calculate(Double.parseDouble(label.getText()));
    CalculatorFrame.INIT = true;
  }

  private void calculate(double number) {
    if (operation != "=") {
      lastOperation = operation;
      num1 = total = number;
    } else if (operation == "=") {
      num2 = number;
      switch (lastOperation) {
        case "+":
          total = num1 + num2;
          lastOperation = "";
          break;
        case "-":
          total = num1 - num2;
          lastOperation = "";
          break;
        case "*":
          total = num1 * num2;
          lastOperation = "";
          break;
        case "/":
          total = num1 / num2;
          lastOperation = "";
          break;
      }
    }

    label.setText("" + total);
  }

}
