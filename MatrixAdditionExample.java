//In this documet i'm gonna try and make something like the actuall problem that i need to solve at matrixAddtion Main
//this will make me understand exactly how can i solve the problem better since i won't be reading from a file here
//i am using my own hard core numbers just to test how the solution might look like

public class MatrixAdditionExample {


    static void main() {
        //say we got a line of string
        String line = "3 2 5, 4 5 1, 6 3 1; 2 3 1, 3 4 1, 2 1 2";

        //splitting matrix itself now to A and B
        String[] matrix = line.split(";");
        //
        for(int i = 0; i < line.length(); i ++){
            String[] row = matrix[i].split(",");

            int[][] AorB = new int[row.length][]; //use later

            for(int r = 0; r<row.length ; i++){

                row[r] = row[r].trim().replace("\\s+" , " ");

                String[] nums = row[r].split(" ");
                }

        }
    }
    public int[][] matrix_addition(int [][]A,int[][] B){
        //trying to add 2 matrices

        return B;
    }
}
