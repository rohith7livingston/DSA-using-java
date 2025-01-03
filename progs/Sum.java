import java.io.*;
import java.util.*;
class Sum
{
    public static void main(String args[])throws Exception
    {
        int a,b;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the value f a");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the value of b");
        b=Integer.parseInt(br.readLine());
        System.out.println("The sum is ::"+(a+b));

    }
}