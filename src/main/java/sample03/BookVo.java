package sample03;

public class BookVo {
    private String subject;
    private String writer;
    private int price;
    private String date;

    public BookVo() {
    }

    public BookVo(String subject, String writer, int price, String date) {
        this.subject = subject;
        this.writer = writer;
        this.price = price;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public String getWriter() {
        return writer;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("subject='").append(subject).append('\n');
        sb.append("writer='").append(writer).append('\n');
        sb.append("price=").append(price).append('\n');;
        sb.append("date='").append(date).append('\n');
        return sb.toString();
    }
}
