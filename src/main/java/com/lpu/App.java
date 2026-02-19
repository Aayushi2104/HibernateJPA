package com.lpu;

import com.lpu.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.text.html.parser.Entity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dev");
        EntityManager em=entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        Person person=new Person();
        person.setName("Aayushi");
        person.setAge(20);
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }
}
