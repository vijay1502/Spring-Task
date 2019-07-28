package com.stackroute.demo;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean demoBean=context.getBean("demobean",BeanLifecycleDemoBean.class);

        demoBean.myMethod();
    }
}
