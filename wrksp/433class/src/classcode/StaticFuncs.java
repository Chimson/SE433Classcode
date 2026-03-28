package classcode;

public class StaticFuncs {
 
  // Where is the defect?
  // When is it correct and when is it a failure?
  public static int square(int x) {
    return x * 2;
  }

  public static void main(String[] args) {
    square(3);
    square(2);
  }
}
