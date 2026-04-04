package shapes;

public class Shape {
  
  // (x, y) center in 2D
  // add set methods to make fields mutable/writable
  //   from outside subclasses and same package
  // add get methods to make fields readable from outside subclasses
  protected double x;
  protected double y;
  protected String color;
  
  public Shape(double x, double y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }
  
  // all subclasses can call this
  public boolean isBiggerThan(Shape other) {
    return this.area() > other.area();
  }
  
  // overridden in subclasses
  public double area() {
    return 0.0;
  }
  
  // overridden from Object class
  public String toString() {
    return "Shape: (" + x + ", " + y + ", " + color + ")";
  }
}
