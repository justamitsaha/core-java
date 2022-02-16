//When initiating a class which is not not main and called with new() below is the order of execution
//1 Static block of Super class gets executed
//2 Static block of Child class gets executed
//3 All static blocks are executed followed by contructors of Super class
//4 All static blocks are executed followed by contructors of Child class

public class I_Initialization2  {
   public static void main(String[] args) {
      new Monkey();
   }
}
class Primate {
   public Primate() { System.out.println("Primate- constructor");}
}
class Ape extends Primate {
   public Ape() {System.out.println("Ape1- constructor");}
   public Ape(int fur) {System.out.println("Ape2- constructor");}
   static {System.out.println("This is is static code of Superclass Ape");}
   {System.out.println("This is is non static code of Superclass Ape");}
}
class Monkey extends Ape {
   private static int COUNT = 0;
   static {System.out.println("Thsi is static code of Monkey "+ ++COUNT); }

   private String name = "swimmy";
   {System.out.println("This is non static code of Monkey "+ name); }
   
   public Monkey() {
      // System.out.println("Constructor"); Will not compile
      super(2);
      System.out.println("Monkey Constructor");
   }
}

//Thumb rule Any class loading Parent must load first
//When a parent or child is loaded Static first --> When new() called non static -->Constructor code
