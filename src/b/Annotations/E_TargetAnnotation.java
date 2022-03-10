package b.Annotations;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@interface ZooAttraction {
}

//@ZooAttraction class RollerCoaster {}
public class E_TargetAnnotation {
	@ZooAttraction
	String rideTrain() {
		// return (@ZooAttraction String) "Fun!";
		return (String) "Fun!";
	}

	@ZooAttraction
	E_TargetAnnotation(@ZooAttraction String description) { 	super();}

	// @ZooAttraction
	int numPassengers;
}

//ElementType_value           	Applies to
//TYPE                        				Classes, interfaces, enums, annotations
//FIELD                       				Instance and static variables, enum values
//METHOD                      			Method declarations
//PARAMETER                   		Constructor, method, and lambda parameters
//CONSTRUCTOR                 	Constructor declarations
//LOCAL_VARIABLE              	Local variables
//ANNOTATION_TYPE         Annotations
//PACKAGE                     			Packages declared in packageinfo.java
//TYPE_PARAMETER              Parameterized types, generic declarations
//TYPE_USE                    			Able to be applied anywhere there is a Java type declared or use