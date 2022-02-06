//An overridden method in a subclass is allowed to declare fewer exceptions than the superclass or interface. This is legal because callers are already handling them.
 
public class FOverrideException {
 
}
 
class CanNotHopException extends Exception {
}
 
class Hopper {
    public void hop() {
    }
}
 
class Bunny extends Hopper {
//  Doesn't compile since When a class overrides a method from a superclass or implements a method from an interface, it’s not allowed to add new checked exceptions to the method signature
//  public void hop() throws CanNotHopException {
//  }
}
 
class CanJumpException extends RuntimeException {
}
 
class Jump {
    public void jump() {
    }
}
 
class Horse extends Jump {
    //This will compile since the exception is Runtime exception
    public void jump() throws CanJumpException {
    }
}
