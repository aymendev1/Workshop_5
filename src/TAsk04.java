import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TAsk04 {
    public static void main(String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter The first word : ");
        String Word01=reader.readLine();
        System.out.print("Please enter The Second word : ");
        String Word02=reader.readLine();
        String W1W2=Word01.concat(Word02);
        System.out.print("Adding the first Word to the second : "+W1W2 );
        String W2W1=Word02.concat(Word01);
        System.out.print("\nAdding the second Word to the first : "+W2W1);
        System.out.println("\nIS the composition of  "+W1W2+" alternating : "+W1W2.equals(W1W2));
        System.out.println("IS the composition of  "+W2W1+" alternating : "+W2W1.equals(W1W2));
    }
}
