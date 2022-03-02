class Hippo { final void chew() {} }
public class C_MethodsClass extends Hippo {
    // void chew() {} ;
}
abstract class ZooKeeper {
   // public abstract final void openZoo(); // DOES NOT COMPILE
}

final class Reptile {}
//class Snake extends Reptile {} // DOES NOT COMPILE

// This essentially prevents any polymorphic behavior on the method call and ensures that a specific version of the method is always called.
// A method can't be both absract and final
//A final class is one that cannot be extended.
