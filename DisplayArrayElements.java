// Write a program to create an array, initilize values in to it and display the array elements.

import java.util.Scanner;
public class DisplayArrayElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements are:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
        
    }
}