import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {

        List<Integer> A = new ArrayList<>();
        int n = 3;
        
        A.add(1);
        A.add(3);
        A.add(2);
        
        int ind=-1;

        for(int i=n-2;i>=0;i--)
        {
            if(A.get(i)<A.get(i+1))
            {
                ind=i;
                break;
            }
        }

        if(ind==-1)
        {
            Collections.sort(A);
            for (int i = 0; i < A.size(); i++)
            System.out.print(A.get(i)+" ");
            return ;
        }

        for(int i=n-1;i>ind;i--)
        {
            if(A.get(i)>A.get(ind))
            {
                Collections.swap(A,i,ind);
               break; 
            }
        }

        Collections.sort(A.subList((ind + 1), n));
         for (int i = 0; i < A.size(); i++)
            System.out.print(A.get(i)+" ");
    }
}
