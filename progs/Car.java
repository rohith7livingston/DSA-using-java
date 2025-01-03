import java.io.*;
import java.util.*;
import java.lang.*;
public class Car
{
    String modle;
    String brand;
    int year;;
    public Car(String string, String string2, int i) {
    }
    public Car() {
    }
    public void Car()
    {
        brand="unkown";
        modle="unknown";
        year=1969;
    }
    public void Car(String modle,String brand,int year)
    {
        this.brand=brand;
        this.modle=modle;
        this.year=year;
    }
    public void Car(String modle,String brand)
    {
        this.brand=brand;
        this.modle=modle;
    }
    public void display()
    {
        System.out.println("Brand :: "+brand);
        System.out.println("modle :: "+modle);
        System.out.println("Year  :: "+year);
        System.out.println();
    }

    public static void main(String args[])
    {
        Car car1 = new Car();
        Car car2 = new Car("Mustang","Ford",1969);
        Car car3 = new Car("Skyline","Nissan",2018);
        Car car4 = new Car("gt3rs" , "Porsche",2023);
        car1.display();
        car2.display();
        car3.display();
        car4.display();
    }
}
