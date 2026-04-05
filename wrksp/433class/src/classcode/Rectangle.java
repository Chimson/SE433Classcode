// Subclass 1
class Rectangle extends Shape {
  double width;
  double height;

  Rectangle(double width, double height, String color) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  double area() {
    return width * height;
  }

  boolean isSquare() {
    return width == height;
  }
    

}
