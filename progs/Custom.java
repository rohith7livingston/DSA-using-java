import java.util.*;
class InvalidAgeexception extends Exception
{
    InvalidAgeexception(String msg)
    {
        super(msg);
    }
}
public class Custom
{
     static int x;
    public static void main(String args[])
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        x=s.nextInt();
        try
        {   
            age(x);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
    static void age(int age)throws InvalidAgeexception
    {
        if(age<0)
        {
            throw new InvalidAgeexception("Invalid age");
        }
        else
        {
            System.out.println("age :"+x);
        }
    }  
}
