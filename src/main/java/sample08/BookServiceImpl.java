package sample08;

public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;  // 주입-생성자
    private EmailSender emailSender; // 주입-set
    private MessageSender messageSender; // 주입-set

    public BookServiceImpl() {

    }

    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public void save(BookDTO bookDTO1, BookDTO bookDTO2) {
        bookDAO.save(emailSender, messageSender, bookDTO1, bookDTO2);
    }

    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
