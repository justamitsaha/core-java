public class C_Consuctors {
    public static void main(String[] args) {
        AClass obj = new AClass(5);
        // Since it is marked as private below constructor initialization will not work
        //AClass obj2 = new AClass();
    }
}

class AClass {
    public AClass (int i){};
    private AClass() {};
}