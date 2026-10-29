package classcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTests {
  
  // SEE equiv-classes-bin-search.txt
  //   came up with 7 test cases
  // SEE boundary-value-analysis-bin-search.txt
  //   came up with 10 test cases
  
  // first test case from Equivalence Partitioning
  // rank([1, 2, 3, 4], 1)
  
  int[] sizeTwo;
  
  @BeforeEach
  void arrayBank() {
    sizeTwo = new int[] {3, 4};
  }

	@Test
	void ArrayNonEmptyKeyAtIndexNonZero() {
		// assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
			// BinarySearch.rank(sizeTwo, 1);
		// });

		int expected = 1;
		assertEquals(expected, BinarySearch.rank(sizeTwo, 4));

	}

  @Test
  void ArrayOfAnySizeKeyAtIndexZero() {


		// setup
    int[] arr = new int[] {1, 2, 3, 4};
    
    // apply test case
    int expected = 0;
    int actual = BinarySearch.rank(arr, 1);
    
    // assert
    assertEquals(expected, actual);
    
  }

	  @Test
    void ArrayOfAnySizeKeyAtIndexEnd() {

      int[] arr = new int[] {10, 14, 17, 20, 23};


			assertEquals(4, BinarySearch.rank(arr, 23));
    }

  @Test
  void ArrayEmptyAnyKey() {
    // setup
    int[] arr = new int[] {};
    
    // apply test case
    int expected = -1;
    int actual = BinarySearch.rank(arr, 1);
    
    // assert
    assertEquals(expected, actual);
  }
  
  // this test really doesn't do anything other than show how you can
  //   force a test fail if a mutant times out.
  @Test
  void showForceTimeout() {
    int[] arr = new int[] {10, 14, 17, 20, 23};
		assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
			BinarySearch.rank(arr, 0);
    });
    assertTrue(true);
  }

}
