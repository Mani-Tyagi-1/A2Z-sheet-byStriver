// GFG problem
 /* 
 Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
 If the user's choice is 1, calculate the area of the circle having the given radius(R).  
 Else if choice is 2, calculate the area of the rectangle with given length(L) and breadth(B).
 
 Example 1:
 Input: 
 choice = 1, 
 R = 5
 Output: 78.53981633974483
 Explaination: The choice is 1. 
 So we have to calculate the area of the circle.
 */



//{ Driver Code Starts
// Initial Template for Java
// -----------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

class gfgProblem{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int choice = Integer.parseInt(in.readLine());
            java.lang.String[] a = in.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<Double>();
            for(int i = 0;i < choice;i++)
                arr.add(Double.parseDouble(a[i]));
            
            Solution ob = new Solution();
            if(choice == 1)
                System.out.println(ob.switchCase(choice, arr));
            else
                System.out.println((int)ob.switchCase(choice, arr));
        }
    }
}
// } Driver Code Ends

// -----------------------------------------------------------------------------------------------------------------------------
// User function Template for Java

class Solution{
    double switchCase(int choice, List<Double> arr){
    switch(choice){
        case 1:
            return Math.PI*arr.get(0)*arr.get(0);
            
        case 2:
            return arr.get(0)*arr.get(1);
        default:
        break;
    }
    return -1;
    
}
}




