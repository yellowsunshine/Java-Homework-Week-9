import java.util.Scanner;

public class Q3ReverseAnArray {
    /*
    3. Write a Java program to reverse an array of integer values.
     */

    public static void main(String[] args)
    {
        int a, res,i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        a = s.nextInt();
        int array[] = new int[a];
        int reverse[] = new int[a];
        System.out.println("Enter "+a+" elements ");
        for( i=0; i < a; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for( i=a;i>0 ; i--,j++)
        {
            reverse[j] = array[i-1];
            System.out.println(reverse[j]);

        }
    }
}
