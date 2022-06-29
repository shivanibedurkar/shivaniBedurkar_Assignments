package com.cg.assignment;

import java.lang.annotation.*;


//Meta Annotation 
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface info{
    int authorID();
    String author() default "Null";
    String supervisor() default "Null";
    String date();
    String time();
    int version();
    String description() default "General class";
}


@info(authorID = 12, date = "21 March", time = "4pm", version = 6)
public class Program2 {
	
	
}

