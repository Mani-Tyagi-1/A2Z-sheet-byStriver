// A number N is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
// Given a number N, the task is to return the list/vector of the factorial numbers smaller than or equal to N.


import java.util.ArrayList;
import java.util.Scanner;

public class FactorialLessThanN {
    static Long factorial(Long n)
    {
        if(n==1)
        return 1L;
        else
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int N;
        System.out.println("Enter number");
        N = S.nextInt();
        S.close();
        Long x=0L;
        Long i=1L;
        ArrayList<Long> arr=new ArrayList<>();
        while(true)
        {
            x=factorial(i);
            i+=1;
            if(x<=N){
            arr.add(x);
            }
            else
            break;
        }
        for(int j=0;j<arr.size();j++)
        System.out.print(arr.get(j)+" ");
        
    }
}
