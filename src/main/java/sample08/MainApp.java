package sample08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sample08/springDIAutowireBook.xml");
        BookController controller = (BookController) context.getBean("controller");
        controller.invoker();
    }
}
