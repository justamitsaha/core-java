//When initiating a class which is not not main and called with new() below is the order of execution
//1 Static variables initialized
//2 Any static Blocks in order they show in code
//3 Any super constructors
//4 Any non static variables
// Any non static clock of code
// Constructor 

public class I_Initialization2  {

   public static void main(String[] args) {
      new Monkey();
   }
}

class Primate {
   public Primate() { System.out.println("Primate-");}
}

class Ape extends Primate {
   public Ape() {System.out.println("Ape1-");}
   public Ape(int fur) {System.out.println("Ape2-");}
}

class Monkey extends Ape {
   private String name = "swimmy";
   {System.out.println(name);}
   private static int COUNT = 0;
   static {System.out.println(COUNT); }
   {COUNT++;System.out.println(COUNT); }

   public Monkey() {
      // System.out.println("Constructor"); Will not compile
      super(2);
      System.out.println("Monkey Constructor");
   }

}
