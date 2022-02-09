import java.util.ArrayList;
;
public class A_Final {
    private static final ArrayList<String> values = new ArrayList<>();
    private static final int NUM_BUCKETS = 45;
    //Below will not compile because its value is not initialized
    //private static final int HOURS_IN_DAY;
    public static void main(String[] args) {
       values.add("changed");
       //NUM_BUCKETS = 5;  // DOES NOT COMPILE
       System.out.println(NUM_BUCKETS);
    }
}
