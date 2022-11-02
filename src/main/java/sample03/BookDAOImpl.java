package sample03;

public class BookDAOImpl implements BookDAO {
    public BookDAOImpl() {
    }

    @Override
    public void insert(BookVo bookVo) {
        System.out.println("bookVo insert 호출됨");
        System.out.println(bookVo);
    }

/*    @Override
    public void insert(String subject) {
        System.out.println("bookVo insert 호출됨");
        System.out.println(subject);

    }*/
}
