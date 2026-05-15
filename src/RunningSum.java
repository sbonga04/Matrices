import java.util.Arrays;

public class RunningSum {

    public static int[] solution(int[] arr){
        int[] sum = new int[arr.length];

        sum[0] = arr[0];
        for(int i = 1; i < arr.length; i ++){
                 sum[i] = sum[i-1] + arr[i];
            }
        return sum;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};

        System.out.println(Arrays.toString(RunningSum.solution(nums)));
    }
}
