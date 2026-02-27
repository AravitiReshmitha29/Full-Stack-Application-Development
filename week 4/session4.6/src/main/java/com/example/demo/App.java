package com.example.demo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;

@Configuration
@ComponentScan(basePackages = "com.example.employeemanagement")
public class App {

    public static void main(String[] args) {

        BeanFactory factory =
                new ClassPathXmlApplicationContext("beans.xml");

        EmployeeService service =
                factory.getBean(EmployeeService.class);

        service.createEmployee(1, "John", 50000);
        service.createEmployee(2, "Alice", 60000);

        service.showEmployees();
    }
}