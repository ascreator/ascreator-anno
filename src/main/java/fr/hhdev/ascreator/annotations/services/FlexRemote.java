/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.hhdev.ascreator.annotations.services;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Cette annotation définit qu'une méthode retourne le détail d'une entité persisté
 * @author HHFrancois
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FlexRemote {
	/**
	 * Tous les serveurs repondent ils à  ce service
	 * @return 
	 */
	boolean global() default false;
	/**
	 * Inactivation du customer flex
	 * @return 
	 */
	int timeout() default 10000;

	/**
	 * Le timeout doit il lever une exception
	 *
	 * @return
	 */
	boolean timeoutException() default false;
}
