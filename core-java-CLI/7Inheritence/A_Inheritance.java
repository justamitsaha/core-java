//Inheritance is the process by which a subclass automatically includes any public or protected members of the class, including primitives, objects, or methods, defined in the parent class.

public class A_InheritenceBasic extends Alu {
    public static void main(String[] args) {
        A_Inheritance obj = new A_Inheritance();
        System.out.println(obj.givesEnergy);
        //Parent object variables accessed since we have extended the parent object 

        obj.setIsLiving("Yes");
        System.out.println(obj.getIsLiving());
        //Private variables can't be accessed directly but can be accessed if exposed via a public method

    }
}

class Alu extends Plant {

}

class Plant {
    public Boolean givesEnergy = Boolean.valueOf("true");
    private String isLiving = "NO";

    protected String getIsLiving() {
        return this.isLiving;
    }
    //protected can be extended if in same package or subclass

    void setIsLiving(String isLiving) {
        this.isLiving = isLiving;
    }
    //Default also can be acessed
}
//Key :- One class can extent one parent at a time but that parent can extend other classes
