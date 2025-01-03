package DSA.generic;

/**
 * generic
 */
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Democlass obj = new Democlass();
        obj.genericprint("hai",7);
    }
}
class Democlass
{
    static <T> void genericprint(T a,T b)
    { 
        T temp = a;
        a = b;
        b = temp;
        System.out.println( "a  = "+a + "  b = " +  b);
    }
} 