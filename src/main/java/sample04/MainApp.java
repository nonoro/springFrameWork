package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
/*        // 기존방식 : 너무 복잡하고 유지보수할때 ㅈㄴ힘듬
        StudentController controller = new StudentController(); // <bean>

        StudentDAO dao = new StudentDAOImpl();  // <bean>

        StudentService service = new StudentServiceImpl();  // <bean>
        StudentServiceImpl s2 = (StudentServiceImpl) service;
        s2.setStudentDAO(dao);

        controller.setService(service);

        Student student = new Student();    // <bean>
        student.setName("규정");
        student.setNo(10);
        student.setPhone("1234-1234-1234");
        student.setAddr("송파구");
        controller.setStudent(student);

        controller.insert();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("springDISetter.xml");
        System.out.println("========================================================");
        StudentController controller = context.getBean("controller", StudentController.class);
        controller.insert();
    }
}
