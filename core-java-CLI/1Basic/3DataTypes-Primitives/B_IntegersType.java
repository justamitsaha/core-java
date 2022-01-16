//Java defines four integer types: byte, short, int, and long
public class B_IntegersType{
    public static void main (String args[]){
        //The smallest integer type is byte, byte are especially useful when you’re working with a stream of data from a network or file. They are also useful when you’re working with raw binary data that may not be directly compatible with Java’s other built-in types.
        //Although you might think that using a byte or short would be more efficient than using an int in situations in which the larger range of an int is not needed, this may not be the case. The reason is that when byte and short values are used in an expression, they are promoted to int when the expression is evaluated
        byte b = -49;
        System.out.println(b);
        //OX denoting hex value
        int hex = 0x1a; 
        System.out.println(hex);
        //0b denoting binary             
        int binary = 0b11010;                
        System.out.println(binary);
        //Underscore can be added for convinience of reading
        int c = 100_000_000;
        System.out.println(c);
        //When the range is outside int without the l it will not compile as Java will try to evaluate as int. to specify a long literal, you will need to explicitly tell the compiler that the literal value is of type long. You do this by appending an upper- or lowercase L to the literal.
        long l = 672329836982683L;
        System.out.println(l);
        // char j = '+';
        // int k = (int)j;
        // System.out.println("k: " + k + " ch: " + Character.getNumericValue(j));
        // int l= 'a';
        // System.out.println(l);
    }
}