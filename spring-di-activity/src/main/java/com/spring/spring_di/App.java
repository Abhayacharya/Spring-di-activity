package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
     ClassPathXmlApplicationContext cpx =   new  ClassPathXmlApplicationContext("configure.xml");
     JavaTrainer j = (JavaTrainer)cpx.getBean("java");
     System.out.println(j);
     System.out.println(j.getName());
     
     Sqltrainer sql = (Sqltrainer)cpx.getBean("sql");
     System.out.println(sql);
     System.out.println(sql.getName());
     
     Webtrainer w = (Webtrainer)cpx.getBean("web");
     System.out.println(w);
     System.out.println(w.getName());
    }
}
