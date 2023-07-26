import java.util.ArrayList;
import java.util.*;

public class SetZeroMatrix {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        int m = 3;
        int n = 2;

        for(int i=0;i<n;i++)
        {
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<m;j++)
            {
                li.add(S.nextInt());
            }
            matrix.add(li);
        }
        S.close();

         int row[]=new int[n];        
        int col[]=new int[m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    row[i]=1;
                    col[j]=1;
                }

            }
        }
        // System.out.print()

        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
