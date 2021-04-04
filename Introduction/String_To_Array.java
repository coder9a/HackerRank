import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class String_To_Array
{
    public static void main(String[] args)
    {
        String str = "Geeksforgeeks";
        str = str.toLowerCase();
        int len = str.length();
        char[] ch = new char[len];
        for (int i=0;i<len;i++)
        {
            ch[i] = str.charAt(i);
        }
        // Printing the array

        for (int i=0;i<len;i++)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
        for(char c1: ch)
        {
            System.out.print(c1);
        }
        System.out.println();
        // Sorting the Array
        Arrays.sort(ch);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(ch));
    }
}
