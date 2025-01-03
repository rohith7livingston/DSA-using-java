import java.util.*;
import java.io.*;
class BikeRacers
{
    public static void main(String args[])
    {
        double a,b,c,d,e;
        Scanner s= new Scanner(System.in);
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        d=s.nextDouble();
        e=s.nextDouble();
        double avg;
        avg=(a+b+c+d+e)/5;
        System.out.println("the avergae speed of the bike racers ::"+avg);
        System.out.println("qualifiying bike racers");
        if(a>=avg)
        {
            System.out.print(","+a);
        }
         if(b>=avg)
        {
            System.out.print(","+b);
        }
         if(c>=avg)
        {
            System.out.print(","+c);
        }
         if(d>=avg)
        {
            System.out.print(","+d);
        }
         if(e>=avg)
        {
            System.out.print(","+e);
        }
    }
}