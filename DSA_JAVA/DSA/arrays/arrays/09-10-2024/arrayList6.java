import java.util.*;
import java.io.*;

public class arrayList6 {
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        System.out.println("ArrayList: " + numbers);
        System.out.println(" ArrayList 0 index element : " + numbers.get(0));
        System.out.println("The index of 3 is :: "+numbers.indexOf(3));
        System.out.println("The last index of 3 is :: "+numbers.lastIndexOf(3));
        Collections.sort(numbers);
        System.out.println("The last index of 3 is :: "+numbers);
        //string compare
        ArrayList<String> hardwork = new ArrayList<String>();
        System.out.println("Is hardwork empty :: "+ hardwork.isEmpty());
        hardwork.add("GOD");
        hardwork.add("conssistency");
        hardwork.add("discipline");
        hardwork.add("honesty");
        hardwork.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
        }});
        System.out.println("after sorting :: "+hardwork);
    }
}