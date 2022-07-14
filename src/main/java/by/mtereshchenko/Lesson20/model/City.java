package by.mtereshchenko.Lesson20.model;

public class City {
    public int id;
    public String name;

    public City(String name) {
        this.name = name;
    }

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "City{" +
                "id=" + id + ", name='" + name + '\'' + '}';
    }
}
