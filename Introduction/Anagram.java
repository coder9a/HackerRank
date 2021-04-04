
/*
Two strings AA and BB are called anagrams if they consist same characters,
but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".
Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not.
The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.
This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.
Sample Input 1
anagram
margana
Sample Output 1:
Anagrams
*/
import java.util.Scanner;

public class Anagram
{
    public static boolean Check_Anagram(String a, String b)
    {
        boolean flag = false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        // Converting array to string
        char [] ch1 = a.toCharArray();
        java.util.Arrays.sort(ch1);
        char [] ch2 = b.toCharArray();
        java.util.Arrays.sort(ch2);
        String s1 = new String(ch1);
        String s2 = new String(ch2);
        if(s1.equals(s2))
        {
            flag = true;
        }
        return flag;
    }
    static  final int SIZE = 26;
    public static void main(String[] args)
    {
        int [] freq = new int[SIZE];
        int i,c;
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        boolean flag = Check_Anagram(a,b);
        if(flag)
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}
