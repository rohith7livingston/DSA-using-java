import java.io.*;
import java.lang.*;
import java.util.*;


public class arrayprb1 {
    public static void main(String args[])
    {
        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of elements :: ");
        int n = s.nextInt();
        Integer[] array = new Integer[n];
        System.out.print("Enter the elements :: ");
        for(i = 0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        String[] array1 = new String[n];
        for( i= 0 ;i<n;i++)
        {
            array1[i]=s.nextLine();
        }
        Reverse  r = new Reverse();
        r.reverse(array);
        r.reverse(array1);
    }
}

class Reverse
{
    static <T> void reverse(T a[])
    {
        int n = a.length;
        for (T x:a)
        {
            System.out.print(x + " ");
        }
        T[] array = (T[]) new Object[n];
        int j =0;
        for (int i = 0; i < n; i++) {
            array[i] = a[n - 1 - i]; // Reverse logic
        }
        System.out.println();
        for (T ne:array)
        {
            System.out.print(ne + " ");
        }
    }
}