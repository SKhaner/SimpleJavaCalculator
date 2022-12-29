import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.security.auth.kerberos.KeyTab;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class calcGUI{
    //items
    private JFrame frame;
    private JButton ac;
    private JButton posNeg;
    private JButton percent;
    private JButton add;
    private JButton sub;
    private JButton mult;
    private JButton divide;
    private JButton equal;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton decimal;
    private JTextField display;
    private JPanel keypad;
    private JPanel top2Rows;
        private JPanel topRight;
            private JPanel topRTop;
            private JPanel topRBottom;
        private JPanel topLeft;
            private JPanel topLTop;
            private JPanel topLBottom;
    private JPanel middleRow;
        private JPanel midRight;
        private JPanel midLeft;
    private JPanel bottom2Rows;
        private JPanel bottomRight;
            private JPanel bottomRTop;
            private JPanel bottomRBottom;
        private JPanel bottomLeft;
            private JPanel bottomLTop;
            private JPanel bottomLBottom;
    private double first;
    private double second;
    private double answer;
    String operation;
    Color royalBlue = new Color(35, 78, 112);
    Color paleYellow = new Color(251, 248, 190);

    calcGUI(){
        frame = new JFrame();
        //frame.setLayout(new BorderLayout());
        frame.setTitle("Simple Calculator"); // sets title that appears on the top bar
        frame.setSize(300, 600);          // sets the size (in pixels) of the frame
        frame.setLocation(100, 100);      // sets the top-left corner of the window on the desktop
        
        //display
        display = new JTextField();
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        display.setFont(font1);
        frame.add(display, BorderLayout.NORTH);

        keypad = new JPanel(new BorderLayout());
        //top two rows
        top2Rows = new JPanel(new BorderLayout());
            //right 4 buttons
            topRight = new JPanel(new BorderLayout());
                topRTop = new JPanel(new BorderLayout());
                    percent = new JButton("%");
                    topRTop.add(percent, BorderLayout.WEST);
                    add = new JButton("+");
                    topRTop.add(add, BorderLayout.EAST);
                topRBottom = new JPanel(new BorderLayout());
                    nine = new JButton("9");
                    topRBottom.add(nine, BorderLayout.WEST);
                    sub = new JButton("-");
                    topRBottom.add(sub, BorderLayout.EAST);
                topRight.add(topRTop, BorderLayout.NORTH);
                topRight.add(topRBottom, BorderLayout.SOUTH);
            //left 4 buttons
            topLeft = new JPanel(new BorderLayout());
                topLTop = new JPanel(new BorderLayout());
                    posNeg = new JButton("-/+");
                    topLTop.add(posNeg, BorderLayout.EAST);
                    ac = new JButton("AC");
                    topLTop.add(ac, BorderLayout.WEST);
                topLBottom = new JPanel(new BorderLayout());
                    seven = new JButton("7");
                    topLBottom.add(seven, BorderLayout.WEST);
                    eight = new JButton("8");
                    topLBottom.add(eight, BorderLayout.EAST);
                topLeft.add(topLTop, BorderLayout.NORTH);
                topLeft.add(topLBottom, BorderLayout.SOUTH);
            //add left and right set of buttons to panel
            top2Rows.add(topRight, BorderLayout.EAST);
            top2Rows.add(topLeft, BorderLayout.WEST);


        //middle row
        middleRow = new JPanel(new BorderLayout());
            midRight = new JPanel(new BorderLayout());
                six = new JButton("6");
                mult = new JButton("X");
                midRight.add(six, BorderLayout.WEST);
                midRight.add(mult, BorderLayout.EAST);
            midLeft = new JPanel(new BorderLayout());
                four = new JButton("4");
                five = new JButton("5");
                midLeft.add(four, BorderLayout.WEST);
                midLeft.add(five, BorderLayout.EAST);
            middleRow.add(midRight, BorderLayout.EAST);
            middleRow.add(midLeft, BorderLayout.WEST);

        //bottom two rows
        bottom2Rows = new JPanel(new BorderLayout());
            //right 4 buttons
            bottomRight = new JPanel(new BorderLayout());
                bottomRTop = new JPanel(new BorderLayout());
                    three = new JButton("3");
                    bottomRTop.add(three, BorderLayout.WEST);
                    divide = new JButton("/");
                    bottomRTop.add(divide, BorderLayout.EAST);
                bottomRBottom = new JPanel(new BorderLayout());
                    decimal = new JButton(".");
                    bottomRBottom.add(decimal, BorderLayout.WEST);
                    equal = new JButton("=");
                    bottomRBottom.add(equal, BorderLayout.EAST);
                bottomRight.add(bottomRTop, BorderLayout.NORTH);
                bottomRight.add(bottomRBottom, BorderLayout.SOUTH);
            //left 4 buttons
            bottomLeft = new JPanel(new BorderLayout());
                bottomLTop = new JPanel(new BorderLayout());
                    two = new JButton("2");
                    bottomLTop.add(two, BorderLayout.EAST);
                    one = new JButton("1");
                    bottomLTop.add(one, BorderLayout.WEST);
                bottomLBottom = new JPanel(new BorderLayout());
                    zero = new JButton("0");
                    bottomLBottom.add(zero, BorderLayout.CENTER);        
                bottomLeft.add(bottomLTop, BorderLayout.NORTH);
                bottomLeft.add(bottomLBottom, BorderLayout.SOUTH);
            //add left and right set of buttons to panel
            bottom2Rows.add(bottomRight, BorderLayout.EAST);
            bottom2Rows.add(bottomLeft, BorderLayout.WEST);


        //keypad panel
        keypad.add(top2Rows, BorderLayout.NORTH);
        keypad.add(middleRow, BorderLayout.CENTER);
        keypad.add(bottom2Rows, BorderLayout.SOUTH);
        frame.add(keypad, BorderLayout.CENTER);

        //decorate
        frame.getContentPane().setBackground(royalBlue);
        bottomRTop.setBackground(royalBlue);
        bottomRBottom.setBackground(royalBlue);
        bottomLTop.setBackground(royalBlue);
        bottomLBottom.setBackground(royalBlue);
        midLeft.setBackground(royalBlue);
        midRight.setBackground(royalBlue);
        topRTop.setBackground(royalBlue);
        topRBottom.setBackground(royalBlue);
        topLTop.setBackground(royalBlue);
        topLBottom.setBackground(royalBlue);
        bottom2Rows.setBackground(royalBlue);
        middleRow.setBackground(royalBlue);
        top2Rows.setBackground(royalBlue);;

        // percent.setFont(font1);
        // add.setFont(font1);
        // mult.setFont(font1);
        // divide.setFont(font1);
        // sub.setFont(font1);
        // one.setFont(font1);
        // two.setFont(font1);
        // three.setFont(font1);
        // four.setFont(font1);
        // five.setFont(font1);
        // six.setFont(font1);
        // seven.setFont(font1);
        // eight.setFont(font1);
        // nine.setFont(font1);
        // zero.setFont(font1);
        // ac.setFont(font1);
        // posNeg.setFont(font1);
        // decimal.setFont(font1);
        // equal.setFont(font1);

        
        //add action listners to perform calculations
        one.addActionListener((e) -> {
            String currentText = display.getText();
            display.setText(currentText + "1");
        });
        two.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "2");
        });
        three.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "3");
        });
        four.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "4");
        });
        five.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "5");
        });
        six.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "6");
        });
        seven.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "7");
        });
        eight.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "8");
        });
        nine.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "9");
        });
        zero.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + "0");
        });
        decimal.addActionListener((e)-> {
              String currentText = display.getText();
              display.setText(currentText + ".");
        });
        ac.addActionListener((e)-> {
              display.setText("");
        });
        posNeg.addActionListener((e)-> {
                String currentText = display.getText();
                if(currentText.charAt(0) == '-'){
                    display.setText(currentText.substring(1));
                } else{
                    display.setText("-" + currentText);
                }
        });
        add.addActionListener((e)-> {
              String currentText = display.getText();
              first = Double.parseDouble(currentText);
              display.setText("");
              operation = "+";
        });
        mult.addActionListener((e)-> {
              String currentText = display.getText();
              first = Double.parseDouble(currentText);
              display.setText("");
              operation = "*";
        });
        sub.addActionListener((e)-> {
              String currentText = display.getText();
              first = Double.parseDouble(currentText);
              display.setText("");
              operation = "-";
        });
        divide.addActionListener((e)-> {
              String currentText = display.getText();
              first = Double.parseDouble(currentText);
              display.setText("");
              operation = "/";
        });
        percent.addActionListener((e)-> {
              String currentText = display.getText();
              first = Double.parseDouble(currentText);
              answer = first/100;
              display.setText(Double.toString(answer));
        });
        equal.addActionListener((e)-> {
                second = Double.parseDouble(display.getText());
                if (operation.equals("+")) {
                    answer = first + second;
                    display.setText(Double.toString(answer));
                } else if (operation.equals("-")) {
                    answer = first - second;
                    display.setText(Double.toString(answer));
                } else if (operation.equals("*")) {
                    answer = first * second;
                    display.setText(Double.toString(answer));
                } else if (operation.equals("/")) {
                    answer = first / second;
                    display.setText(Double.toString(answer));
                } 
        });
    

        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes it so that closing window exits program
        frame.setVisible(true);

    }
}
