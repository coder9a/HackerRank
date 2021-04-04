import java.util.Scanner;

public class Left_Rotation_N2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int d = 4,i,k;
        int x = 0;
        for (k=0;k<d;k++)
        {
            x = arr[0];
            for (i=0;i<n-1;i++)
            {
                arr[i] = arr[i+1];
            }
            arr[i] = x;
        }
        for (int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
