import java.util.Scanner;

public class Left_Rotation_N
{
    public static void main(String[] args)
    {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[5];
        int i=0;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rotating factor");
        int size = arr1.length;
        int d=3;
        int rotating_factor = d;
        while(rotating_factor<size)
        {
            arr2[i] = arr1[rotating_factor];
            i++;
            rotating_factor++;
        }
        rotating_factor=0;
        while(rotating_factor<d)
        {
            arr2[i] = arr1[rotating_factor];
            i++;
            rotating_factor++;
        }
        for (int j=0;j<5;j++)
        {
            System.out.print(arr2[j]+" ");
        }
    }
}
