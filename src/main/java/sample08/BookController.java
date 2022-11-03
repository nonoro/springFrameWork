package sample08;

public class BookController { //<bean class="BookController" autowire=""

    private BookService bookService; // 주입-생성자
    private BookDTO bookDTO1; // 주입-생성자
    private BookDTO bookDTO2; // 주입-생성자

    public BookController() {
    }

    public BookController(BookService bookService, BookDTO bookDTO1, BookDTO bookDTO2) {
        this.bookService = bookService;
        this.bookDTO1 = bookDTO1;
        this.bookDTO2 = bookDTO2;
    }

    public void invoker() {
        bookService.save(bookDTO1, bookDTO2);
    }
}
