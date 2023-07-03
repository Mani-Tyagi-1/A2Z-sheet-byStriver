// Print numbers 1 to n using recursion

import java.util.*;

public class Print_n_To_1 {
    static void print(int n){
        if(n==0)
            return;
        else {
            System.out.print(n + " ");
            n -= 1;
            print(n);
            }
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num = S.nextInt();
        S.close();
        print(num);
    }
}
