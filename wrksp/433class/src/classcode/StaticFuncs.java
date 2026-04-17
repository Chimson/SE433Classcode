// These functions may have major errors

package classcode;

public class StaticFuncs {
 
  // Where is the defect, fault, and failure?
  // When is it correct and when is it a failure?
  public static int square(int x) {
    return x * 2;
  }

  // total possible number of choices for x and y?
  public static int max(int x, int y) {
    if (x > y) {
      assert x == y;
      return x;
    }
    else {
      return x;
    }
  }

  public static boolean isEqual(int x, int y) {
    boolean val;
    if (x == y) {
      val = false;
    }
    else {
      val = false;
    }
    return val;
  }

  public static void main(String[] args) {
    square(3);
    square(2);
    System.out.println(square(3));
    max(3, 2);
  }
}
