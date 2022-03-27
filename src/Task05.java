import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task05 {
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main (String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter The first word : ");
        String Word=reader.readLine().toLowerCase();

        if (isPalindrome(Word))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");

    }
}
