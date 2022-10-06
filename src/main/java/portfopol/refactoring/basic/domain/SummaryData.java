package portfopol.refactoring.basic.domain;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class SummaryData {

    private Long dataId;
    private Long userId;

    private String summary;
}

