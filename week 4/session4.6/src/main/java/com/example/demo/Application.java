package com.example.demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        // Load Spring Container
        BeanFactory factory =
                new ClassPathXmlApplicationContext("beans.xml");

        // Get Bean from Container
        EmployeeService service =
                factory.getBean(EmployeeService.class);

        // Use Service
        service.createEmployee(1, "John", 50000);
        service.createEmployee(2, "Alice", 60000);

        service.showEmployees();
    }
}