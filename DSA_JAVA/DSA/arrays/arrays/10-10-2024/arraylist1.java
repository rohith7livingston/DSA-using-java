import java.io.*;
import java.util.*;

// programe to create a arrayList of prime and check if they are prime or not if not remove it
public class arraylist1 {
    public static void main(String args[])
    {
        ArrayList<Integer> prime = new  ArrayList<Integer>();
        prime.add(2);
        prime.add(5);
        prime.add(4);
        prime.add(7);
        prime.add(10);
        prime.add(3);
        //2.Iterator
        Iterator<Integer> numbersIterator = prime.iterator();
        while(numbersIterator.hasNext())
        {
            Integer num =numbersIterator.next();
            //prime class
            Prime p = new Prime(num);
            if(p.isPrime())
            {
                ;
            }
            else{
                numbersIterator.remove();
            }
        }
        System.out.println(prime);
    }
}
class Prime
{
    int num,count;
    Prime(int num)
    {
        this.num=num;
        
    }
    // int isPrime()
    // {
    //     for(int i=1;i<num;i++)
    //     {
    //         if(num % i == 0)
    //         {
    //             count++;
    //             if(count > 2)
    //             {
    //                 return 0;
    //             }
    //         }
    //         else
    //         {
    //             continue;
    //         }
    //     }
    //     return 1;
    // }
    boolean isPrime() {
        if (num <= 1) return false;  // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {  // Only check up to sqrt(num)
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
