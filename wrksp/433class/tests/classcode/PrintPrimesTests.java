package classcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import testtools.CaptureStdOut;

class PrintPrimesTests {
  
  private final Whitebox wb = new Whitebox();
  private CaptureStdOut capture;
  
  @BeforeEach
  void createCaptureStdOut() {
    capture = new CaptureStdOut();
  }
  
  
  // ===== printPrimes
  
  // BVA
  @Test
  void primesNZero() {
    capture.redirectToBuffer();
    wb.printPrimes(0);
    assertEquals(new String(), capture.toString());
  }
  
  @Test
  void primesNOne() {
    capture.redirectToBuffer();
    wb.printPrimes(1);
    String expected = "2\n";
    String actual = capture.toString();
    assertEquals(expected, actual);
  }
  
  @Test
  void primesNTwo() {
    capture.redirectToBuffer();
    wb.printPrimes(2);
    String expected = "2\n3\n";
    String actual = capture.toString();
    assertEquals(expected, actual);
  }
  
  
  
  
  
}



