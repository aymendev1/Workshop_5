import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Task02 {
    public static void main(String[]args){


        int arrayrnd[] =new int[10];
        System.out.println("Array is :");
        for (int i = 0; i < arrayrnd.length; i++) {
            //Creating a random number from 1 to 100
            int rnd = (int)(Math.random() * 100 + 1);
            arrayrnd[i]=rnd;
            System.out.print(arrayrnd[i]+" ");
        }
        IntSummaryStatistics stat = Arrays.stream(arrayrnd).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        System.out.println("\nMin = " + min);
        System.out.println("Max = " + max);






    }


}
