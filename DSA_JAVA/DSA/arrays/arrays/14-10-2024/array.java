import java.util.*;
import java.io.*;

public class array
{
    public static void main(String args[])
    {
        int[] arr = {10,20,30,40};
        int[] arr1 = {20,30,40,10,4567,6754,47,45,47,547};
        Arrays.parallelSort(arr1);
        System.out.println("The list is :: "+Arrays.binarySearch(arr1,10));
    }
}