//When there is no

public class F_NoArgumentConstructor {
    public static void main(String[] args) {
        
    }
}

class Mammal {
    public Mammal(int age) {
    }
}

// public class Elephant extends Mammal { } // DOES NOT COMPILE
// When no constructor is defined, then java compiler by default inserts a no argument constructor. And by default a no argument constructor will insert a super call leading to below code which will fail

// public class Elephant extends Mammal {
//     public Elephant() {
//         super(); // DOES NOT COMPILE
//     }
// }


class Elephant extends Mammal {
    public Elephant() {
       super(10);
    }
}
//with go argument Constructoer present there is no Such issue
class Plant {
    Plant(){}
}

class Oak extends Plant {
    Oak() {}
}