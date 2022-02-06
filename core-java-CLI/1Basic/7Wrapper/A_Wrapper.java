//Each primitive type has a wrapper class, which is an object type that corresponds to the primitive
// Like string the wrapper classes are immutable and take advantage of some caching as well.

public class A_Wrapper{
    public static void main(String args[]){
        Boolean b =	Boolean.valueOf(true);
        Byte b1 =	Byte.valueOf((byte) 1);
        Short sh =	Short.valueOf((short) 1);
        Integer in =	Integer.valueOf(1);
        Long ln =	Long.valueOf(1);
        Float fl =	Float.valueOf((float) 1.0);
        Double du =	Double.valueOf(1.0);
        Character ch =	Character.valueOf('c');

        //parsing
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        //One advantage of a wrapper class over a primitive is that because it’s an object, it can be used to store a null value. While null values aren’t particularly useful for numeric calculations, they are quite useful in data-based services

        //primitives default to a value where as Wrapper class defaults to null

          int numFish = 4;
  String fishType = "tuna";
  String anotherFish = numFish + 1;
  System.out.println(anotherFish + " " + fishType);
  System.out.println(numFish + " " + 1);
    }
}