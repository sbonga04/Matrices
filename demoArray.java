import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class demoArray{
    public static void main() throws FileNotFoundException {
        System.out.println("demo is here");

        System.out.println("So in this build i'm gonna be reading from an outside array" +
                "\ntaking data that is splited then i'll add those 2 arrays and give the sum");
        try {

            BufferedReader reader = new BufferedReader(new FileReader("demo_Array"));
            String line;

            while ( (line =  reader.readLine()) != null){
               //spliting the line
               String[] list1 = line.toString().split(";");

               String[] arr1 = list1[0].split(",");
               String[] arr2 = list1[1].split(",");
               System.out.println(Arrays.toString(list1));

               int sum[] = new int[arr1.length];
                for(int i = 0; i < arr1.length; i++){
                    sum[i] = Integer.parseInt(arr1[i]) +
                            Integer.parseInt(arr2[i]);
                }

                System.out.println(Arrays.toString(sum));
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}