import java.util.*;
import java.io.*;
class Marks
{
    int id;
    float javamarks,cmarks,cpmarks;
    void setMarks()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the student id");
        id=s.nextInt();
        System.out.println("Enter your obtained marks in java");
        javamarks=s.nextFloat();
        System.out.println("Enter your obtained marks in c");
        cmarks=s.nextFloat();
        System.out.println("Enter your obtained marks in cpp");
        cpmarks=s.nextFloat();
    }
    void displayMarks()
    {
        System.out.println("The student id is :: "+id);
        System.out.println("javamarks="+javamarks);
        System.out.println("Cmarks="+cmarks);
        System.out.println("cppmarks="+cmarks);
    }

}
class Result extends Marks
{
    void compute()
    {
        float avg ;
        avg=(javamarks+cmarks+cpmarks)/3;
        System.out.println("The avg marks :: "+avg);
    }
    void showResult()
    {
        compute();
        displayMarks();
    }
}
class Single
{
    public static void main(String args[])throws Exception
    {
        Result r = new Result();
        r.setMarks();
        r.showResult();
    }
}