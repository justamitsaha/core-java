package b.Annotations;

@interface Injured {
	   String veterinarian() default "unassigned";  //optional
	   String value() default "foot"; //optional
	   int age() default 1;
}

@Injured("Broken Tail")
public class D_AnnotationsShortHandRules {}
//An annotation must adhere to the following rules to be used without a name:
// 1>The annotation declaration must contain an element named value(), which may be optional or required.
//2>The annotation declaration must not contain any other elements that are required.
//3> The annotation usage must not provide values for any other elements.


@interface Music { String[] genres();}
//Annotations support a shorthand notation for providing an array that contains a single element. If we want to provide only one value to the array, we have a choice of two ways to write the annotation
class Giraffe {
	   @Music(genres={"Rock and roll"}) String mostDisliked;
	   @Music(genres="Classical") String favorite;
}

//Combining both rules
@interface Rhythm {
    String[] value();
 }

class Capybara {
    @Rhythm(value={"Swing"}) String favorite;
    @Rhythm(value="R&B") String secondFavorite;
    @Rhythm({"Classical"}) String mostDisliked;
    @Rhythm("Country") String lastDisliked;
 }