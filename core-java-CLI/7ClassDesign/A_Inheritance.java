
//nheritance is the process by which a subclass automatically includes any public or protected members of the class, including primitives, objects, or methods, defined in the parent class.

//Can extend only one class at a time but that class can extend others
public class A_Inheritance extends Alu {
    public static void main(String[] args) {
        A_Inheritance obj = new A_Inheritance();
        System.out.println(obj.givesEnergy);
        obj.setIsLiving("Yes");
        System.out.println(obj.getIsLiving());
    }
}

class Alu extends Plant {

}

class Plant {
    //private members can't be accessesd
    private String isLiving = "NO";
    //protected can be extended if in same package or subclass
    protected String getIsLiving() {
        return this.isLiving;
    }
    //Default also can be acessed
    void setIsLiving(String isLiving) {
        this.isLiving = isLiving;
    }
    public Boolean givesEnergy = Boolean.valueOf("true");
}
