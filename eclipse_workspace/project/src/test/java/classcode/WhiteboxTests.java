package classcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class WhiteboxTests {
  
  @Test
  void avgThrowsException() {
    Whitebox wb = new Whitebox();
    assertThrowsExactly(IllegalArgumentException.class,
            ()->wb.averageOfIntsInRange(new int[] {}, 0, 0));}}
