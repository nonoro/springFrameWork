package sample06;

import java.util.List;

public class ListBean {
    private List<Integer> numbers;
    private List<String> strings;
    private List<Customer> customers;

    public ListBean() {
        System.out.println("ListBean() 생성자 호출됨");
    }

    public void setNumbers(List<Integer> numbers) {
        System.out.println("setNumbers(List<Integer> numbers) 호출됨 numbers = " + numbers);
        this.numbers = numbers;
    }

    public void setStrings(List<String> strings) {
        System.out.println("setStrings(List<String> strings) 호출됨 strings = " + strings);
        this.strings = strings;
    }

    public void setCustomers(List<Customer> customers) {
        System.out.println("setCustomers(List<Customer> customers) 호출됨 customers = " + customers);
        this.customers = customers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<String> getStrings() {
        return strings;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
