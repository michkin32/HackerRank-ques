import java.util.Scanner;

public class Problems {
    /*
    Given a string , print Yes if it is a palindrome, print No otherwise.
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String reversedString = "";

        for (int i = A.length(); i >= 0; i--) {
            reversedString += A.charAt(i);
        }
        if (reversedString.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        /* Enter your code here. Print output to STDOUT. */

    }
}
