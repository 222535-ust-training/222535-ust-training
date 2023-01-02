package com.ust.sptingioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml");  
    	
    	System.out.println("Hello world!");
    	
    	Person p=(Person)context.getBean("person");
    	p.name();
    	p.experience();
    	
    }
}
