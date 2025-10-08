import java.io.*;
public class SumofIntegers 
{
    public static void main(String args[])throws Exception
    {
        int i,sum=0;
        int count = 0;  
        System.out.println("The numbers are ::");
        for(i=100;i<200;i++)
        {
            if(i%7==0)
            {
                count++;
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println("\nThe no of numbers divisble are :: "+count);
        System.out.println("The sum is :: "+sum);

    }
}
