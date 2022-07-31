/*
Create a class TwoDim which contains private members as x and y coordinates in package
P1. Define the default constructor, a parameterized constructor and override toString()
method to display the co-ordinates. Now reuse this class and in package P2 create another
class ThreeDim, adding a new dimension as z as its private member. Define the constructors
for the subclass and override toString() method in the subclass also. Write appropriate
methods to show dynamic method dispatch. The main() function should be in a package P
*/

/**** P1/TwoDim.java ****/
package P1;
public class TwoDim {
private int x;
private int y;
public TwoDim() {
this.x = 0;
this.y = 0;
}
public TwoDim(int x, int y) {
this.x = x;
this.y = y;
}
@Override
public String toString() {
return "Coordinate: x = " + x + " y = " + y;
}
}
/**** P2/ThreeDim.java ****/
package P2;
import P1.*;
public class ThreeDim extends TwoDim {
private int z;
public ThreeDim() {
super(0, 0);
this.z = 0;
}
public ThreeDim(int x, int y, int z) {
super(x, y);
this.z = z;
}
@Override
public String toString() {
return super.toString() + " z = " + z;
}
}
/**** P/Main.java ****/
package P;
import P1.*;
import P2.*;
public class Main {
public static void main(String[] args) {
TwoDim ref;
ref = new TwoDim(1, 2);
System.out.println(ref);
ref = new ThreeDim(3, 4, 5);
System.out.println(ref);
}
}