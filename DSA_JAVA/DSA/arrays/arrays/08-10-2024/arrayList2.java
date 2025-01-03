import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class arrayList2 {
    public static void main(String args[])
    {
        ArrayList<Person> newList = new ArrayList<Person>();//list with user defined data type
        newList.add(new Person("vinnu", 19));
        Person p1 = new Person("Nirmala", 45);
        newList.add(p1);//adding a object
        newList.add(p1);//duplicate element
        newList.add(new Person("rajendra", 50));
        newList.forEach(p ->p.Print());
    }
}
//user defined data type
class Person
{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void Print()
    {
        System.out.println(name+" "+age);
    }
}
