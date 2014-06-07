package edu.neumont.diyauto.Models;

import org.omg.SendingContext.RunTime;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

/**
 * Created by jjensen on 6/6/14.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Test {
}
