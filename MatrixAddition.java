import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MatrixAddition {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("welcome to matrices");
        try{
        BufferedReader reader = new BufferedReader(new FileReader("mat_add.txt"));
            String line;

            while((line = reader.readLine()) != null){
                //System.out.println(line);
                String[] matrix = line.split(";");

                for (int i = 0; i < matrix.length ; i++){

                    String[] rows = line.split(",");
                    // now this is where I need a short demo
                }
            }

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private int[][] MatrixAddding(int[][] arrayA, int[][] arrayB){
        int[][] arrayC = new int[arrayA.length][arrayA.length];

        if (arrayB.length != arrayA.length)
            System.err.println("Matrices being must be the same size");

        else if(arrayB.length == arrayA.length){
            for(int i = 0; i < arrayA.length ; i ++){
                for (int j = 0; j < arrayA.length ; j++){
                    arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
                }
            }
        }return arrayC;//test next time, commit for now...
    }

}
