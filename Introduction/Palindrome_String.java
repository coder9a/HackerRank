/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 *
 * Constraints
 *  will consist at most  lower case english letters.
 *
 *
 * Sample Input
 *
 * madam
 * Sample Output
 *
 * Yes
 */


import java.util.Scanner;

public class Palindrome_String
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder str = new StringBuilder();
        str.append(A);
        str.reverse();
        if(A.equalsIgnoreCase(String.valueOf(str)))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
