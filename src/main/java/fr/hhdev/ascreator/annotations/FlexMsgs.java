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
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface FlexMsgs {
	FlexMsg[] value() default {};
}
