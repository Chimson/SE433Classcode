package shapes;

public class Rectangle extends Shape {
  
  // add set methods to make fields mutable from any class
  // add get methods to make fields readable from any class
  private double width;
  private double height;
  
  public Rectangle(double x, double y, String color, double width, double height) {
    super(x, y, color);  // call superclass constructor
    this.width = width;
    this.height = height;
  }
  
  @Override
  public double area() {
    return width * height;
  }
  
  // specific to Rectangle
  public boolean isSquare() {
    return width == height;
  }
  
  public String toString() {
    return "Shape: (" + x + ", " + y + ", " + color + ", " + width + ", " + height + ")";
  }
}
