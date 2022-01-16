public class A_ArithmaticOperators{
    public static void main (String args[]){
        //modulus operator
        int x = 42;
        double y = 46.56;
        System.out.println(y%x);

        //Compound Assignment Operators
        var a =4;
        var b =2;
        //value is changed and assigned to var a at the same time
        System.out.println(a+= 4);
        System.out.println(a-= 2);
        System.out.println(a*=2);
        System.out.println(a/=b);
        System.out.println(a%=2);

        //increment and decrement Compond assignment operator
        var c =99;
        System.out.println(c++);  //Assignment first then increment
        System.out.println(++c);  //Increment first then assignment
        System.out.println(c--);
        System.out.println(--c);

        var d = 200;
        var e = d++;
        System.out.println("e:"+e +" d "+d);
    }
}