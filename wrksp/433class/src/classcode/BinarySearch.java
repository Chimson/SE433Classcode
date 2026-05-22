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
  
  // a.length <
public static int rank(int[] a, int key) {
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
  

  public static void main(String[] args) {}
  
}
