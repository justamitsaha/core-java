public class C_Polymorphism extends Penguin {
    public int getHeight() {
        return 8;
    }

    public static void main(String[] fish) {
        new C_Polymorphism().printInfo();
    }
}

class Penguin {
    public int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println(this.getHeight());
    }
}


// polymorphism states that when you override a method, you replace all calls to it, even those defined in the parent class. The facet of polymorphism that replaces methods via overriding is one of the most important properties in all of Java. It allows you to create complex inheritance models, with subclasses that have their own custom implementation of overridden methods. It also means the parent class does not need to be updated to use the custom or overridden method. 

//you can choose to limit polymorphic behavior by marking methods final, which prevents them from being overridden by a subclass.