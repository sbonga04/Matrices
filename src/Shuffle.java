import java.util.Arrays;

public class Shuffle{


    public static int[] slowShuffle(int N){

        int[] shuffled = new int[N];
        boolean[] isNotPresent = new boolean[N];

        for(int i = 0; i <N ; i++) {
            shuffled[i] = 1 + (int) (Math.random() * N);
            return shuffled;
        }
        int i = 0;
        while (i < N-1){
            int r = (int)(Math.random()*N);

         //   if (shuffled[i])
        }
        return shuffled;
    }


    public static void main(String[] args){

        int[] shuffled = Shuffle.slowShuffle(8);
        System.out.println(Arrays.toString(shuffled));
    }

    public static int[] slowestShuffle(int N){
        //Generating random numbers
        int [] shuffled = new int[N];

        for (int i = 0; i < N-1; i ++ ) {
            shuffled[i] = 1 + (int) (Math.random() * N);

            if (shuffled[N-1] == 0){
                shuffled[N-1] = 1 + (int) (Math.random() * N);
            }
        }
        return shuffled;

    }


}
