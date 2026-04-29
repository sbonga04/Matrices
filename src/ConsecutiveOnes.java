public class ConsecutiveOnes {


    private static int maxSum(int[] nums){
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 1)
                count++;
            else {
                if (count >= max) {
                    max = count;
                    count = 0;
                }

            }
        }
        if (count > max)
            max = count;
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1,0,1,0,1};
        int max = maxSum(nums);
        System.out.println(max);

    }
}
