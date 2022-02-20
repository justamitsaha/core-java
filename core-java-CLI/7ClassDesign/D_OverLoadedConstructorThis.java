public class D_OverLoadedConstructorThis {
    public static void main(String[] args) {

    }
}

class Fish {
    String colour;
    int weight;

    Fish(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    Fish(int weight) {
        this(weight, "silver");
    }

    Fish(String clour) {
        System.out.println();
        // below will not compile
        // this(45, clour);
    }
}

class Animal {
    //Recurrsive contructor invocation will nnot compile
    //Animal() { this();}
    
    //Animal(){ this(5); };
    //Animal(init i){ this();}
}
