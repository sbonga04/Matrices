//problem statement
//  You are given a 2D matrix:
//        1 2 3
//        4 5 6
//        7 8 9
//expected output
//Row 0 sum = 6
//Row 1 sum = 15
//Row 2 sum = 24


public class array2D {

    public static void main(String[] args) {
        //System.out.println("new file");

        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for( int row = 0; row < matrix.length ; row ++){
            int sum = 0;
            for (int col = 0; col<matrix[row].length; col ++){
                sum = matrix[row][col] + sum;
            }
            if sum > 20
                System.out.println("The sum is > 20: " + sum);
            else
                System.out.println("sorry fellas, sum is < 20");
        }
    }
}
