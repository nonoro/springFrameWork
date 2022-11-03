package sample08;

public class BookDAOImpl implements BookDAO {
    private DbUtil dbUtil; // 주입-생성자

    public BookDAOImpl() {
    }

    public BookDAOImpl(DbUtil dbUtil) {
        this.dbUtil = dbUtil;
    }


    @Override
    public void save(EmailSender emailSender, MessageSender messageSender, BookDTO bookDTO1, BookDTO bookDTO2) {
        System.out.println("EmailSender = " + emailSender);
        System.out.println("MessageSender = " + messageSender);
        System.out.println("BookDTO1 = " + bookDTO1);
        System.out.println("BookDTO2 = " + bookDTO2);
        System.out.println("DbUtil = " + dbUtil);
    }
}
