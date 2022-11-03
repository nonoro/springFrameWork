package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Component
@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardDTO boardDTO;

    @Autowired
    private BoardDTO boardDTO2;

    public void test() {
        // BoardDTO에 @Getter를 해줬기 때문에 따로 getter를 안만들었는데도 쓸 수 있음
        System.out.println("boardDTO = " + boardDTO + ", subject : " + boardDTO.getSubject());
        System.out.println("boardDTO2 = " + boardDTO2 + ", subject : " + boardDTO2.getSubject());

        System.out.println("boardService = " + boardService);

        boardService.select();
    }
}
