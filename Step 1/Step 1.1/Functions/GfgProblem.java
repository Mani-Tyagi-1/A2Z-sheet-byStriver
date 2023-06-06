/*
 *  enrolling today! 
    Geek is learning about functions and calling a function with arguments. He learns that passing can take one of two forms: pass by value or pass by reference.
    Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.
 * 
 */

//  --------------------------------------------------------------------------------------
//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class GfgProblem {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.close();
            Solution obj = new Solution();
            int ans[] = obj.passedBy(n, m);

            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends
// ----------------------------------------------------------------------------------------------------
// User function Template for Java

class Solution {
    int[] passedBy(int a, int b) {
        // code here
        int res[]=new int[2];
        res[0]=a+1;
        res[1]=b+2;
        
        return res;
    }
}
