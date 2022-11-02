package sample03;

public class BookController {
    private BookDAO bookDAO;
    private BookVo bookVo;


    public BookController() {
    }

    public BookController(BookDAO bookDAO, BookVo bookVo) {
        this.bookVo = bookVo;
        this.bookDAO = bookDAO;
    }

    public void bookInsert() {
        bookDAO.insert(bookVo);

    }
}
