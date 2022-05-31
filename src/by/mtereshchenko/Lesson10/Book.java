package by.mtereshchenko.Lesson10;

/*
Создайте класс Книга, с полями название, кол-во страниц.
Поля сделайте закрытыми, добавьте геттеры и сеттеры к полям.
В сеттеры добавьте проверки для кол-ва страниц нельзя установить значения меньше 0, для названия нельзя
чтобы в название содержалось слово “name” (У строк есть метод “contains()”).
 */
public class Book {
    private String name;
    private int page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("name")) {
            System.out.println("Неверное имя");
        }else {
            this.name = name;
        }
    }

    public int getPage() {
        return page;
    }


    public void setPage(int page) {
        if (page < 0) {
            System.out.println("Извините, значение меньше 0: " + page);
        }else {
            this.page = page;
        }

    }
}

class BookUsage {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Book");
        System.out.println(book.getName());
        book.setPage(10);
        System.out.println(book.getPage());
    }
}