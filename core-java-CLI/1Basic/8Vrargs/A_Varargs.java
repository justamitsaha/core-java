//with Var args we have an option of sending dynamic number of variables in a method, we can also choose not to send the vararg param

public class A_Varargs {

    public void walk1(int... nums) {
    }

    public void walk2(int start, int... nums) {
    }
    // public void walk3(int... nums, int start) {} // DOES NOT COMPILE
    // public void walk4(int... start, int... nums) {} // DOES NOT COMPILE
    
    public static void main(String[] args) {
        walk(1); // 0
        walk(1, 2); // 1
        walk(1, 2, 3); // 2
        walk(1, new int[] { 4, 5 }); // 2

        //test(1) this will not compile since test doesn't have var args so signature must match
    }

    //A varargs parameter must be the last element in a method’s parameter list. You are allowed to have only one varargs parameter per method.
    public static void walk(int start, int... nums) {
    	//although nums is not passed still doesn't throw null pointer since behind the scene an array with zero element is passed
        System.out.println(nums.length);
    }

    public static void test(int a, int b){}
}
