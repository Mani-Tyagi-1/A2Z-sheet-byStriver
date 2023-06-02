/*
---------OUTPUT------
In java output is taken as

System.out.println( data to be print );  ---> to print in different lines
System.out.print( data to be print ); ---> to print in same line
System.out.printf( data to be print ); ---> provide string formatting like C and C++

* System --> is a class
* out is a public static field that accept output data



---------------INPUT------------
1. import java.util.Scanner package to take input
2. make a object of scanner
3. use it to take input

*/

import java.util.Scanner; // 1

public class InputOutput {
  public static void main(String[] args) {
    
      Scanner S = new Scanner(System.in); // 2
      {
          String name;
          System.out.println("Enter your name"); // Output to show
          name = S.nextLine(); // 3 
          S.close(); // closing the object when no need
          System.out.println("Your name is "+name); // output
      } 
  }

     
    
}