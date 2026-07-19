import java.util.Arrays;

public class MatrixTesting {

	void main() {
		System.out.println("we're in");
		int[] arr_A = {1,2,3};
		int[] arr_B = {1,2,4};
		System.out.println(Arrays.toString(arrayAddition(arr_A,arr_B)));
		int[][] A = {{3,4,6},{3,2,2},{1,1,2}};
		int[][] B = {{1,1,1},{4,3,4},{1,1,1}};

//		for (int i = 0; i < A.length ; i++){
//			for (int j = 0; j < A.length;j++ ) {
//				System.out.print("[" + A[i][j] + "]");
//			}
//			System.out.println("");
//		}
		//System.out.print("\nsize of array is :" +A.length);
	}
	private void MatrixAddding(int[][] arrayA, int[][] arrayB){
		if (arrayB.length != arrayA.length)
			System.err.println("Matrices being must be the same size");
		else if (arrayB.length == arrayA.length){

		}else
			System.err.println("invalid inputs");

		if (arrayB.length == arrayA.length){
			for(int i = 0; i < arrayA.length ; i ++){
				for (int j = 0; j < arrayA.length ; j++){

				}
			}
		}
	}
	/*Maybe for what i'm tryna do here, i need to be able to add 2 1D arrays
  And still be able to produce a new array with the sum of each index in the arrays*/


	//A little demo
	private int[] arrayAddition(int[] arr_A, int[] arr_B){
		int[] arr_C = new int[arr_B.length];
		for (int i = 0;i < arr_A.length; i ++){
			arr_C[i] = arr_A[i] + arr_B[i];
		}
		return arr_C;
	}
}


//for this test i will use built in arrays
//int[][] A = new int[3][];
//what i just did
		/*
		* Stack          Heap
+---+          +-------------------+

| A | -------> | [0] -> null       |
+---+          | [1] -> null       |
               | [2] -> null       |
               +-------------------+
*/
	/*but for this case of simplicity
	int[][] A = new int[3][3];

	int[][] B = new int[3][3];
	*/
