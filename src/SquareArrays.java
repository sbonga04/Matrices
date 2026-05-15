import java.util.Arrays;

public class SquareArrays {

    private static int[] squares(int[] nums){
        int[] squareNums = new int[nums.length];
        for(int i = 0; i < nums.length ; i ++){
            squareNums[i] =(int) Math.pow(nums[i],2);
        }
        //sorting//
        Arrays.sort(squareNums);
        return squareNums;
    }


    public static void main(String[] args) {
        int[] nums = {4,5,2,6,7};

        System.out.println(Arrays.toString(squares(nums)));
    }
}
