package classcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTests {
  
  // SEE equiv-classes-bin-search.txt
  //   came up with 7 test cases
  // SEE boundary-value-analysis-bin-search.txt
  //   came up with 10 test cases
  
  // first test case from Equivalence Partitioning
  // rank([1, 2, 3, 4], 1)
  
  int[] sizeTwo = new int[] {3, 4};
  
  @BeforeEach
  void arrayBank() {
    sizeTwo = new int[] {3, 4};
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
  void ArrayEmptyAnyKey() {
    // setup
    int[] arr = new int[] {};
    
    // apply test case
    int expected = -1;
    int actual = BinarySearch.rank(arr, 1);
    
    // assert
    assertEquals(expected, actual);
  }
  
  
}
