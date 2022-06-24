package exception;

//An overridden method in a subclass is allowed to declare fewer exceptions than the superclass or interface. This is legal because callers are already handling them.
 
public class FOverrideException {
 
}
 
@SuppressWarnings("serial")
class CanNotHopException extends Exception {
}
 
class Hopper {
    public void hop() {
    }
}

//  Doesn't compile since When a class overrides a method from a superclass or implements a method from an interface, it's not allowed to add new checked exceptions to the method signature
class Bunny extends Hopper {
//  public void hop() throws CanNotHopException {
//  }
}
 
@SuppressWarnings("serial")
class CanJumpException extends RuntimeException {
}
 
class Jump {
    public void jump() {
    }
}
 
//This will compile since the exception is Runtime exception
class Horse extends Jump {
    public void jump() throws CanJumpException {
    }
}
