public class B_StaticInitialization {
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR =3600;
    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
        //Since the below is final and value already assisgned itcan't be changed
        //NUM_SECONDS_PER_HOUR = 3600;
    }
}