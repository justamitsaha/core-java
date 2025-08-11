package testing;

public class Test2{
    {
        System.out.println("This is non static block"); //Will execute before Main or anything.
    }
    static {
        System.out.println("This is static block"); //Will execute before Main or anything.
    }

    public Test2(){
        System.out.println("This is constructor");
    }
}