package classcode;

// do not need to import other shapes classes
import shapes.*;

public class DemoShape {

  public static void main(String[] args) {
    Rectangle r = new Rectangle(0, 0, "blue",
      4, 4);
    
    Circle c = new Circle(0, 10, "red", 3);
    
    // call the toString()
    System.out.println(r);
    System.out.println(c);
    
    // method accepts any Shape
    System.out.println("c > r? " + c.isBiggerThan(r));
    
    // areas
    System.out.println("r area: " + r.area());
    System.out.println("c area: " + c.area());
    
    // Subclass specific
    System.out.println("r is square? " + r.isSquare());
    System.out.println("c circumference: " + c.circumference());
  
    // can cast (implicit here) subclass ref to superclass ref
    // same for Shape parameters, aliases, etc.
    Shape[] shapes = {r, c};
    for (Shape s: shapes) {
      System.out.println(s);
      // s.isSquare();       // can only call Shape defined methods
    }
    
  }

}
