package portfopol.refactoring.basic.domain;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class SummaryData {

    private Long dataId;
    private Long userId;

    private String summary;


    public SummaryData(Long dataId, Long userId) {
        this.dataId = dataId;
        this.userId = userId;
    }

}

