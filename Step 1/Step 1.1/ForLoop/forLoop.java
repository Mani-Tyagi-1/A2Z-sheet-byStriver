/*
 * When you know exactly how many times you want to loop through a block of code, use the for loop.
 * 
 *      Syntax
 *  for(initialisation;condition;updation)
 *  {
 *      statement to be executed
 *  }
 */

// Print your name 10 times
public class forLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println("Mani Tyagi");
    }
}


//It is also possible to place a loop inside another loop. This is called a nested loop.
// The "inner loop" will be executed one time for each iteration of the "outer loop"
