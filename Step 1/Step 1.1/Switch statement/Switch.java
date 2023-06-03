/*
 *  Switch statement  syntax
 *  
 * switch(condition){
 *  case 1: statement;
 *            break;
 *  case 2: statement;
 *            break;
 *  case 3: statement;
 *            break;
 *  default: statement;
 * }
 * 
 */

import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    
    int choice;
    System.out.println("Enter your choice for days in a week");
    choice = S.nextInt();
    S.close();
    switch(choice){
        case 1:
            System.out.println("Monday");
            break;
        case 2: System.out.println("Tuesday"); 
            break;
        case 3: System.out.println("Wednesday"); 
            break;
        case 4: System.out.println("Thrusday"); 
            break;
        case 5: System.out.println("Friday"); 
            break;
        case 6: System.out.println("Saturday"); 
            break;
        case 7: System.out.println("Sunday"); 
            break;
        default:System.out.println("Invalid choice");
    }
}
}
