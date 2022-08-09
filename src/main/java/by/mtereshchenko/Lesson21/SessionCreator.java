package by.mtereshchenko.Lesson21;

import by.mtereshchenko.Lesson21.model.City;
import by.mtereshchenko.Lesson21.model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileReader;
import java.util.Properties;

public class SessionCreator {
    private static final SessionFactory SESSION_FACTORY;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("C:\\Users\\teres\\IdeaProjects\\new-hard-skillss\\src\\main\\resources\\hibernate.properties"));

            SESSION_FACTORY = new Configuration()
                    .addProperties(properties)
                    .addAnnotatedClass(City.class)
                    .addAnnotatedClass(Person.class)
                    .buildSessionFactory();
        } catch (Exception ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return SESSION_FACTORY.openSession();
    }
}
