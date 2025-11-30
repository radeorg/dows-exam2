package org.dows.exam.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "PaperQuestionRequest 对象")
public class PaperQuestionRequest {

    @Schema(description = "考试试卷ID")
    private Long examPaperId;

}