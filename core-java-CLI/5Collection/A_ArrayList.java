
import java.util.ArrayList;
import java.util.List;

//An array has one glaring shortcoming: You have to know how many elements will be in the array when you create it, and then you are stuck with that choice. Just like a StringBuilder, an ArrayList can change capacity at runtime as needed
public class A_ArrayList{
    public static void main (String[] args){
        //Pre java 5 way of declaring Array list
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        //Java 5 onwards
        ArrayList<String> list4 = new ArrayList<String>();
        //Java 7 onwards
        ArrayList<String> list5 = new ArrayList<>();

        var strings = new ArrayList<String>();
        //The type of the var is ArrayList<Object>. Since there isn’t a type specified for the generic, Java has to assume the ultimate superclass
        var list = new ArrayList<>();
        list.add("Hello");
        //Since there isn’t a type in the diamond operator, Java has to assume the most generic option it can. Therefore, it picks Object, the ultimate superclass. Adding a String to the list is fine. You can add any subclass of Object. However, in the loop, we need to use the Object type rather than String.
        //for (String s: list) { }
        List<String> list6 = new ArrayList<>();

        //add- insert a new value in the ArrayList
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        safer.add(0,"crow");   //Crow will get added to 0 and sprrow and any other element will be shifted 
        //safer.add(0,"crow"); run time exception index out of bound
        //safer.add(Boolean.TRUE);    DOES NOT COMPILE

        //remove 
        List<String> birds = new ArrayList<>();
        birds.add("hawk");     // [hawk]
        birds.add("hawk");     // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk"));     // prints true
        System.out.println(birds.remove(0));          // prints hawk

        //set() method changes one of the elements of the ArrayList without changing the size. 
        birds.set(1, "robin");

        //isEmpty() and size()
        System.out.println(birds.isEmpty());     // false
        System.out.println(birds.size());        // 2

        //contains() method checks whether a certain value is in the ArrayList
        //clear() method provides an easy way to discard all elements of the ArrayList
        //equals() , ArrayList has a custom implementation of equals(),so you can compare two lists to see whether they contain the same elements in the same order.



    }
}
