package testtools;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;


public class CaptureStdOut {

  private final PrintStream originalOut;
  private ByteArrayOutputStream byteBuffer;
  
  public CaptureStdOut() {
    originalOut = System.out;
  }
  
  public void redirectToBuffer() {
    byteBuffer = new ByteArrayOutputStream();
    System.setOut(new PrintStream(byteBuffer));
  }
  
  public void redirectToStdOut() {
    System.setOut(originalOut);
  }
  
  public String toString() {
    return byteBuffer.toString();
  }
  
  @Test
  void checkByteBufferStdOut() {
    CaptureStdOut capture = new CaptureStdOut();
    capture.redirectToBuffer();
    System.out.println("hi");
    assertEquals("hi\n", capture.toString());
  }
  
  @Test
  void captureStdOutAndPrintString() {
    CaptureStdOut capture = new CaptureStdOut();
    capture.redirectToBuffer();
    System.out.println("capture this!");
    capture.redirectToStdOut();
    assertEquals("capture this!\n", capture.toString());
    System.out.println(capture);
  }
}
