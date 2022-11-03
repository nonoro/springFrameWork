package sample09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {

    @Autowired // 처음에는 bytype으로 주입 안되면 byName으로 주입
    private EmpDTO empDTO; // 주입

    @Autowired
    @Qualifier("aa")
    private EmpDTO empDTO2; // 주입

    @Autowired // AutowiredAnnotationBeanPostProcessor을 안해주면 얘가 활성화가 안됨
    private EmpService empService; // 주입


    public void test() {
        System.out.println("empDTO = " + empDTO + ", empDTO.getName() = " + empDTO.getName());
        System.out.println("empDTO = " + empDTO2 + ", empDTO.getName() = " + empDTO2.getName());

        System.out.println("empService = " + empService);

        empService.test();
    }
}
