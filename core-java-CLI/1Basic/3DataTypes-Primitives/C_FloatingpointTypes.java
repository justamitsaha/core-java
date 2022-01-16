public class C_FloatingpointTypes {
    public static void main(String args[]){
        //The type float specifies a single-precision value that uses 32 bits of storage. Single precision is faster on some processors and takes half as much space as double precision, but will become imprecise when the values are either very large or very small
        
        //Float requires f to be mentioned or F
        float f = 32.890880f;
        float a = 5;                //This will compile
        //float x = 32.0;         //But this one not
        float b = 10/3;
        float c = 10/3F;
        System.out.println("Float example");
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //Double precision, as denoted by the double keyword, uses 64 bits to store a value. Double precision is actually faster than single precision on some modern processors that have been optimized for high-speed mathematical calculations. All transcendental math functions, such as sin( ), cos( ), and sqrt( ), return double values. When you need to maintain accuracy over many iterative calculations, or are manipulating large-valued numbers, double is the best choice.

        //Floating-point literals in Java default to double precision. You can also explicitly specify a double literal by appending a D or d. Doing so is, of course, redundant
        System.out.println("Double example");
        double e = 10/3d;
        double g = 32.3224234;
        System.out.println(e);
        System.out.println(g);

        //However for expressions you need to mention d other wise the calculations will be off
        double d = 10/3;
        System.out.println(d);
    }
}