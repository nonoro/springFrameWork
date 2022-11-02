package sample04;

public class Student {
    private String name;
    private int no;
    private String phone;
    private String addr;

    public Student() {
        System.out.println("Student 기본생성자 call");
    }

    public void setName(String name) {
        System.out.println("Student의 setName(String name) 호출 name = " + name);
        this.name = name;
    }

    public void setNo(int no) {
        System.out.println("Student의 setNo(int no) 호출 no = " + no);
        this.no = no;
    }

    public void setPhone(String phone) {
        System.out.println("Student의 setPhone(String phone) 호출 phone = " + phone);
        this.phone = phone;
    }

    public void setAddr(String addr) {
        System.out.println("Student의 setAddr(String addr) 호출 addr = " + addr);
        this.addr = addr;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student : ");
        sb.append("name='").append(name).append('\'');
        sb.append(", no=").append(no);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", addr='").append(addr).append('\'');
        return sb.toString();
    }
}
