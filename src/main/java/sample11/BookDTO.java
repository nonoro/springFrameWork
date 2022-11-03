package sample11;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@NoArgsConstructor
@Getter
@Setter
@Scope("prototype")//지연초기화
public class BookDTO {
    private String subject;
    private String writer;
    private int price;
    private String date;

}
