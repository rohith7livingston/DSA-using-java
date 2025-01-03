/* 
public class programe {
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7,8}; 
        arrayInt obj = new arrayInt(a);
        obj.Print();
    }
}
class arrayInt
{
    int a[];
    arrayInt(int a[])
    {
        this.a = a;
    }
    void Print()
    {
        for(int x:a)
        {
            System.out.print(x+ " ");
        }
    }
} */

public class programe
{
    public static void main(String args[])
    {
        String a[] = {"java","c","python"};
        generic obj = new  generic(a);
        obj.Print();
    }
}
class generic <T>
{
    T a[];
    generic(T a[])
    {
        this.a=a;
    }
    void Print()
    {
        for(T x: a)
        {
            System.out.print(x+" ");
        }
    }
}
