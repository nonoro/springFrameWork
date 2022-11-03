package sample09;

import javax.annotation.Resource;

public class ResourceBeen {
    // @Autowired는 자동으로 연결해주지만 Resource는 내가 bean에 만든 객체의 id에 직접 연결해야됨
    // @Autowired는 편하지만 가독성이 떨어짐
    @Resource(name = "empDTO")
    private EmpDTO emp1;
    @Resource(name = "dto2")
    private EmpDTO emp2;

    @Resource(name = "service")
    private EmpService service;

    @Resource(name = "controller")
    private EmpController controller;

    public void test() {
        System.out.println("emp1 = " + emp1 + ", name = " + emp1.getName());
        System.out.println("emp2 = " + emp2 + ", name = " + emp2.getName());

        System.out.println("service = " + service);
        System.out.println("controller = " + controller);
    }
}
