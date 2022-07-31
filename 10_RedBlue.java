/*
Using AWT, write a program to create two buttons
named “Red” and “Blue”. When a button is pressed the
background color should be set to the color named by the
button’s label.
*/

import java.awt.*;
import java.awt.event.*;
public class ButtonDemo extends Frame implements ActionListener {
Button btnRed, btnBlue;
ButtonDemo() {
btnRed = new Button("Red");
btnRed.setBounds(25, 50, 250, 30);
btnRed.addActionListener(this);
this.add(btnRed);
btnBlue = new Button("Blue");
btnBlue.setBounds(25, 100, 250, 30);
btnBlue.addActionListener(this);
this.add(btnBlue);
this.setSize(300, 160);
this.setLayout(null);
this.setVisible(true);
this.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public static void main(String[] args) {
new ButtonDemo();
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnRed) {
this.setBackground(Color.RED);
}
else if (e.getSource() == btnBlue) {
this.setBackground(Color.BLUE);
}
}
}