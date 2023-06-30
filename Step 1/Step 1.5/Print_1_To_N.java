// Print numbers from 1 to N without the help of loops.
// Input:
// N = 10
// Output: 1 2 3 4 5 6 7 8 9 10

import java.util.*;
public class Print_1_To_N {
   static int i=1;
  public static void printNos(int N)
  {
      //Your code here
      if (i == N + 1)
          return;
      else {
          System.out.print(i + " ");
          i = i + 1;
          printNos(N);
      }
  }

  public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter number");
    int n = S.nextInt();
     S.close();
     printNos(n);
    }
}
