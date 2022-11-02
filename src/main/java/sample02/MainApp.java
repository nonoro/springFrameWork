package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // 기존방식 이렇게 직접 객체들을 생성을 하면 연관관계가 높아 나중에 문제가 발생할 우려가 높음
        // 따라서 메타데이터인 xml파일에 bean에 의존성을 주입하여 사용해야한다 주입방식은 여러가지가 있는데 그중 값을 생성자를 통해 주입해보자!
        // ApplicationContext context = new ClassPathXmlApplicationContext("springDIConstructor.xml"); 메인에서 이것만 해줬을 뿐인데 이미 사전초기화를 통해
        // 내부에서 만들어짐
/*
        Member member = new Member("jang", "1234", 20, "서울");
        MemberDAO dao = new MemberDAO();

        MemberService service = new MemberService(dao, member);
        service.serviceInsert();
*/

        ApplicationContext context = new ClassPathXmlApplicationContext("springDIConstructor.xml");

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        MemberService service = context.getBean("service", MemberService.class);
        service.serviceInsert();
    }
}
