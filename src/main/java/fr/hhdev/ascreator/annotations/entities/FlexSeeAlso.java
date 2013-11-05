/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.hhdev.ascreator.annotations.entities;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Permet de définir quel classe sont nécéssaire à la serialisation
 * @author HHFrancois
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
public @interface FlexSeeAlso {
    Class<?>[] value();
}
