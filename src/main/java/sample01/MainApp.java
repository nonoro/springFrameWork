package sample01;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // 1. 기존방식
/*        MessageBean bean = new MessageBeanKo();
        bean.sayHello("??");

        bean = new MessageBeanEn();
        bean.sayHello("Heejung");*/

        // 2. SpringContainer가 bean을 관리할 수 있도록 bean 설정 문서를 만들고 로딩한다.
        // 인텔리제이는 classPath가 resource폴더이기 때문에 classPath를 설정시 그냥 파일 이름만 써줌

        /*
        * SpringContainer의 종류
        *   1) BeanFactory : 객체 생성 + 소멸등의 기본 라이프 사이클 관리
        *   2) ApplicationContext : BeanFactory의 확장 개념으로 기본기능 + 다국어 지원, 메시지처리
        *   3) WebApplicationContext : Spring Web MVC에서 사용
        *
        *   - 특징
        *       : Container가 만들어질때 bean 설정문서를 읽어서 bean설정에있는 객체를 사전초기화(미리생성)(싱글톤)
        *
        *       : scope="prototype" 를 설정하면 지연 초기화로 객체를 필요할 때마다 새롭게 생성
        * */

        // 이걸 자주 씀
         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     /*   // 인텔리제이는 이걸 사용할 경우 classPath기준이 step01_SpringDI임 그래서 여기서 src main을 거쳐 풀경로 써야됨
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");*/


        MessageBean bean = context.getBean("ko", MessageBean.class);
        bean.sayHello("??");

        bean = context.getBean("en", MessageBean.class);
        bean.sayHello("Heejung");

        System.out.println("bean = " + bean);

        // scope영역은 싱글톤이 기본값이여서 아무런 설정을 안할시 아이디값이 같으면 같은 객체여서 bean2와 bean의 주소값이 같다
        MessageBean bean2 = context.getBean("en", MessageBean.class);
        System.out.println("bean2 = " + bean2);

        // scope이 싱글톤일경우 en2라는 아이디의 객체를 따로 또 만들기때문에 bean과 bean2와 주소값이다른다
        MessageBean bean3 = context.getBean("en2", MessageBean.class);
        System.out.println("bean3 = " + bean3);


    }
}
