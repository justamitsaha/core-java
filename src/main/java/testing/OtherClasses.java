package testing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class OtherClasses {
}

final class Box implements Cloneable {
    int height, breath, length;
    String colour;

    Box(int height, int breath, int length, String colour) {
        this.height = height;
        this.breath = breath;
        this.length = length;
        this.colour = colour;
    }
}


interface Animal {
    int heart =1;   //its static public final even if not mentioned

    void walk();  //abstract key word optional

    default void hunt(){  //Implementing class can choose to override
        jump();
        System.out.println("hunting");
    }

    private void jump(){
        eat();
        System.out.println("jumping");
    }

    static void eat(){
        System.out.println();
    }
}





