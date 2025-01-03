import java.util.*;

public class LinkedList17 {
    public static void main(String args[])
    {
        student sArray[] = new student[5];
        sArray[0] = new  student("vinnu",19);
        sArray[1] = new  student("David",13);
        sArray[2] = new  student("Solomon",30);
        sArray[3] = new  student("joseph",19);
        sArray[4] = new  student("Daniel",23);
        LinkedList <student> ll = new LinkedList <student> (Arrays.asList(sArray));
        student temp;
        Iterator<student> itr = ll.iterator();
        while(itr.hasNext())
        {
            temp=itr.next();
            temp.display();
        }
    }
}
class student
    {
        String name;
        int age;
        student(String name,int age)
        {
            this.name=name;
            this.age=age;
        }
        void display()
        {
            System.out.println("Name" + name + " age ::" +age);
        }
    }