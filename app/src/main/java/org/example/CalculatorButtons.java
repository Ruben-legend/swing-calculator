package org.example;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

class CalculatorButtons extends JPanel {
  enum Calculator {
    Number,
    Operation
  }

  CalculatorButtons() {
    setLayout(new GridLayout(4, 4, 10, 10));
    button("7", Calculator.Number);
    button("8", Calculator.Number);
    button("9", Calculator.Number);
    button("/", Calculator.Operation);

    button("4", Calculator.Number);
    button("5", Calculator.Number);
    button("6", Calculator.Number);
    button("*", Calculator.Operation);

    button("1", Calculator.Number);
    button("2", Calculator.Number);
    button("3", Calculator.Number);
    button("-", Calculator.Operation);

    button("0", Calculator.Number);
    button(".", Calculator.Number);
    button("=", Calculator.Operation);
    button("+", Calculator.Operation);
  }

  private void button(String text, Calculator cal) {
    var button = new JButton(text);
    if (cal == Calculator.Number)
      button.addActionListener(new InsertNumber(CalculatorFrame.label));
    else if (cal == Calculator.Operation)
      button.addActionListener(new OperationListener(CalculatorFrame.label));
    add(button);
  }
}
