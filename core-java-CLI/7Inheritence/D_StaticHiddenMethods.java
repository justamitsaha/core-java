class Bear {
	public static void sneeze() { System.out.println("Bear is sneezing");}
	public void hibernate() { System.out.println("Bear is hibernating");}
	public static void laugh() { System.out.println("Bear is laughing");}

	public static void main(String[] args) {}
}

public class D_StaticHiddenMethods extends Bear {	
	//public void sneeze() { }
	//Not static
	//public static void hibernate() { }
	//protected static void laugh() { }

}
//Key : When a parent class has a static method and child class has a static method with same name and signature then its a hidded method not overriding
//When the parent method is static then child also must be static other wise it will not compile.
//If the child has more restrictive access modifier then also it will not compile