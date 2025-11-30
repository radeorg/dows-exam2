package org.dows.exam.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "ExamEntityRequest 对象")
public class ExamEntityRequest {

    @Schema(description = "考试实例ID")
    private Long examInstanceId;

    @Schema(description = "考试试卷ID")
    private Long examPaperId;

    @Schema(description = "考试问题ID")
    private Long examQuestionId;

    @Schema(description = "答案")
    private String answerContent;

}