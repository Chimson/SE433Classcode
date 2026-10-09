package shapes; // tests/shapes

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

class CircleTests {

	private Circle c1;
	private static Circle nonzeroArea;
  private static Circle zeroArea;


	@BeforeAll
	static void setupNonZeroAndZeroAreaCircle() {
		nonzeroArea = new Circle(0.0, 1.0, "Red", 2.5);
		zeroArea =  new Circle(0.0, 0.0,
                                  "Blue"
                                  , 0);

	}

	@BeforeEach
  void createObjs() {
    c1 = new Circle(0.0, 1.0, "Red", 2.5);
  }

	@Test
	// one test case for Circle.area()
  void zeroArea() {

    assertEquals(0.0, zeroArea.area(), "Circle.area() returns 0 on Circle of radius 0");

		// assertTrue(0.0 == c0.area());

  }

	@Test
	void nonZeroArea() {

		double expected = 2.5 * 2.5 * Math.PI;
		double actual = nonzeroArea.area();
		assertEquals(expected, actual,
		  "Circle.area() return nonzero on nonzero radius");
	}

	@Test
	void twoCircleObjsValEquals() {
		Circle c0 = new Circle(0.0, 1.0, "Red", 2.5);
		Circle c1 = new Circle(0.0, 1.0, "Red", 2.5);

		assertEquals(c0, c1, "Circles are equal");

		// assertTrue(c0.equals(c1));
	}



}