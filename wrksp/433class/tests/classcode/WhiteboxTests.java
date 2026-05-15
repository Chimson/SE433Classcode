package classcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WhiteboxTests {
  
  @Test
  void avgThrowsException() {
    Whitebox wb = new Whitebox();
    assertThrows(IllegalArgumentException.class,
            ()->wb.averageOfIntsInRange(new int[] {}, 0, 0));}}