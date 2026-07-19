


public class MatrixTesting {

	void main() {
		System.out.println("we're in");
		int[][] A = {{3,4,6},{3,2,2},{1,1,2}};
		int[][] B = {{1,1,1},{4,3,4},{1,1,1}};


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
