


public class MatrixTesting {

	void main() {
		System.out.println("we're in");
		int[][] A = {{3,4,6},{3,2,2},{1,1,2}};
		int[][] B = {{1,1,1},{4,3,4},{1,1,1}};

		for (int i = 0; i < A.length ; i++){ // i didn't use i++ but still program increments, insane
			for (int j = 0; j < A.length;j++ ) {
				System.out.print("[" + A[i][j] + "]");
				// if i use break the program will not stop running
			}
			System.out.println("");
		}
		System.out.print("\nsize of array is :" +A.length); //why wont this display anything on the console but its still the same
		//line as the one before the nested for loop

	}
	private void MatrixAddding(int[][] arrayA, int[][] arrayB){
		if (arrayB.length != arrayA.length)
			System.err.println("Matrices being must be the same size");

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
