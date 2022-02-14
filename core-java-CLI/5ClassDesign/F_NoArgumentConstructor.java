public class F_NoArgumentConstructor {

}

class Mammal {
    public Mammal(int age) {
    }
}

// public class Elephant extends Mammal { } // DOES NOT COMPILE
// Since Elephant does not define any constructors, the Java compiler will attempt to insert a default no-argument constructor. As a second compile-time enhancement, it will also auto-insert a call to super() as the first line of the default no-argument constructor

// public class Elephant extends Mammal {
//     public Elephant() {
//         super(); // DOES NOT COMPILE
//     }
// }


public class Elephant extends Mammal {
    public Elephant() {
       super(10);
    }
 }