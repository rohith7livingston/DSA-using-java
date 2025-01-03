import java.util.*;
import java.util.function.Predicate;
import java.io.*;

class arrayList5
{
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("python");
        languages.add("java");
        languages.add("c++");
        languages.add("c#");
        System.out.println("The list is :: "+languages.isEmpty());//empty
        System.out.println("The intial list is :: "+languages);
        languages.remove("c++");//by element
        languages.remove(2);//by index
        System.out.println("final List  :: "+languages);
        ArrayList<String> Script = new ArrayList<String>();
        Script.add("javScript");
        Script.add("react");
        Script.add("react native");
        languages.addAll(Script);//adding a collection
        System.out.println("The  list is :: "+languages);
        languages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s)
            {
                return s.startsWith("r");
            }
        });
        System.out.println("The  list is :: "+languages);
        languages.removeAll(Script);//remove all removing the collection elements        System.out.println("The  list is :: "+languages);
        System.out.println("The  list is :: "+languages);
        languages.clear();
        System.out.println("The list is :: "+languages.isEmpty());


    }
}