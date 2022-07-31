/*
Write a program to handle mouse
events(Clicked, Entered, Exited, Presses, and
Released).
*/

import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame
{
private Label l = new Label();
MouseDemo()
{
setSize(300, 200);
setLocation(0, 0);
setTitle("Mouse Tester");
setVisible(true);
setLayout(new FlowLayout());
add(l);
addComponentListener(new ComponentAdapter()
{
public void componentResized(ComponentEvent ce)
{
addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
{
l.setText("Mouse entered");
setSize(200, 200);
}
public void mouseClicked(MouseEvent e)
{
l.setText("Mouse Clicked");
setSize(400, 400);
}
public void mousePressed(MouseEvent e)
{
l.setText("Mouse Pressed");
setSize(250, 250);
}
public void mouseReleased(MouseEvent e)
{
l.setText("Mouse Released");
setSize(350, 300);
}
/*public void mouseExited(MouseEvent e)
{
l.setText("Mouse Exited.");
}*/
});
}
});
}
public static void main(String args[])
{
new MouseDemo();
}
}