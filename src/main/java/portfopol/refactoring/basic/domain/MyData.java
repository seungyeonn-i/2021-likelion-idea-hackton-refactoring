package portfopol.refactoring.basic.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class MyData {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataId;
    private Long userId;
    private String data;
    private String summary;
    private String keyword;
    private int year;
    private int month;
    private int day;
}
