package shapes;

public class PerimeterDemo {

	public static double execute() {

    Perimeter p1 = new Rectangle(0, 0, "blue", 10, 15);
		Perimeter p2 = new Circle(1, 5, "red", 3);

		double totalPerimeter = p1.perimeter() + p2.perimeter();
    return totalPerimeter;
	}

	public static void main(String args[]) {

		System.out.println(execute());

	}

}
