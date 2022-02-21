public class A_InterfaceBasic extends Primate implements HasTail {
    public boolean isTailStriped() { return false;}
    public int age = 10;

    public static void main(String[] args) {
        A_InterfaceBasic obj = new A_InterfaceBasic();
        System.out.println(obj.age);

        HasTail hasTail = obj;
        System.out.println(hasTail.isTailStriped());

        Primate primate = obj;
        System.out.println(primate.hasHair());
    }
}

class Primate {
    public boolean hasHair() { return true;}
}

interface HasTail {
    public abstract boolean isTailStriped();
}

//Polymorphism enables an instance of A_InterfaceBasic to be reassigned or passed to a method using one of its supertypes, such as Primate or HasTail