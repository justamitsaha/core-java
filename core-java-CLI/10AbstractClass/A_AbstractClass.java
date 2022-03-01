public class A_AbstractClass extends Bird{
    public String getName() { return "Stork!"; }
    public static void main(String[] args) {
        new A_AbstractClass().printName();
        //Bird brd = new Bird();
        Bird brd = new A_AbstractClass();
    }
}

abstract class Bird {
    public abstract String getName();
    public void printName() {
       System.out.print(getName());
    }
 }

 abstract class Llama {
    public void chew() {}
 }

//  class Egret {  // DOES NOT COMPILE
//     public abstract void peck();
//  }

 //A class extending Abstract class must implement the abstract methods otherwiese won't compile
 //Abstract classs can't be instantiated but its reference can be
 //An abstract class may include nonabstract methods, 
 //For abstract class it is not actually required to include any abstract methods.
 //But an abstract method can only be defined in an abstract class