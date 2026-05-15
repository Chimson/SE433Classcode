package classcode;

public class BinarySearch {

  /*
  Description
    array must be sorted
    shifts mid index by searching in halves
    faster perfomance than a linear search
      O(n) vs O(lg(N))
    rank returns true when it finds key in the array    
  */

public static int rank(int key, int[] a) {
	// a must be sorted
  int lo = 0;
  int hi = a.length - 1;
  while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) {
      hi = mid - 1;
    }
    else if (key > a[mid]) {
      lo = mid + 1;
    }
    else {
      return mid;
    }
  }
  return -1;
}
  

  public static void main(String[] args) {
  
    int[] arr1 = new int[] 
      {10, 11, 12, 16, 18, 23, 29, 33, 48, 54, 57, 68, 77, 84, 98};
    
    assert BinarySearch.rank(23, arr1) == 5;
    assert BinarySearch.rank(10, arr1) == 0;
    assert BinarySearch.rank(98, arr1) == 14;
    assert BinarySearch.rank(12, arr1) == 2;
    
    
  }
}
