package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

class InsertNumber implements ActionListener {
  private JLabel label;

  InsertNumber() {
  }

  InsertNumber(JLabel label) {
    this.label = label;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    var text = e.getActionCommand();
    if (CalculatorFrame.INIT) {
      label.setText("");
      CalculatorFrame.INIT = false;
    }
    label.setText(label.getText() + text);
  }

}
