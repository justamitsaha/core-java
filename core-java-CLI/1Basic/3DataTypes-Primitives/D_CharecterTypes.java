//the data type used to store characters is char. A key point to understand is that Java uses Unicode to represent characters. Unicode defines a fully international character set that can represent all of the characters found in all human languages.
//So Basically char stores the number corresponding to the ASCII values hence it ha simmilarities with short
//The standard set of characters known as ASCII still ranges from 0 to 127 as always, and the extended 8-bit character set, ISO-Latin-1, ranges from 0 to 255. Since Java is designed to allow programs to be written for worldwide use, it makes sense that it would use Unicode to represent characters.

public class D_CharecterTypes{
    public static void main (String Args []){

        //Notice that ch1 is assigned the value 88, which is the ASCII (and Unicode) value that corresponds to the letter X. As mentioned, the ASCII character set occupies the first 127 values in the Unicode character set
        char ch1 = 88;
        char ch2 = '8';
        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 2689;
        System.out.println(ch3);

        //Although char is designed to hold Unicode characters, it can also be used as an integer type on which you can perform arithmetic operations
        char ch4 = 101;
        System.out.println(ch4);
        ch4++;
        System.out.println(ch4);

        char j = '+';
        int k = (int)j;
        System.out.println("k: " + k + " ch: " + Character.getNumericValue(j));

        j = '7';
        k = (int)j;
        System.out.println("k: " + k + " ch: " + Character.getNumericValue(j));
    }
}