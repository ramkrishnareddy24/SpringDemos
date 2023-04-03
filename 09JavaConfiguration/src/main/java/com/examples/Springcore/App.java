package com.examples.Springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        demo1();
    	
//    	demo2();
//    	demo3();
    	
        
        
        
        
    }
    
    

	private static void demo3() {
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/Springcore/springconfig3.xml");
		 EmployeeDAO dao = (EmployeeDAO) ctx.getBean("empdao");
		 System.out.println(dao);
	}



	private static void demo2() {
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/Springcore/springconfig2.xml");
	        Computer c1 = (Computer) ctx.getBean("homeComputer");
	        System.out.println(c1);
	        
	        
	        Computer c2 = (Computer) ctx.getBean("officeComputer");
	        System.out.println(c2);
	        
	}

	private static void demo1() {
		System.out.println( "Hello World!" );
        
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/Springcore/springconfig.xml");
        
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Employee e1 = (Employee) ctx.getBean("emp1");
        System.out.println(e1);
        
        Employee e2 = (Employee) ctx.getBean("emp2");
        System.out.println(e2);
        
//        Employee e3 = (Employee) ctx.getBean("emp3");
//        System.out.println(e3);
//        
        Employee e4 = (Employee) ctx.getBean("emp4");
        System.out.println(e4);
//        
//        Employee e5 = (Employee) ctx.getBean("emp5");
//        System.out.println(e5);
//        
//        Employee e6 = (Employee) ctx.getBean("emp6");
//        System.out.println(e6);
//        
//        Employee e7 = (Employee) ctx.getBean("emp7");
//        System.out.println(e7.hashCode());
//        
//        
//        Object b1 = ctx.getBean("bank");
//        System.out.println(b1.hashCode());
//        
//        Object b2 = ctx.getBean("bank");
//        System.out.println(b2.hashCode());
	}
}
