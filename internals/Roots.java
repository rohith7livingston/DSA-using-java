package internals;
import java.util.*;
import java.io.*;
class discriminat
{
    discriminat(int a,int b, int c)
    {
        int dis;
        dis=(b*b)-(4*a*c);
        if(dis==0)
        {
            System.out.println("The roots are real and equal :: "+((-b)/2*a));
        }
        else if(dis>0) {
            double r1=(-b+Math.sqrt(dis))/(2*a);
            double r2=(-b-Math.sqrt(dis))/(2*a);
            System.out.println("first root is ::"+r1);
            System.out.println("second root is::"+r2);
        }
        else
        {
            System.out.println("The roots are imaginary");
        }
    }
}
public class Roots {
    int a,b,c;
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        discriminat d = new discriminat(a, b, c);
    }
}
