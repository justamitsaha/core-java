package b.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Documented;

 
@Retention(RetentionPolicy.CLASS) @interface Flier {}
@Retention(RetentionPolicy.RUNTIME) @interface Swimmer {}
@Retention(RetentionPolicy.SOURCE) @interface Swimmer2 {}

@Documented
@interface Hunter {}

@Hunter
public class F_OtherAnnotationSpecifAnnotation {

}




