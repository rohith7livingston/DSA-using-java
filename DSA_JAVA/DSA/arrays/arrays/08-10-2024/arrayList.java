import java.util.*;
import java.lang.*;
import java.io.*;
//arrayList
class arrayList
{
    public static void main(String args[])
    {
        //creating a array List
        ArrayList <String> Myself = new ArrayList<String> ();
        //adding elements to the array list
        Myself.add("ME");
        Myself.add("Jesus");
        Myself.add("LORD");
        System.out.println(Myself);
        // creating a arrayList with existing list
        ArrayList <String> My = new ArrayList<String>(Myself);
        
        My.add("Holy spirit");
        System.out.println(My);
    }
}