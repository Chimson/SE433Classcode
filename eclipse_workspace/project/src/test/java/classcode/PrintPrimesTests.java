package classcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import testtools.CaptureStdOut;
import java.time.Duration;

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
  
  
  @Test
  void dummy() {
    wb.printPrimes(3);
  }
  
  // kills count < n, negated conditional
  @BeforeAll
  static void mutantTimeout() {
    assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
      Whitebox w = new Whitebox();
      w.printPrimes(-10);
    });
  }
  
  // kills i <= Math.sqrt(candidate), changed conditional boundary (to <)
  @Test
  void primesNThree() {
    capture.redirectToBuffer();
    wb.printPrimes(3);
    String expected = "2\n3\n5\n";
    String actual = capture.toString();
    assertEquals(expected, actual);
  }
  
  // kills count++ mutation to count--
  @BeforeAll
  static void check() {
    assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
      Whitebox w = new Whitebox();
      w.printPrimes(1);
    });
  }
  
  
  
  
}



