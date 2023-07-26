import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        

        int row=matrix.length;
        int col=matrix[0].length;

        int top=0;
        int left=0;
        int bottom=row-1;
        int right=col-1;

        List<Integer> li=new ArrayList<>();


        while(left<=right && top<=bottom)
        {
            // left --> right
            for (int i = left; i <= right; i++) {
                li.add(matrix[top][i]);
            }
            top++;

            // top -->  bottom
            for (int i = top; i <= bottom; i++) {
                li.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // right --> left
                for (int i = right; i >= left; i--) {
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // bottom --> top
                for (int i = bottom; i >= top; i--) {
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        for(int i=0;i<li.size();i++)
        System.out.print(li.get(i)+" ");

    }
}
