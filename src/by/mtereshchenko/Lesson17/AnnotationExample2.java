package by.mtereshchenko.Lesson17;

public @interface AnnotationExample2 {
    int value() default 18;
//    String name();
}
@AnnotationExample2(value = 30)
class A {

}
