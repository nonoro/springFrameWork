package sample10;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@ToString(exclude = {"content"})
@ToString
@Component // id = boardDTO
@Scope("prototype")//지연초기화

public class BoardDTO {
    @Value("10")
    private int number;

    @Value("springDI")
    private String subject;

    @Value("너무재밌어요 하하하하")
    private String content;


}
