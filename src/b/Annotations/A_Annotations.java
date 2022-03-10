package b.Annotations;

@MyAnnotation
public class A_Annotations {
}

@interface MyAnnotation{} 
//An annotation that has no method, is called marker annotation.

@interface Height{
	int height();
}

enum Gender {MALE, FEMALE}
//Return type allowed for methods are primitives, String, ENUM, 1d array, 
@interface Classification{
	int legscount();
	String canRun();
	Height getheight() default @Height(height = 5);
	String[] capabilities();
	Gender getGender();
}

@Classification(canRun = "", capabilities = { "" }, getGender = Gender.FEMALE, legscount = 2)
class Human{}