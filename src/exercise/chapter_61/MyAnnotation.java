package exercise.chapter_61;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.TYPE})
@Documented
public @interface MyAnnotation {
    String name();
    int count() default 0;

}
