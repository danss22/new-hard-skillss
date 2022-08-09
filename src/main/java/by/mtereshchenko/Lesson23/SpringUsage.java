package by.mtereshchenko.Lesson23;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringUsage {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext
                        ("by.mtereshchenko.Lesson23");

//        BeanClass bean = context.getBean(BeanClass.class);
//        System.out.println(bean);
        Car car = context.getBean(Car.class);
        Car car2 = context.getBean(Car.class);
//        car.drive();
//
        System.out.println(car);
        System.out.println(car2);
//
        context.close();
    }
}
