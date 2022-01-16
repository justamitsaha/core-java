
//Java is a strongly typed language. First, every variable has a type, every expression has a type, and every type is strictly defined. The Java compiler checks all expressions and parameters to ensure that the types are compatible. Any type mismatches are errors that must be corrected before the compiler will finish compiling the class.
//The primitive types represent single values—not complex objects. Although Java is otherwise completely object-oriented, the primitive types are not.
//Making the primitive types into objects would have degraded performance too much.

public class A_PrimitiveDataTypes {

    public static void main(String Args[]) {
        // Java has 8 data types
        byte a = -128;                  // 1 byte or 8 bits     2 power 8               –128 to 127
        short b = -32_768;              // 16 bit               2 power 16              –32,768 to 32,767
        int c = -65_000;                // 32 bit               2 power 32              –2,147,483,648 to 2,147,483,647
        long d = 672329836982683L;      // 64 bit               2 power 64              -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808

        float e = 123.4f;
        double f = 1.234e2;

        char g= '3';                    // 16 bit simmilar to short
        
        boolean h = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}