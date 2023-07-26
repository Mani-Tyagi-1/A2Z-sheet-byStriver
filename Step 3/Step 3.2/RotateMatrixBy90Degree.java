public class RotateMatrixBy90Degree {
    public static void main(String[] args) {

        int mat[][] = {{1,2},{3,4}};
        
        int len=mat.length;

        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<len;i++)
        {
            for (int j = 0; j < len / 2; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[i][len - 1 - j];
                mat[i][len - 1 - j] = temp;
            }
        }

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
            
        }
        
    }
}
