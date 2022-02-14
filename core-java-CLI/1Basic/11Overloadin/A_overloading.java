import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class A_overloading {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() {return false;}
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}

    public void fly1(int numMiles) {}
    //public int fly1(int numMiles) {}     // DOES NOT COMPILE return type can't be only change parameters need to change

    public void fly2(int numMiles) {}
    //public static void fly2(int numMiles) {}     // DOES NOT COMPILE

    public void fly3(int numMiles) {}
    // public static int fly3(int numMiles) {} // No change in parameter

    public void fly(int[] lengths) {}
    //public void fly(int... lengths) {}     // Java treats varargs as if they were an array. This means that the method signature is the same for both methods

    public void fly7(int numMiles) {System.out.println("Primitive");}
    public void fly7(Integer numMiles) {System.out.println("Int Obj");}

    public void fly8(Object numMiles) {System.out.println("Obj");}
    public void fly8(String numMiles) {System.out.println("String");}

    public static void print(Iterable i) {System.out.print("I");}
    public static void print(CharSequence c) {System.out.print("C");}
    public static void print(Object o) {System.out.print("O");}

    public void walk(List<String> strings) {}
    //public void walk(List<Integer> integers) {}    // DOES NOT COMPILE becaus at compile time as per Generics it will be concidered as below
    //public void walk(List strings) {};
    //public void walk(List integers) {}

    //BELOW WILL COMPILE FINE
    public static void walk(int[] ints) {}
    public static void walk(Integer[] integers) {}

    public static void main(String[] args) {
        A_overloading obj = new A_overloading();

        Integer i =56;
        obj.fly7(56);
        obj.fly7(i);

        obj.fly8("SSSS");
        obj.fly8(12);

        print("abc");
        print(new ArrayList<>());           //Iterable is an interface for classes you can iterate over
        print(LocalDate.of(2019, Month.JULY, 4));
    }
}
