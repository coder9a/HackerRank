import java.util.Scanner;
public class Frequency_String_Character
{
    static  final int SIZE = 26;
    public static void main(String[] args)
    {
        int [] freq = new int[SIZE];
        int i,c;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        String a = "geeksforgeeks";
        String b = "geeksforgeeks";
        int l1 = a.length();
        int l2 = b.length();
        // Counting frequency of each character
        for(i=0;i<l1;i++)
        {
            freq[a.charAt(i) - 'a']++;
        }
       // Printing the characters along with their frequency
        for(i=0;i<l1;i++)
        {
           if(freq[a.charAt(i) - 'a'] != 0)
           {
               System.out.println(a.charAt(i)+" "+freq[a.charAt(i)]);
               System.out.print(a.charAt(i));
               System.out.print(freq[a.charAt(i) - 'a'] + " ");

               freq[a.charAt(i)-'a'] = 0;
           }

        }

    }
}
