import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demoArray{
    public static void main() throws FileNotFoundException {
        System.out.println("demo is here");

        System.out.println("So in this build i'm gonna be reading from an outside array" +
                "\ntaking data that is splited then i'll add those 2 arrays and give the sum");
        try {

            BufferedReader reader = new BufferedReader(new FileReader("demo_Array"));
            String line;

            while ((line = reader.readLine() != null) //i am completely iritated right now...need a breather
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}