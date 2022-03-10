package b.Annotations;

public class B_Annotations {
}

@interface Material {}

//Like abstract interface methods, annotation elements are implicitly abstract and public, whether you declare them that way or not
@interface Fluffy {
	int cuteness();
	public abstract int softness() default 11;
	//protected Material material(); // DOES NOT COMPILE
	//private String friendly(); // The elements material() and friendly() do not compile because the access modifier conflicts with the elements being implicitly public
	//final boolean isBunny(); // The element isBunny() does not compile because, like abstract methods, it cannot be marked final
	int MIN_VOLTAGE = 2; 
	//Annotations can include constant variables that can be accessed by other classes without actually creating the annotation 
	// just like interface variables, annotation variables are implicitly public, static, and final. These constant variables are not considered elements, though.
	
	public @interface Swimmer {
		   int armLength = 10;
		   String stroke();
		   String name();
		   String favoriteStroke() default "Backstroke";
	}
	
	//@Swimmer class Amphibian {} //missing the required elements stroke() and name()
	// @Swimmer(favoriteStroke="Breaststroke", name="Sally") class Tadpole {} // must define the attribute stroke
	@Swimmer(stroke="FrogKick", name="Kermit") class Frog {}
	//@Swimmer(stroke="Butterfly", name="Kip", armLength=1) class Reptile {} //armLength is final 
	//@Swimmer(stroke="", name="", favoriteStroke=new String("")) class Snake {} //For some reason this doesn't compile



	
}
