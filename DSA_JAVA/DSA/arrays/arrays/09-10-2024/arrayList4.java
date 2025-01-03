import java.util.*;
import java.io.*;

public class arrayList4 {
    public static void main(String args[])
    {
        ArrayList<String> hardwork = new ArrayList<String>();
        System.out.println("Is hardwork empty :: "+ hardwork.isEmpty());
        hardwork.add("GOD");
        hardwork.add("conssistency");
        hardwork.add("discipline");
        hardwork.add("honesty");
        hardwork.add(null);
        System.out.println("hard work size :: "+ hardwork.size());
        System.out.println("hardwork access:: "+ hardwork.get(2));
        hardwork.set(4, "respect");
        System.out.println(hardwork);
        System.out.println("hardwork contains ? 'GOD':: "+ hardwork.contains("GOD"));

    }
}
