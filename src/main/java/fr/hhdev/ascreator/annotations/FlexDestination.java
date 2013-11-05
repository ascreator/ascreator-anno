/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.hhdev.ascreator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author HHFrancois
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FlexDestination {
	String id() default "";
    String factory() default "";
    Scope scope() default Scope.REQUEST;
    Property[] properties() default{};
}
