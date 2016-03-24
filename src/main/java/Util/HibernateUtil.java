package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Admin on 20.03.2016.
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private HibernateUtil(){}

    static {
        try {

            sessionFactory =  new Configuration().configure().buildSessionFactory();
        }catch (Throwable e){
            System.err.println("инициализация сесии неудалась " +e);
            throw new ExceptionInInitializerError(e);

        }

    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void closeSessionFactory(){
         sessionFactory.close();
    }

}