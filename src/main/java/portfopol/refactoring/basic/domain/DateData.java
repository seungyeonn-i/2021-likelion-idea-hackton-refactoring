package portfopol.refactoring.basic.domain;

import lombok.Data;

@Data
public class DateData {

    private Long dataId;
    private Long userId;

    private int year;
    private int month;
    private int day;
}
