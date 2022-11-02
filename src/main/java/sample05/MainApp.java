package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("orderProductSetter.xml");
        OrderMessageImpl orderMessage = context.getBean("orderMessage", OrderMessageImpl.class);
        orderMessage.getOrderMessage();
    }
}
