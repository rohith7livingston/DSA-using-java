class Animal
{
    void Animal()
    {
        System.out.println("Animal is created");
    }
}
class Lion extends Animal
{
    void Lion()
    {
        System.out.println("Lion is created");
    }
    

}
public class TestSuper1 {
    public static void main()
    {
       Lion l = new Lion();
       l.Lion();
    }
}
