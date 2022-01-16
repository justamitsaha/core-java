//If the two types are compatible, then Java will perform the conversion automatically. For example, it is always possible to assign an int value to a long variable. However, not all types are compatible, and thus, not all type conversions are implicitly allowed. For instance, there is no automatic conversion defined from double to byte
//When one type of data is assigned to another type of variable, an automatic type conversion will take place if the following two conditions are met:
//•  The two types are compatible.
//•  The destination type is larger than the source type
//When these two conditions are met, a widening conversion takes place. For example, the int type is always large enough to hold all valid byte values.
//To create a conversion between two incompatible types, you must use a cast. A cast is simply an explicit type conversion.For example, what if you want to assign an int value to a byte variable?
public class E_CastingTypes{
    public static void main(String Args[]){

        {
            byte b;
            int i = 257;
            double d = 323.14;

            //When the value 257 is cast into a byte variable, the result is the remainder of the division of 257 by 256 (the range of a byte), which is 1 in this case 
            b= (byte)i;
            System.out.println(b);


            //When the d is converted to an int, its fractional component is lost.
            i = (int)d;
            System.out.println(i);

            //When d is converted to a byte, its fractional component is lost, and the value is reduced modulo 256, which in this case is 67
            b= (byte)d;
            System.out.println(b);

            //The result of the intermediate term a * b can easily exceeds the range of either of its byte operands. To handle this kind of problem, Java automatically promotes each byte, short, or char operand to int when evaluating an expression
            //b = b *2; //Will give error Error! Cannot assign an int to a byte!

            b = 42;
            char c = 'a';
            short s = 1024;
            i = 5000;
            float f = 5.76f;
            d = .1234;
            double result = (f*b) + (i/c) - (d*s);
            System.out.println("(f*b) "+(f*b) + "(i/c) "+(i/c) + "(d*s) " +(d*s));
            System.out.println(result);

            // In the first subexpression, f * b, b is promoted to a float and the result of the subexpression is float. Next, in the subexpression i/c, c is promoted to int, and the result is of type int. Then, in d * s, the value of s is promoted to double, and the type of the subexpression is double. Finally, these three intermediate values, float, int, and double, are considered. The outcome of float plus an int is a float. Then the resultant float minus the last double is promoted to double, which is the type for the final result of the expression.
        }        
    }
}