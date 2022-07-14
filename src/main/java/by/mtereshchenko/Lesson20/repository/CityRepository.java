package by.mtereshchenko.Lesson20.repository;

import by.mtereshchenko.Lesson20.model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityRepository {
    // CRUD: Create, read, update. delete

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        // 1. Загрузить драйвер.
        Class.forName("org.postgresql.Driver");

        // 2. Подключиться к БД: url, login, password.
        String url = "jdbc:postgresql://localhost:5432/db1";
        String login = "postgres";
        String password = "241220_Evgenia";
        Connection connection = DriverManager.getConnection(url, login, password);

        return connection;
    }

    //C Create
public void create (City city) throws ClassNotFoundException, SQLException {
    Connection connection = getConnection();

    // 3. Создать объект Statement.
    String sql = "insert into city (name) values (?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, city.name);

    // 4. Выполнить запрос.
    statement.execute();

    // 6. Закрыть ресурсы.
    statement.close();
    connection.close();
}

    public List<City> readAll() throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();

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
        }

        // 6. Закрыть ресурсы.
        resultSet.close();
        statement.close();
        connection.close();

        return cities;
    }
    public void delete(int id) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();

        // 3. Создать объект Statement.
        String sql = "delete from city where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        // 4. Выполнить запрос.
        statement.execute();

        // 6. Закрыть ресурсы.
        connection.close();
    }
    public void update (City city) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();

        // 3. Создать объект Statement.
        String sql = "update city set name = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, city.name);
        statement.setInt(2, city.id);

        // 4. Выполнить запрос.
        statement.execute();

        // 6. Закрыть ресурсы.
        statement.close();
        connection.close();
    }

    // R Read

}
