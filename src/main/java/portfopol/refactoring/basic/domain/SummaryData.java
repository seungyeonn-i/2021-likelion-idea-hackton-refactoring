package portfopol.refactoring.basic.domain;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class SummaryData {

    @NotNull
    private Long dataId;
    @NotNull
    private Long userId;
    @NotNull
    private String summary;
}

