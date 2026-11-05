package classcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class BlackboxExamples {

  // IC: x is any 32-bit int
	  // Valid Equivalence class: {x | x is any 32-bit int}
	  // Invalid Equivalence class: {}
  // IC: x can be even or odd
	  // Valid EC: {x | x is any even 32-bit int}
	  // Valid EC: {x | x is any odd 32-bit int}
  public static boolean isEven(int x) {
		// blackbox (so we don't care about the code)
		return false;
  }

  //	IC: 1 < count < 999
  //    Valid EC: {count | 1 < count < 999 }
  //    Invalid EC: {count | count <= 1}
  //    Invalid EC: {count | count >= 999}
  public static boolean checkCount(int count) {
		// blackbox
		return false;
  };


  // Assume that there can be only 6 owners
  // IC: arr.length can be between 1 and 6
  //   Valid EC: { arr | 1<= arr.length <= 6 }
  //   InValid EC: {arr | arr.length == 0}  ({arr | arr =[]})
  //   InValid EC: {arr | arr.length > 6}
  class Owner {}  // blackbox, don't care
  public static void printOwners(Owner[] arr) {
	  // blackbox
  }

  // IC: that x is within min and max (including) (can include extremes)
  //   #1) Valid EC: {x | min <= x <= max} (could include extremes)
  //   #2) Invalid EC: {x | x < min}
  //   #3)  Invalid EC: {x | x > max}
  // IC: min <= max  // only if your function can "handle" detection on this condition
  //   #4) Valid EC: {(min, max) | min <= max}
  //   #5) Invalid EC: {(min, max) | min > max}

  /*
  Test Cases
  a set of (x, min, max)
  {
    (5, 1, 10)  // marks EC 1, 4   (unit test)
    (5, 6, 10) // marks 2
    (10, 1, 5)  // marks 3         (unit test)
    (5, 10, 1)  // marks 5         (unit test)

  }
  */
  // throws IllegalArgumentException on min > max
  public boolean checkValInInterval(int x, int min, int max) {
    // blackbox
    return false;
  }

  @Test  // test case 1
  void xIsBetweenMinMaxNoExtreemes() {
		boolean actual = checkValInInterval(5, 1, 10);
		assertTrue(actual);
  }

  @Test   // test case 3
  void xIsBeyondMaxNoExtreemes() {
    boolean actual = checkValInInterval(10, 1, 5);
    assertFalse(actual);
  }

  @Test   // test case 4
  void minBiggerMaxThrowsIAE() {
    assertThrows(IllegalArgumentException.class,
        ()->{checkValInInterval(5, 10, 1);});
  }

	// Boundary Value Analysis



	// IC: x is between -1.0 and 1.0, not including -1.0 and 1.0
	//   Valid EC: {x | -1.0 < x < 1.0}
	//     BC:  x = -0.99999
	//     BC:  x = 0.99999
	//     BC: x = -1.0
	//     BC: x = 1.0
	//   ... -2 -1 0 1 2
	//           ^
	//   Invalid EC: {x | x <= -1.0}  (-inf, -1]
  //     BC: x = -1.0
  //     BC: x = -0.99999
	//   Invalid EC: {x | x >= 1.0}
	//     BC: x = 1.0
	//     BC: x = 0.99999


}
