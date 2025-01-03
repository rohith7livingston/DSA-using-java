import java.util.ArrayList;

public class arrayList3 {
    
    public static void main(String args[])
    {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        ArrayList<Integer> numbers = new ArrayList<Integer>(odd);
        ArrayList<Integer> even = new ArrayList<Integer>();
        even.add(2);
        even.add(4);
        even.add(6);
        numbers.addAll(even);
        System.out.println(numbers);
    }
}
