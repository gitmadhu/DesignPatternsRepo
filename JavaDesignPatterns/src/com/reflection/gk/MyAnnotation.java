package com.reflection.gk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*the annotation can be accessed via reflection at runtime.
If you do not set this directive, the annotation will not be preserved at runtime, and thus not available via reflection.*/
/*
 * the annotation can only be used ontop of types (classes and interfaces typically). You can also specify METHOD or FIELD
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE)
public @interface MyAnnotation {
	public String name();
	public String value();

}
