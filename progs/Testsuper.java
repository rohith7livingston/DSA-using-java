class Animals
{
    void Dog()
    {
        System.out.println("Dog is created");
    }
}
class Goat extends Animals
{
    void Dog()
    {
        System.out.println("Goat is created");
        super.Dog();
    }
}
class Testsuper
{
    int l;
    public static void main(String args[])
    {
        Goat g = new Goat();
        g.Dog();
    }
}