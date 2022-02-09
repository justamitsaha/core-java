
public class A_AATest {
    public static void main(String[] args) {}

}

class StaticvsInstance {
	   public void instanceMethod1(StaticvsInstance g) {
		   StaticvsInstance.staticMethod1(g);
		   StaticvsInstance.staticMethod2();
		   g.instanceMethod1(g);
		  g.instanceMethod2();
	   }
	   public void instanceMethod2() {
		   StaticvsInstance sg = new  StaticvsInstance();
		   StaticvsInstance.staticMethod1(sg);
		   StaticvsInstance.staticMethod2();
		   sg.instanceMethod1(sg);
	   };
	   public static void staticMethod1(StaticvsInstance sg) {
		   staticMethod2();
		   sg.instanceMethod2();
		   sg.instanceMethod1(sg);
	   }
	   public static void staticMethod2() {
		   StaticvsInstance sg = new  StaticvsInstance();
		   staticMethod1(sg);
		   sg.instanceMethod2();
		   sg.instanceMethod1(sg);
	   }
	}
