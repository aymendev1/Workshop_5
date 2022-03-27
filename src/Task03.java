import com.sun.tools.jconsole.JConsoleContext;

public class Task03 {
    public static void main(String[]args){
        // creating the two dim matrix

        int[][] matrix = new int[10][10];

        //for loop , used to add numbers from 1 to 9 to diagonal ;

        System.out.println("Dianogal of this matrix are : ");
        for (int i = 0; i < matrix.length; i++) {

            // i used random number to create random from 1 to 9 , so i won't get a zero value on the diagonal

            int rnd = (int)(Math.random() * 9 + 1);
            matrix[i][i]=rnd;
            System.out.print("\n"+matrix[i][i]+" ");
        }

        // filling the rest with the matrix

        for (int i = 0; i < matrix.length; i++){
            //second for statement for columns
            for (int j = 0; j < matrix.length; j++) {
                int rnd = (int)(Math.random() * 9 + 0);
                if (matrix[i][j]==0){
                    matrix[i][j]=rnd;
//                    You can Uncomment those 3 lines to check the matrix other values not the dianogal
//                    int row=i+1;
//                    int col=j+1;
//                    System.out.println("row"+row+","+"col:"+col+"="+matrix[i][j]);
                }

            }
        }
        // Calculating the sum of diagonal
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result+=matrix[i][i];
        }
        System.out.println("Result of sum is : "+result);

    }
}
