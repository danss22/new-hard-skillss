package by.mtereshchenko.Lesson20.repository;

import by.mtereshchenko.Lesson20.model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Загрузить драйвер.
        Class.forName("org.postgresql.Driver");

        // 2. Подключиться к БД: url, login, password.
        String url = "jdbc:postgresql://localhost:5432/db1";
        String login = "postgres";
        String password = "241220_Evgenia";
        Connection connection = DriverManager.getConnection(url, login, password);

        // 3. Создать объект Statement.
        PreparedStatement statement = connection.prepareStatement("select * from city");

        // 4. Выполнить запрос.
        statement.execute();

        // 5. Обработать результат.
        ResultSet resultSet = statement.getResultSet();
        List<City> cities = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            City city = new City(id, name);
            cities.add(city);
            System.out.println(id + ": " + name);
        }
        System.out.println(cities);
        // 6. Закрыть ресурсы.
        resultSet.close();
        statement.close();
        connection.close();
    }
}
