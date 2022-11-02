package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bookConstructor.xml");
        BookController dao = context.getBean("bookController", BookController.class);
        dao.bookInsert();
    }
}
