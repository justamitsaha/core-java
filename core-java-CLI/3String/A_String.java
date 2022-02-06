public class A_Sring{
    public static void main (String[] args){
        String string = "animals";
        System.out.println(string.length());

        System.out.println(string.charAt(0));  // a
        System.out.println(string.charAt(6));  // s
        //System.out.println(string.charAt(7));  // throws exception

        System.out.println(string.indexOf('a'));         // 0
        System.out.println(string.indexOf("al"));        // 4
        System.out.println(string.indexOf('a', 4));      // 4
        System.out.println(string.indexOf("al", 5));     // -1

        System.out.println(string.substring(3));                   // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4));                // m
        System.out.println(string.substring(3, 7));                // mals 

        System.out.println(string.toUpperCase());  // ANIMALS
        System.out.println("Abc123".toLowerCase());  // abc123

        System.out.println("abc".equals("ABC"));  // false
        System.out.println("ABC".equals("ABC"));  // true
        System.out.println("abc".equalsIgnoreCase("ABC"));  // true

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false


        System.out.println("\t   a b c\n".strip());        // a b c
        System.out.println("\t   a b c\n".trim());         // a b c
        String text = " abc\t ";
        System.out.println(text.trim());         // abc
        System.out.println(text.strip());        // abc
        System.out.println(text.stripLeading()); // "abc "
        System.out.println(text.stripTrailing());// " abc"
    }
}