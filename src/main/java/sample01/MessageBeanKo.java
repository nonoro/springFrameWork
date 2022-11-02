package sample01;

public class MessageBeanKo implements MessageBean {
    public MessageBeanKo() {
        System.out.println("MessageBeanKo 생성자 호출됨");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("안녕 !" + name);
    }
}
