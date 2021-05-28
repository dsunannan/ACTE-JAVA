package com.acte.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
 
@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, 
                 ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE, 
                 ElementType.PACKAGE, ElementType.PARAMETER})
public @interface MyCustomAnnotationTarget {

}
