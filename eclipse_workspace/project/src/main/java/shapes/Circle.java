package shapes;

public class Circle extends Shape implements Perimeter {
  
  private double radius;
  
  public Circle(double x, double y, String color, double radius) {
    super(x, y, color);
    this.radius = radius;
  }
  
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
  
  public double circumference() {
    return 2 * Math.PI * radius;
  }

	@Override
	public double perimeter() {
		return Math.PI * radius * 2;
	}
}
