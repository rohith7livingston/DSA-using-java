class main
{
    public static void main(String args[])
    {
        Gen <String,Integer> a = new Gen <String,Integer> ("vinnu",7);
        a.Print();
    }
}
class Gen <T,V>
{
    T obj1 ;
    V obj2 ;
    Gen(T obj1,V obj2)
    {
        this.obj1=obj1;
        this.obj2=obj2;
    }
    void Print()
    {
        System.out.println(" "+obj1+" "+obj2);
    }
}