package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Actor actor1=context.getBean("actor1",Actor.class);
        Actor actor2=context.getBean("actor2",Actor.class);
        Actor actor3=context.getBean("actor3",Actor.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        Movie movie2=context.getBean("movie2",Movie.class);

        System.out.println(actor1.toString());
        System.out.println(actor2.toString());
        System.out.println(actor3.toString());
        System.out.println(actor1==actor2);
        System.out.println(movie1.getActor1());
        System.out.println(movie2.getActor2());
        System.out.println(movie1==movie2);
    }
}
