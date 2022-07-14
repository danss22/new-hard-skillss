package by.mtereshchenko.Lesson21.repository;

import by.mtereshchenko.Lesson21.SessionCreator;
import by.mtereshchenko.Lesson21.model.City;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityRepository {
    // crud

    // CREATE
    public void create(City city) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(city);
        transaction.commit();
        session.close();
    }

    // READ

    public List<City> readAll() {
        Session session = SessionCreator.getSession();

        //HQL  Hibernate Query Language
        List<City> citiez = session.createQuery("from City", City.class).list();

        session.close();
        return citiez;
}

        // READ by id
        public City readById(int id) {
        Session session = SessionCreator.getSession();

        //HQL  Hibernate Query Language
            City city = session.get(City.class, id);

            session.close();
            return city;
    }

    // UPDATE

    public void update (City city) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();

        session.update(city);
        transaction.commit();
        session.close();
    }

    // DELETE

    public void delete (City city) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();

//        session.remove(city);
        session.delete(city);

        transaction.commit();
        session.close();
    }

    public List<City> readVarschava() {
        Session session = SessionCreator.getSession();
        List<City> cities = session.createQuery("from City where name = :name", City.class).list();

        session.close();

        return cities;
    }
}
