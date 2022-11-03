package sample07;

public class MemberVO {
    private String name;
    private int age;
    private String addr;

    public MemberVO() {
        System.out.println("MemberVO() 생성자 호출됨 ....");
    }

    public MemberVO(String name, int age, String addr) {
        System.out.println("MemberVO(String name, int age, String addr) 생성자 호출됨...");
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName(String name) 호출됨...");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge(int age) 호출됨...");
        this.age = age;

    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        System.out.println("setAddr(String addr) 호출됨...");
        this.addr = addr;
    }
}
