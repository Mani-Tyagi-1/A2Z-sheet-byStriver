// Print GFG n times without the loop.

import java.util.Scanner;

public class GFG_n_times {
     static void printGfg(int N) {
        if(N==0)
        return;
        else{
            System.out.print("GFG ");
            printGfg(N-1);
        }
    }

    public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter number");
    int n = S.nextInt();
    S.close();
    printGfg(n);
    }
}
