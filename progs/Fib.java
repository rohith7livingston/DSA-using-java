import java.io.*;
import java.util.*;
public class Fib 
{
    public static void fibRec(int n)
    {  
        int fib1=1,fib=0,fib2=1;
        System.out.print(fib+" "+fib1+" ");
        while(fib2!=n)
        {
            fib=fib1;
            fib1=fib2;
            fib2=(fib+fib1);
            System.out.print(fib2+" ");
        }
    }
    public static void main(String args[])throws Exception   
    {
        int fib1=1,fib=0,fib2;
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enetr the value where you want to end the series");
        n=s.nextInt();
        Fib.fibRec(n);


    }
}
