package g.ploymorphism;

interface Test {
	public static final int counter = 0; 
	String name = "";
	
	int test(int i) ;
	default int test1(int i) { System.out.println(i);return i;} 
}
public class A_Interface implements Test {
		public static void main(String[] args) {
			//name = "Amit";
			System.out.println(name);
			A_Interface a = new A_Interface();
			a.test1(0);
		}

		@Override
		public int test(int i) {
			return 0;
		}
}

//member variable of an interface is always public static final
//even if we don't specify public static final it will still have those properties
//Since its final it has to be initialized 

//Methods in an interface can only be abstract or default
//You can override default method also to provide more specific implementation for the method. 


