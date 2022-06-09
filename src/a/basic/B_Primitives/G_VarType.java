package a.basic.B_Primitives;
//Beginning with JDK 10, it is now possible to let the compiler infer the type of a local variable based on the type of its initializer, thus avoiding the need to explicitly specify the type.
//To use local variable type inference, the variable must be declared with var as the type name and it must include an initializer.

public class G_VarType{
    public static void main (String args[]){
        var avg = 10.0;
        System.out.println(avg);
        var k = -avg;
        System.out.println(k);
        var g =  k++;
        System.out.println(g);
        var e = avg++;
        System.out.println(e);
    }
}

class x {
	//var n = 20;	//Won't compile as class level variables type must be implicit and not implied
	
	//void test(var x){}  //Method parameters are also implicit
	
	//var x = [1,2,3];
	
	@SuppressWarnings("unused")
	void test() {
		// var x;
		var x = 200;
		var y = 2L;
		//x = 3_000_000_000; //won't compile as its a long 
		y = 3L;
		y = 2;
		
		//var i = {1,2,3}; // here the type on right side is inferred so won't work
		var i = new int[] {1,2,3};
		//var [] j = new int[] {1,2,3};
		var s,u =7;
	}
}