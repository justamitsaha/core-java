public class B_FinalStatic {
    // private static final int HOURS_IN_DAY;
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();
    public static void main(String[] args) {
        // NUM_BUCKETS = 5; // DOES NOT COMPILE
        System.out.println(NUM_BUCKETS);
        values.add("changed");
    }
}

// Static final has to be initialized when declared
