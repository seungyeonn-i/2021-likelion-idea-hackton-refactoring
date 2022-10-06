package portfopol.refactoring.basic.domain;

import lombok.Data;

@Data
public class KeywordData {
    private Long dataId;
    private Long userId;

    private String keyword;

    public KeywordData(Long dataId, Long userId) {
        this.dataId = dataId;
        this.userId = userId;
    }
}


