import java.util.Arrays;

public class SquareNumbers {

    public static void main(String[] args) {
//        int[] squareNumbers = new int[10];
//
//        for(int x = 0; x < 10; x ++){
//
//            int square = (x + 1) * (x +1);
//            squareNumbers[x] = square;
//        }
//
////        for(int square: squareNumbers)
////            System.out.println(square);

        //System.out.println(Arrays.toString(squareNumbers));


        int[] arr = new int[6];
        //current length is 0 because it has 0 elements
        int length2 = 0;
        //add 3 items into it
        for(int i = 0; i < 3 ; i++){
            arr[i] = i * i;
            length2++;
        }
//        System.out.println("the capacity of an array is: " + arr.length);
//        System.out.println("the length of an array is: " + length);
//

        int [] arr2 = {1,1,0,1,1,1,0,1};
        //int length = arr2.length;
        int len = 0;
        int maxLength = 0;
        for(int i = 0; i < arr2.length ; i ++){
            if (arr2[i] == 1 )
                len++;

            //if (arr[i] == 0)

        }
        System.out.println(maxLength);
    }
}
