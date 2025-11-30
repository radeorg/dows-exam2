package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "PaperEntityRequest 对象")
public class PaperEntityRequest {

    @Schema(description = "考试试卷ID")
    private Long examPaperId;

}