public class B_Casting extends Parent {
    int i =10;
    public static void main(String[] args) {
        B_Casting b = new B_Casting();
        Parent p = new Parent();
        if(p instanceof B_Casting){p=b;System.out.println("1");}
        p =b;
        if(p instanceof B_Casting){p=b;System.out.println("2");}

        Parent p1 = new B_Casting();
        if(p1 instanceof B_Casting){p1=b;System.out.println("3");}

        B_Casting b2 = new B_Casting();
        if(b2 instanceof Parent){
            System.out.println("4");
            Parent p2 = new B_Casting();
            b2 = (B_Casting)p2;
            //b2 = (Parent)p;
        }
    }
}

class Parent {}

//Key 
// Casting a reference from a subtype to a supertype doesn’t require an explicit cast.
// Casting a reference from a supertype to a subtype requires an explicit cast.
// The compiler disallows casts to an unrelated class.
// At runtime, an invalid cast of a reference to an unrelated type results in a ClassCastException being thrown.