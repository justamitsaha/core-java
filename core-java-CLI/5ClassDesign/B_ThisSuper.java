public class B_ThisSuper extends SuperClass {
    String var = "1";
    String var3 = "2";

    public static void main(String[] args) {
        B_ThisSuper obj = new B_ThisSuper();
        obj.print();
    }

    public void print() {
        System.out.println(super.var);
        System.out.println(this.var);
        System.out.println(this.var2);
        System.out.println(super.var2);
        // System.out.println(super.var3); won't compile as parent don't have access to var3
        //System.out.println(super.var3);
    }

    // This will not change Object variable
    public void setVar(String var) {
        var = var;
    }
}

class SuperClass {
    String var = "3";
    String var2 = "4";
}
