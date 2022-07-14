package by.mtereshchenko.Lesson21.repository;

import by.mtereshchenko.Lesson21.SessionCreator;
import by.mtereshchenko.Lesson21.model.City;
import by.mtereshchenko.Lesson21.model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PersonRepository {
    // crud

    // CREATE
    public void create(Person person) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }

    // READ

    public List<Person> readAll() {
        Session session = SessionCreator.getSession();

        //HQL  Hibernate Query Language
        List<Person> people = session.createQuery("from Person", Person.class).list();

        session.close();
        return people;
}

        // READ by id
        public Person readById(int id) {
        Session session = SessionCreator.getSession();

        //HQL  Hibernate Query Language
            Person person = session.get(Person.class, id);

            session.close();
            return person;
    }

    // UPDATE

    public void update (Person person) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();

        session.update(person);
        transaction.commit();
        session.close();
    }

    // DELETE

    public void delete (Person person) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();

//        session.remove(city);
        session.delete(person);

        transaction.commit();
        session.close();
    }

//    public List<City> readVarschava() {
//        Session session = SessionCreator.getSession();
//        List<City> cities = session.createQuery("from City where name = :name", City.class).list();
//
//        session.close();
//
//        return cities;
//    }
}
