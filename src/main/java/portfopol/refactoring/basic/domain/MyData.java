package portfopol.refactoring.basic.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class MyData {

    private Long dataId;
    private Long userId;
    private String data;
    private String summary;
    private String keyword;
    private int year;
    private int month;
    private int day;
}
