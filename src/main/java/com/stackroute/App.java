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
    { ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie actor=context.getBean("movie1", Movie.class);
        Movie actor1=context.getBean("movie2",Movie.class);
        Movie actor2=context.getBean("movie3",Movie.class);

        System.out.println(actor.toString());
        System.out.println(actor1.toString());
        System.out.println(actor2.toString());


    }
}
