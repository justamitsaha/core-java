public class Test extends Parent {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Test();
		Test t = new Test();
		
		if(p1 instanceof Test) {
			p1 = t;
			System.out.println("1");
		}else {
			p1=t;
			System.out.println((p1 instanceof Test));
		}
		
		if(p2 instanceof Test) {
			p2 = t;
			System.out.println("2");
		}
		
		if(t instanceof Parent) {
			System.out.println("3");
		}
		
		p1 =t;
	}
}

class Parent {}
