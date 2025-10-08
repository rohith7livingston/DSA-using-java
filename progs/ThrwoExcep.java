import java.util.*;
public class ThrwoExcep {
    public static void main(String args[])
    { int age;
        System.out.println("Enter your age::");
        Scanner s = new Scanner(System.in);
        age=s.nextInt();
        try
        {
        if(age<18)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println("You are Eligible");
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Custom exception caught:Age must be above 18 years");
        }
    }

}
