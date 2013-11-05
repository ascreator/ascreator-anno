/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hhdev.ascreator.annotations;

/**
 *
 * @author HHFrancois
 */
public @interface Property {

   String name() default "";

   String value() default "";
}
