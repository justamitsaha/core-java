public class E_ParentWithSuper {
    public static void main(String[] args) {
        
    }
}

class Animal {
    int legs;
    Animal() {};
    Animal (int legs){};
}

class Gorilla extends Animal{
    Gorilla(){super();}
    Gorilla(int i) {super(i);}
    // Gorilla(int i) {
    //     System.out.println("Yo");
    //     super(i);
    // }
}