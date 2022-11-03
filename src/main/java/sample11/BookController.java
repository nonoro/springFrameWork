package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookDTO book1;

    @Autowired
    private BookDTO book2;

    @Autowired
    private BookService bookService;

    void invoker() {
        bookService.save(book1, book2);
    }
}
