package by.mtereshchenko.Lesson20;

import by.mtereshchenko.Lesson20.model.City;
import by.mtereshchenko.Lesson20.repository.CityRepository;

import java.sql.SQLException;
import java.util.List;

public class MyJDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CityRepository repository = new CityRepository();

//        List<City> cities = repository.readAll();
//        System.out.println(cities);
//        City city = new City("Madrid");
//        repository.create(city);
//        System.out.println(repository.readAll());
//        repository.delete(3);
//        System.out.println(repository.readAll());
        repository.update(new City(4, "Petropavlovsk"));
        System.out.println(repository.readAll());

    }
}
