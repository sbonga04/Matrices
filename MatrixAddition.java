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
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}