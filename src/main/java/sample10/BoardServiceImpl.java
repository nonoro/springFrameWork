package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component("boardService") // 기본 id = boardServiceImpl 근데 내가 다른 이름을 주고싶으면 @Component("boardService") 이렇게 괄호안에 쓰면됨
@Service("boardService")
public class BoardServiceImpl implements BoardService {


   // @Autowired // byType -> byName 얘는 주입이안됨 왜냐면 BoardDAOImpl의 id를 기본생성인 boardDAOImpl로 줬기 때문에
    @Resource(name = "boardDAOImpl")
    private BoardDAO boardDAO;

    @Autowired // byType -> byName 얘는 주입됨 BoardDAOMyBatisImpl의 id와 같음
    private BoardDAO boardMyBatisDAOImpl;

    public BoardServiceImpl() {
        System.out.println("BoardServiceImpl 의 생성자가 호출되었습니다 ...");
    }

    @Override
    public void select() {
        boardDAO.select();
        System.out.println("----------------------------------------------------------------------------------------");
        boardMyBatisDAOImpl.select();
    }
}
