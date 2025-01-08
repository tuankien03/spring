package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Ensure Spring dependencies are included in your build system, e.g., Maven or Gradle

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Sim sim = applicationContext.getBean("sim", Sim.class);

        // Calling the methods
        sim.calling();
        sim.data();

    }
}