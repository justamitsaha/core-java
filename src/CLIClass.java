
public class CLIClass {

	public static void main(String[] args) {
		System.out.println("Main method sysout "+args[0]);
		System.out.println("Main method sysout "+args[1]);

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

class Dogs extends Mammal {
    public Dogs(){
    	super(10);
    }
}
