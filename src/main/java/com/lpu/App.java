package com.lpu;

import com.lpu.entity.Person;
import config.CustomClassConfiguration;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dev");
        HashMap<Object,Object>props=new HashMap<>();
        props.put("hibernate.hbm2ddl.auto","create");
        props.put("hibernate.show_sql","true");
        EntityManagerFactory entityManagerFactory=new HibernatePersistenceProvider().
                createContainerEntityManagerFactory(new CustomClassConfiguration(), new HashMap<>());
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
