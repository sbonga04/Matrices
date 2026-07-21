import java.util.Arrays;

public class MatrixTesting {

	void main() {
		System.out.println("we're in" +
				"\nThis program is going to do the sum of two integer arrays and give the results");

		int[] arr_A = {1,2,3};
		int[] arr_B = {1,2,4};

		System.out.println("Arrays being added are: (A)=" +  Arrays.toString(arr_A) + " + (B)=" + Arrays.toString(arr_B));
		System.out.println("results = (C)=" +Arrays.toString(arrayAddition(arr_A,arr_B)));

		int[][] A = {{3,4,6},{3,2,2},{1,1,2}};
		int[][] B = {{1,1,1},{4,3,4},{1,1,1}};

		//System.out.println("\nThis is a 2D Matrix array\n"+Arrays.deepToString(A));

		//took this code from google, A nice format of printing a matrix
		System.out.println("\nMatrix format" +
				"\n====A=====");
		Arrays.stream(A).map(Arrays::toString).
				forEach(System.out::println);

		System.out.println("\n====B====");
		Arrays.stream(B).map(Arrays::toString).
				forEach(System.out::println);

		System.out.println("\nresults:(C)=");
		Arrays.stream(MatrixAddding(A,B)).map(Arrays::toString)
				.forEach(System.out::println);
//		for (int i = 0; i < A.length ; i++){
//			for (int j = 0; j < A.length;j++ ) {
//				System.out.print("[" + A[i][j] + "]");
//			}
//			System.out.println("");
//		}e
		//System.out.print("\nsize of array is :" +A.length);
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
