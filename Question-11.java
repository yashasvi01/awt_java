/*
Using AWT, write a program using appropriate adapter class to display the message
(“Typed character is: <typedCharacter>”) in the frame window when user types any key.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class KbdAdapter extends KeyAdapter {
Label l;
KbdAdapter(Label l) {
this.l = l;
}
public void keyTyped(KeyEvent e) {
l.setText("Typed character is: " + e.getKeyChar());
}
public void keyPressed(KeyEvent e) {
System.out.println("Pressed character is: " + e.getKeyChar());
}
public void keyReleased(KeyEvent e) {
System.out.println("Released character is: " + e.getKeyChar());
}
}
public class Key extends Frame {
Label l;
Key() {
Font myFont1 = new Font("Serif", Font.PLAIN, 20);
l = new Label("Start");
l.setBounds(25, 50, 250, 30);
l.setFont(myFont1);
l.setAlignment(Label.CENTER);
this.addKeyListener(new KbdAdapter(l));
this.add(l);
this.setSize(300, 110);
this.setLayout(null);Q
this.setVisible(true);
this.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public static void main(String[] args) {
new Key();
}
}