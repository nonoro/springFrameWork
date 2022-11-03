package sample10;

import org.springframework.stereotype.Repository;

//@Component // id = boardMyBatisDAOImpl
@Repository
public class BoardMyBatisDAOImpl implements BoardDAO {


    public BoardMyBatisDAOImpl() {
        System.out.println("BoardMyBatisDAOImpl 의 생성자 호출됨 ...");

    }

    @Override
    public void select() {
        System.out.println("BoardMyBatisDAOImpl 의 select() 호출됨 ...");
    }
}
