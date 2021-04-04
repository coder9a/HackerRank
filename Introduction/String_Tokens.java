import java.util.Scanner;

public class String_Tokens
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.length()>0)
        {
            String[] str = s.split("[!,?._'@\\s]+");
            int len = str.length;
            System.out.println(str.length);
            for(int i=0;i<len;i++)
                System.out.println(str[i]);
        }
        else
        {
            System.out.println(0);
        }
    }
}
