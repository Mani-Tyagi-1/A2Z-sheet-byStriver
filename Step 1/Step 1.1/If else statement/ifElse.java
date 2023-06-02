/*
 * If else statement
 * 
 * 
 *  if(condition)
 *  {
 *      statement 1 is executed
 *  }
 * else
 * {
 *  statement 2 is executed 
 * }
 * 
 * if condition is true statement 1 is executed else statement 2 is executed
 */
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int age;
        System.out.println("Enter your age");
        age = S.nextInt();
        S.close();
        
        if(age<18)
            System.out.println("You are a child");
        else
            System.out.println("You are an adult");    
    }

}
