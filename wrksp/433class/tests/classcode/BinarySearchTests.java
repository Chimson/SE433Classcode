package classcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTests {
  
  // SEE equiv-classes-bin-search.txt
  //   came up with 7 test cases
  // SEE boundary-value-analysis-bin-search.txt
  //   came up with 10 test cases
  // Should add test methods for all 17 test cases, even if they overlap
  
  // first test case from Equivalence Partitioning
  // rank([1, 2, 3, 4], 1)
  @Test
  void ArrayOfAnySizeKeyAtIndexZero() {
    // setup
    int[] arr = new int[] {1, 2, 3, 4};
    
    // apply test case
    int expected = BinarySearch.rank(arr, 1);
    int actual = 0;
    
    // assert
    assertEquals(expected, 0);
    
  }
  
  
}
