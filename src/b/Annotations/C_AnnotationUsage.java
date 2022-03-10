package b.Annotations;

@FunctionalInterface
interface Speedster { 	void go(String name);}
@interface LongEars {}
@interface Soft {}
@interface Cuddly {}
@interface Speed {String velocity();}
@interface Food{boolean vegetarian();}
@interface NotNull {}
@interface Valid {}
@interface Racer {}
@interface FirstName {}
@interface NotEmpty{}
@interface Tasty{}
@interface Edible{}
@LongEars
@Soft
@Cuddly
public class C_AnnotationUsage {
	@Deprecated public C_AnnotationUsage(@NotNull Integer size) {}

	@SuppressWarnings("unused")
	@Speed(velocity = "fast")
	public void eat(@Edible String input) {
		@Food(vegetarian = true)
		String m = (@Tasty String) "carrots";

		Speedster s1 = new @Racer Speedster() {
			public void go(@FirstName @NotEmpty String name) {
				System.out.print("Start! " + name);
			}
		};

		Speedster s2 = (@Valid String n) -> System.out.print(n);
	}
}

//can be applied to any Java declaration including the following:
//Classes, interfaces, ENUMS, and modules
//Variables ( static, instance, local)
//Methods and constructors
//Method, constructor, and lambda parameters
//Cast expressions
//Other annotations
