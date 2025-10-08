import java.util.*;
import java.lang.*;
public class Bubble
{
    public static void main(String args[])throws Exception
    {
        int n;
        int temp;
        int i=0;
        int j=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        n=s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array :: ");
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        System.out.println("The elements before sorting");
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if (a[j] > a[j + 1]) 
                {
                  temp = a[j];
                  a[j] = a[j + 1];
                  a[j + 1] = temp;
                        
                 }
            }
            
        }
        System.out.println("The elements after sorting");
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
} 

