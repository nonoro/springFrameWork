package sample09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sample09/springAnnotation.xml");


        System.out.println("-----------------------------------------------------------------------");
        EmpController controller = context.getBean("controller", EmpController.class);
        controller.test();

        System.out.println("-----------------------------------------------------------------------");
        ResourceBeen resource = context.getBean("resource", ResourceBeen.class);
        resource.test();
    }
}
