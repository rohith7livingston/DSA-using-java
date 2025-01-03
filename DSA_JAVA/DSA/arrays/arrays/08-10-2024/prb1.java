import java.util.*;
import java.io.*;
import java.lang.*;

//deletion
public class prb1 {
    public static void main(String args[])
    {
        int i = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements :: ");
        for(i = 0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print ("Elements of array :: ");
        for(int j: array)
        {
            System.out.print(j +" ");
        }
        System.out.println();
        System.out.println("Enter the index you want to delete :: ");
        int d = s.nextInt();
        int[] array1 = new int[n+1];
        int nw=0;
        for(int l = 0 ;l<n; l++)
        {
            if(array[l]==array[d])
            {
                continue;
            }
            array1[nw++] = array[l];
        }
        for(int k :array1)
        {
            System.out.print(k+" ");
        }
    }
}
