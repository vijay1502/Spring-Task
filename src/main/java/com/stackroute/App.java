package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        BeanPostProcessorDemoBean demoBean=context.getBean("demobean",BeanPostProcessorDemoBean.class);
        demoBean.postProcessAfterInitialization("movie","Vijay");
        demoBean.postProcessBeforeInitialization("movie","Vijayas");
    }
}
