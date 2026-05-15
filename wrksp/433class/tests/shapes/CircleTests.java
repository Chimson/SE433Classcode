package shapes; // tests/shapes
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CircleTests {
  @Test
  void zeroArea() {
    Circle c0 = new Circle(0.0, 0.0,
            "Blue"
            , 0);
    assertEquals(c0.area(), 0.0, "checking zero");
    
  }
}