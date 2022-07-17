package portfopol.refactoring.basic.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data @Entity
public class MyData {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String data;
    private int year;
    private int month;
    private int day;
}
