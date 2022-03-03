import java.util.ArrayList;;

public class A_Final {
    public static void main(String[] args) {
        final int giraffe = 5;
        final long lemur;
        if (giraffe > 0)
            lemur = 5;
        else
            lemur = 10;
        System.out.println(giraffe + " " + lemur);

        final Animal an = new Animal();
        an.legs = 6;
        an.legs = 4;
        Animal an1 = new Animal();
        //an = an1;

        final Integer i = 7;
        //i = 7;
        final String s = "yo";
        //s = "dd";
    }
}

class Animal {
    int legs;
}

// Marking a variable final means the value cannot be changed after it is assigned.
// Final variables referencing Objects can chnage the member variable of the Object. since the final variable holdes the memory location,the final variable can't point to another object as in that case the momory location it points to is changing.
// Won't be applicable for Object of classes like Integer, Bollean, String etc. as it points to primitive not reference of Object
