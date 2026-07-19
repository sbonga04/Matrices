//In this documet i'm gonna try and make something like the actuall problem that i need to solve at matrixAddtion Main
//this will make me understand exactly how can i solve the problem better since i won't be reading from a file here
//i am using my own hard core numbers just to test how the solution might look like

public class MatrixAdditionExample {


    static void main() {
        //say we got a line of string
        String line = "3 2 5, 4 5 1, 6 3 1; 2 3 1, 3 4 1, 2 1 2";
        //String[] array = {"3,4,5,2","5,e,r,5","r,w,tr,"," string","mine"};

        //splitting matrix itself now to A and B
        String[] arr = line.split(";");
        //
        for(int string = 0; string < line.length(); string ++){
            String[] row = arr[string].split(",");

            int[][] matrix = new int[row.length][]; //use later.. just after the for loop

            for(int r = 0; r<row.length ; r++){

                row[r] = row[r].trim().replace("\\s+" , " ");

                String[] nums = row[r].split(" ");

                matrix[r] = new int[nums.length]; //evaluate this line ...later

                //converting each string into an interger now
                for(int c = 0; c < nums.length ; c ++)
                    matrix[r][c] = Integer.parseInt(nums[c]); //getting back on this line again, took this from AI, some advanced stuff
                }

        }
    }
    public int[][] matrix_addition(int [][]A,int[][] B){
        //trying to add 2 matrices

        return B;
    }
}
