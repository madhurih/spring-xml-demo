package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main
{
    public static void main( String[] args )
    {
//        Resource resource = new ClassPathResource("beans.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        Movie movie = (Movie) factory.getBean("movie");
//        System.out.println(movie.getActor().getName()+ " acted in: " + movie.getMovieName());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie.getActor().getName()+ " acted in: " + movie.getMovieName());


//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie");
//        System.out.println(movie.getActor().getName()+ " acted in: " + movie.getMovieName());


    }
}