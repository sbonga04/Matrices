import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MatrixAddition {

    public static void main() throws FileNotFoundException {
        //System.out.println("welcome to matrices");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("mat_add.txt"));

            String line;
            while ((line = reader.readLine()) != null){
                //System.out.println(line);

                //split matrix by (;)
                String[] array = line.split(";");

                for(int i = 0;i < array.length ; i ++){
                    //spilt that part of matrix by (,) so we get rows and cols
                    String[] rows = line.split(",");
                    //initialize the 2D array now
                    int[][] matrix = new int[rows.length][];

                    for(int r = 0; r< rows.length; r ++){
                        //now i want to clean the rows
                        //trim is gonna replace spaces
                        rows[r] = rows[r].trim().replace("\\s+"," ");
                        //continue next time....commit for now
                    String[] arr = rows[r].split(" ");
                    matrix[r] = new int[arr.length];
                        for(int c = 0 ; c < arr.length ; i++)
                            matrix[r][c] = Integer.parseInt(arr[c]);
                    }
                }

            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            //method for adding matrices
    }   private void matrix_Addition (int[][] A, int[][] B){
            //try adding matrix a and b
            for (int i= 0; i < A.length; i ++){
                //this is the for loop block
                //this is the new line
                if (i < 6){
                    System.out.println("less than 6");
                }
            }
    }

}
