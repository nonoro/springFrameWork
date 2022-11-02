package sample01;

public class MessageBeanEn implements MessageBean {
    public MessageBeanEn() {
        System.out.println("MessageBeanEn 생성자 호출됨...");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello~" + name);
    }
}
