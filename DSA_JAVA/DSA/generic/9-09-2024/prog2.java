package DSA.generic;
class Person
{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
public class prog2 {
    public static void main(String args[])
    {
        Person p1 = new Person("vinny", 18);
        Person p2 = new Person("Rohith",19);
        swap(p1,p2);
        System.out.println("Person1 ="+p1.name+" "+p1.age);
        System.out.println("Person2 = "+p2.name+" "+p2.age);
    }
    static void swap(object p1,object p2)
    {
        object temp;
        temp=p1;
        p1=p2;
        p2=temp;
    }
}
