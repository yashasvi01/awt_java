/*
Using AWT, write a program to create two buttons
labelled ‘A’ and ‘B’. When button ‘A’ is pressed, it displays
your personal information (Name, Course, Roll No,
College) and when button ‘B’ is pressed, it displays your
CGPA in previous semester.
*/

import java.awt.*;
import java.awt.event.*;
public class Info extends Frame implements ActionListener {
Button btnInfo, btnCGPA;
Info() {
super("Student Details");
// Button A
btnInfo = new Button("A");
btnInfo.setBounds(25, 125, 450, 100);
btnInfo.addActionListener(this);
this.add(btnInfo);
// Button B
btnCGPA = new Button("B");
btnCGPA.setBounds(25, 300, 450, 100);
btnCGPA.addActionListener(this);
this.add(btnCGPA);
this.setSize(500, 500);
this.setLayout(null);
this.setVisible(true);
this.setLocationRelativeTo(null);
this.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public void actionPerformed(ActionEvent e) {
if(e.getSource() == btnInfo) {
new PersonalInfo("Ayush BHARDWAJ","BSc(Hons) Computer
Science","AD-1226","ANDC College");
}else{
new CGPA("9.5");
}
}
public static void main(String[] args) {
new Info();
}
}