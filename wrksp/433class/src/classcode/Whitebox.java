package classcode;
import java.io.IOException;

public class Whitebox {

  public double averageOfIntsInRange(int[] vals, int min, int max) {
    int i = 0;
    int totalValid = 0;
    double sum = 0;
    while(i < vals.length) {
      if (vals[i] >= min && vals[i] <= max) {
        totalValid += 1;
        sum += vals[i];
      }
      i += 1;
    }
    double average;
    if (totalValid > 0) {
      average = sum/totalValid;
    }
    else {
      throw new IllegalArgumentException("Your array has no values between min and max");
    }
    return average;            
  }

  public int maxInt(int x, int y) {
    if (x >= y) {   // 1
      return x;     // 2
    }
    else {          
      return y;     // 3
    }
                    // 4
  }

  class Node {
    public Node next;
  }

  public void addToRightEnd(Node n, Node rn) {
    if (n == null) {       
      return;              
    }
    if (n.next == null) {      
      n.next = rn;          
    }
  }

  public double machineEpsilon() {
    double eps = 1.0;                       
    while ( (1.0 + eps/2.0) != 1.0) {       
      eps /= 2.0;                           
    } 
    return eps;                             
  }
  
  public void demo() {
    Node n0 = new Node();
    Node n1 = new Node();
    addToRightEnd(null, n0);
    addToRightEnd(n0, n1);    // n0 -> n1 now
    addToRightEnd(n0, n1);    // n0.next != null
    
    System.out.println("ME is " + machineEpsilon());

    System.out.println(parseInputMenuOption('a'));

    int[] vals = new int[] {3, 7, 10, 65, -5, 14, 21};
      
    System.out.println(averageOfIntsInRange(vals, -50, 50));
        
    printPrimes(30);
  }

  public void demoIO() {
    try {
      menu();
    }
    catch(IOException e) {}
  }

  public static void main(String[] args) {
    (new Whitebox()).demo();
    // (new Whitebox()).demoIO();
  }


  public static String parseInputMenuOption(char c) {
    String msg = "";      
    switch(c) {     
      case 'a':        
        msg = "Option a";    
        break;
      case 'b':         
        msg = "Option b";  
        break;          
      case 'c':         
        msg = "Option c";
        break;
      case 'q':
        msg = "QUIT";
        break;
      default: 
        msg = "You must pick a, b, c, or q";
    }
    return msg;        
  }

  public static void menu() throws IOException {
    
    String msg = "";
    do {
      System.out.println("a) Option a");
      System.out.println("b) Option b");
      System.out.println("c) Option c");
      System.out.print("Make a selection: ");
      char choice;
      do {
        choice = (char) System.in.read();
      }
      while(choice == '\n');
      msg = parseInputMenuOption(choice);
      System.out.println("You selected " + msg);
    }
    while(msg != "QUIT");
    System.out.println("... goodbye!");
  } 

  public static String toLetterGrade(double grade) {
    String lgrade = "";
    if (grade < 80.0) {
      lgrade = "C or less";
    }
    else if (grade < 90.0) {
      lgrade =  "B";
    }
    else {
      lgrade = "A";
    }
    return lgrade;
  } 

  public static double calculateDiscount(int apples, int bananas) {
    double discount = 0.0;
    if (apples > 5) {
      discount = discount + 1.00; // $1 off
    }
    else {
      discount = discount + 0.00;
    }
    if (bananas > 10) {
      discount = discount + 2.00; // $2 off
    }
    else {
      discount = discount + 0.00;
    }
    return discount;
  }

  static void printPrimes(int n) {
    int count = 0;
    int candidate = 2;

    while (count < n) {
      boolean prime = true;

      for (int i = 2; i <= Math.sqrt(candidate); i++) {
        if (candidate % i == 0) {
          prime = false;
          break;
        }
      }

      if (prime) {
        System.out.println(candidate);
        count++;
      }

      candidate++;
    }
  }



}
