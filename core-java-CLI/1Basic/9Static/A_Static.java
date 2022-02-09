//When the static keyword is applied to a variable, method, or class, it applies to the class rather than a specific instance of the class.

public class A_Static {
    private String name = "Static class";
    private static String staticName = "hui";        
    public static void main(String args[]) {
        A_Static st = new A_Static();

        // Even tough staticName is static we can access it via an Object it won't thorw error
        st.staticName = "Wow";
        st = null;
        // evem though the Class instance is made null the Static variable doesn't loose value
        System.out.println(A_Static.staticName);

    }
}

class Gorilla {
    public static int count;
    public int total;
    public static void addGorilla() {
        count++;
    }
    public void babyGorilla() {
        count++;  // Since we are in same class we can refer to static variable directly without instead of Gorilla.count
    }
    public void announceBabies() {
        addGorilla();  
        babyGorilla();  //Instance method can call other instance methods without initializing
    }
    public static void announceBabiesToEveryone() {
        addGorilla();
        // babyGorilla(); // Static method can't make static reference to other non static method 
        //int ++;         // Static method can't make static reference to other non static variables 
    } 
    //public static double average = total / count; // DOES NOT COMPILE
}
