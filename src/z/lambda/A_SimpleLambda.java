package z.lambda;

public class A_SimpleLambda {
	public static void main(String[] args) {
		// Normal implementation we create an interface --> implement abstract method --> instantiate the implementation -->call it 
		Shout shoutImpl = new ShoutImpl();
		A_SimpleLambda sl = new A_SimpleLambda();
		sl.shoutMehod(shoutImpl);

		// Inner class implementation
		ShoutImpl shoutInnerClass = new ShoutImpl() {
			public void shout() { System.out.println("I am from inner class implementation"); }
		};
		shoutInnerClass.shout();

		// Lambda implementation
		Shout sh = () -> System.out.println("I am from Lambda");
		sh.shout(); // If we don't call the method lambda expression won't be called
	}

	public void shoutMehod(Shout obj) { obj.shout();}
}

@FunctionalInterface
interface Shout { void shout(); }

class ShoutImpl implements Shout {
	@Override
	public void shout() { System.out.println("I am from interface implementation");	}
}

//With Lambda we create in line implementation of abstract method of an interface
//The interface must have only one abstract method