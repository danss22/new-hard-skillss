package by.mtereshchenko.Lesson23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Engine {
    @PostConstruct
    public void init() {
        System.out.println("Hi from init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Hi from destroy method");
    }
    public void running() {
        System.out.println("Wroooom!");
    }
}

//public interface Engine {
//    default void running() {
//        System.out.println("Wrooooom!");
//    }
//}

@Component
class Car {
//    @Autowired // - внедрение зависимости (внедряем engine)
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.running();
    }
}


