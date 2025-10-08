public class HEHEH {
    
}
class GOD
{
    int a=1;
    void he()
   {
    System.out.println("I AM WITH YOU");
   }
}
class ME Extends GOD
{
   
    void he()
    {
        System.out.println("he is the strongest  :: "+a);
    }
}
class MICHALE extends ME
{
    void he()
    {
    System.out.println("HE is alone the strongest "+a);
    }
}
class main{
    public static void main(String args[])
    {
        String str;
        int i=7;
        str="Gojo saturo";
        ME m = new ME();
    }
}



abstract class Sayings
{
    abstract void depressed(String str);
    abstract void afraid(String str1);
    abstract void happy(String str2);
}
class ME extends Sayings
{
    void depressed(String str)
    {
        System.out.println(str);
    }
    void afraid(String str1)
    {
        System.out.println(str1);
    }
    void happy(String str2)
    {
        System.out.println(str2);
    }
}
class GOD
{
    public static void main(String args[])
    {
        String str,str1,str2;
        str="the lord is at your right hand";
        str1="your help comes fromt he lord who made heaven and earth";
        str2="give thanks to the lord";
        ME m = new ME();
        m.depressed(str);
        m.afraid(str1);
        m.happy(str2);
    }
}


interface GOD
{
    void strength();
    void peace();
    void joy();
}
class ME implements GOD
{
    void strength()
    {
        system.out.println("The lord gives you strength");
    } 
    void peace()
    {
        System.out.println("the god of peace  is with you");
    }
    void joy()
    {
        System.out.println("he who give you joy rejoice in it");
    }
}
class myfamily
{
        void strength()
    {
        system.out.println("The lord gives you strength");
    } 
    void peace()
    {
        System.out.println("the god of peace  is with you");
    }
    void joy()
    {
        System.out.println("he who give you joy rejoice in it");
    }
}
class Main{
    public static void main(String args[]);
    {
        Me m= new ME();
        m.strength();
        m.joy();
        m.peace();
        System.out.println("peace");
        myfamily f= new myfamily();
        f.strength();
        f.joy();
        f.peace();
    }
}



class sin extends Exception
{
    sin(String message)
    {
        super(message);
    }
}
class example
{
    void check(int a)
    {
        if(a==0)
        {
            System.out.prinlne("good")
        }
        else
        {
            throw new sin("you are forgiven by god");
        }
    }
    int a=1;
    System.out.println("if you sin press 1");
    System.out.println("if not 2");
    try
    {
        check(a);
    }
    catch(sin e)
    {
        System.out.println(e.getMessage());
    }
}






class myThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread"+Thread.currentThread().getId()+"::"+i)
        }
        try
    }
}

public class Example
{
    public static void main(String args[])
    {
        myThread thread1 = new myThread();
        myThread thread2 = new myThread();

        thread1.start();
        thread2.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("MAin count ::"+i);
        }
    }
}

public class myThread extends Thread{
    public void run()
    {
        if(Thread.currentThread().isDaemon)
        {
            System.out.println("This is daemon thread");

        }
        else 
        {
            System.out.println("it is not");
        }
    }
}
class Example{
    public static void main(String args[])
    {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        myThread t3 = new myThread();
        t.start();
        t2.start();
        t3.start();

    }
}


class TablePrinter extends Thread
{
    private int tableNumber;
    TablePrinter(int tableNumber)
    {
        this.tableNumber=tableNumber;
        for(int i=0;i<10;i++)
        {
            System.out.println(tableNumber+"x"+i+"="+(tableNumber*i));
        }
    }
}
class MAin{
    public static void main(String args[])
    {
        TablePrinter t1 = new TablePrinter();
        TablePrinter t2 = new TablePrinter();
        TablePrinter t3 = new TablePrinter();
        t1.start();
        t2.start();
        t3.start();

    }
}


