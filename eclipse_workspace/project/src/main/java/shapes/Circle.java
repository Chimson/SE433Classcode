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

	@Override
	public boolean equals(Object other) {
		// technically should check that other is not null and that other can be a Circle
		if (other == null) {
			return false;
		}
		// else if (other. )

		Circle o = (Circle) other;
		return this.x == o.x && this.y == o.y && this.color == o.color && this.radius == o.radius;
	}
}
