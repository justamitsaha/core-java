//Beginning with JDK 10, it is now possible to let the compiler infer the type of a local variable based on the type of its initializer, thus avoiding the need to explicitly specify the type.
//To use local variable type inference, the variable must be declared with var as the type name and it must include an initializer.

public class G_VarType{
    public static void main (String args[]){
        var avg = 10.0;
        System.out.println(avg);
        var k = -avg;
        System.out.println(k);
        var g =  k++;
        System.out.println(g);
        var e = avg++;
        System.out.println(e);
    }
}