package sample06;

public class Customer {
    private String id;
    private int age;
    private String addr;

    public Customer() {
        System.out.println("Customer() 생성자 호출됨 ...");
    }

    public Customer(String id) {
        System.out.println("Customer(String id) 생성자 호출됨 ...");
        this.id = id;
    }

    public Customer(String id, int age, String addr) {
        this.id = id;
        this.age = age;
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("setId(String id) 호출됨 ... id = " + id);
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setId(int age) 호출됨 ... age = " + age);
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        System.out.println("setId(String addr) 호출됨 ... addr = " + addr);
        this.addr = addr;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer : ");
        sb.append("id='").append(id).append('\'');
        sb.append(", age=").append(age);
        sb.append(", addr='").append(addr).append('\'');
        return sb.toString();
    }
}
