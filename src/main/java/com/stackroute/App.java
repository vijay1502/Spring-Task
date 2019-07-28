package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Actor act=context.getBean("actor",Actor.class);
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println(act.getAge());
        System.out.println(act.getGender());
        System.out.println(act.getName());
        act.actorVijay();

        System.out.println(movie.getActor().getGender());
        System.out.println(movie.getActor().getAge());
        System.out.println(movie.getActor().getName());
        System.out.println(movie.getMovieName());
        //Using Bean Factory
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory bean=new XmlBeanFactory(resource);
        Actor acting=(Actor) context.getBean("actor");
        System.out.println(acting.getGender());
        acting.getName();
        acting.getAge();
    }
}
