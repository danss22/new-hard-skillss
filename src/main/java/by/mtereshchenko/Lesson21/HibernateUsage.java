package by.mtereshchenko.Lesson21;

import by.mtereshchenko.Lesson21.model.City;
import by.mtereshchenko.Lesson21.model.Person;
import by.mtereshchenko.Lesson21.repository.CityRepository;
import by.mtereshchenko.Lesson21.repository.PersonRepository;

import java.util.List;

public class HibernateUsage {
    public static void main(String[] args) {
//        SessionCreator.getSession();
//        CityRepository repository = new CityRepository();
//        repository.create(new City("Spb"));
//        repository.create(new City("Minsk"));
//        repository.create(new City("Warchava"));
//        repository.create(new City("Gomel"));

//        System.out.println(repository.readAll());
//        System.out.println(repository.readById(3));
//        System.out.println(repository.readAll());
//        repository.update(new City(1, "Piter"));
//        System.out.println(repository.readAll());
//        repository.delete(new City(5));
//        repository.readVarschava();

//        SessionCreator.getSession();
        PersonRepository repository = new PersonRepository();
//        repository.create(new Person("Oleg", 30, new City(2)));
//        repository.create(new Person("Volga", 21, new City(3)));
//        repository.create(new Person("Misha", 22, new City(1)));
//        repository.create(new Person("Lesha", 34, new City(3)));
        System.out.println(repository.readAll());
    }

}
