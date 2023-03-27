package com.examples.Stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/Stereotypes/springconfig.xml");
    	
    	Instructor instructor = (Instructor) ctx.getBean("instructor");
    	System.out.println(instructor);
    }
}
