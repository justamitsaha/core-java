package testing;


public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Amit";
        System.out.println(p);     //Person{name='Amit'}
        upgrade(p);
        System.out.println(p);     //Person{name='Sachin'}  value changing
    }

    static void upgrade(Person per) {
        per.name = "Sachin";
    }
}

class Person {
    String name;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}







