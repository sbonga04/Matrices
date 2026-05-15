import java.util.Arrays;

public class arrayLargeVal2D {

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //need to assumme that the max is 1st element is the largest first
        int max = matrix[0][0];
        for(int row= 0 ; row<matrix.length; row ++) {
            for (int col = 0; col < matrix[row].length; col++)
                if (matrix[row][col] < max)
                    max = matrix[row][col];
        }

        System.out.println("The largerst no is :" + max);

    }
}
