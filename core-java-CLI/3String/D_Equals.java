public class D_Equals {
    public static void main(String[] args){

        //SB doesn't have a String pool also it doesn't ovverrides equals method
        StringBuilder one = new StringBuilder("animal");
        StringBuilder two = new StringBuilder("animal");
        StringBuilder three = one;
        System.out.println(one == two);  //Since == compares memory reference this is false
        System.out.println(one.equals(two)); // Since .equals() is not overridden for SB this is simmilar to doing ==
        System.out.println(one.equals(three)); // Since both point to same obj this is true
        one.append("animal");
        System.out.println(three);  // Since both one and three point to same obj and no pool for SB hence value of three changes
        
        //String has a string pool and overrides equals method to compare chars
        System.out.println("<-------------------->");
        String w= new String ("animal");
        String x = "animal";
        String y = "animal";
        String z = x;

        System.out.println(x==w);  // Since w uses new key word it doesn't goes to SP hence the referenc is not same so its false
        System.out.println(x.equals(w)); //Since String overrides equals hence it evaluates the two string which comes as same

        System.out.println("<-------------------->");
        System.out.println(x == y); //Due to SP it will come as true
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        x = "man";
        System.out.println(z);  // Due to SP and immutability value of z will not change


        System.out.println("<-------------------->");
        String e = "Hello World";
        String f = "Hello World";
        String g = " Hello World".trim();
        String h = "Hello World".trim();
        String i = " Hello World";
        System.out.println(e == f);    // true
        System.out.println(e == f.toString());  //true
        System.out.println(e == g);  //false  e is compile time g is runtime
        System.out.println(e == h); // true  since there is no change in value of h hence it is compile time
        System.out.println(e == i.trim()); //false

        String name = "Hello World";
        String name2 = new String("Hello World").intern();
        System.out.println(name == name2);     // true since intern method forces to use String Pool

        System.out.println("<-------------------->");
        String uno = "rat1"; // this is compile time
		String first = "rat" + 1; // this is compile time
		String second = "r" + "a" + "t" + "1"; // this is compile time
		String third = "r" + "a" + "t" + new String("1");
		Integer num = 1;
		String fourth = "rat" + num.toString();
		String fifth = "rat" + num.toString();
		System.out.println(uno == first);
		System.out.println(first == second);
		System.out.println(first == second.intern());
		System.out.println(first == third);
		System.out.println(first == third.intern());
		System.out.println(first == fourth);
		System.out.println(fourth == fifth);


    }
}