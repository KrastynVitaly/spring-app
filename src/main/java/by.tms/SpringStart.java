package by.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-settings.xml");

        Student student = (Student) context.getBean("beanStudent");
        System.out.println(student.getName());
    }
}
