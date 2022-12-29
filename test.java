import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class test {
public static void main(String[] args) {
// Create the frame
JFrame frame = new JFrame("Calculator");
frame.setSize(350, 250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Create the panel
JPanel panel = new JPanel();
frame.add(panel);

// Add the text field
JTextField textField = new JTextField(20);
panel.add(textField);

// Add the buttons
JButton button1 = new JButton("1");
panel.add(button1);
JButton button2 = new JButton("2");
panel.add(button2);
JButton button3 = new JButton("3");
panel.add(button3);
JButton button4 = new JButton("4");
panel.add(button4);
JButton button5 = new JButton("5");
panel.add(button5);
JButton button6 = new JButton("6");
panel.add(button6);
JButton button7 = new JButton("7");
panel.add(button7);
JButton button8 = new JButton("8");
panel.add(button8);
JButton button9 = new JButton("9");
panel.add(button9);
JButton button0 = new JButton("0");
panel.add(button0);

// Add the operators
JButton buttonAdd = new JButton("+");
panel.add(buttonAdd);
JButton buttonSubtract = new JButton("-");
panel.add(buttonSubtract);
JButton buttonMultiply = new JButton("*");
panel.add(buttonMultiply);
JButton buttonDivide = new JButton("/");
panel.add(buttonDivide);

// Add the equal button
JButton buttonEqual = new JButton("=");
panel.add(buttonEqual);

// Add the clear button
JButton buttonClear = new JButton("C");
panel.add(buttonClear);



// Add the action listeners for the buttons
button1.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    String currentText = textField.getText();
    textField.setText(currentText + "1");
  }
});
button2.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    String currentText = textField.getText();
    textField.setText(currentText + "2");
  }
});
button3.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    String currentText = textField.getText();
    textField.setText(currentText + "3");
  }
});

frame.setVisible(true);
}
}