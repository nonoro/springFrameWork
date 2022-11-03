package sample10;

import org.springframework.stereotype.Repository;

//@Component // id="boardDAOImpl" id 는 클래스이름의 첫글자만 소문자 그래서 컴포넌트를 붙여주면 자동으로 id가 생성됨
@Repository
public class BoardDAOImpl implements BoardDAO { // <bean class="BoardDAOImpl" id="boardDAOImpl" 얘를 대신해주는애가 @Component

    public BoardDAOImpl() {
        System.out.println("BoardDAOImpl 의 생성자 호출됨 ...");
    }

    @Override
    public void select() {
        System.out.println("BoardDAOImpl 의 select() 호출됨 ...");
    }
}
