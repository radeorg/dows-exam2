package org.dows.exam.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "PaperQuestionResponse 对象")
public class PaperQuestionResponse {

    @Schema(description = "考试问题ID")
    private Long examQuestionId;

    @Schema(description = "考试试卷ID")
    private Long examPaperId;

    @Schema(description = "操作者ID")
    private Long operatorId;

    @Schema(description = "题目")
    private String topic;

    @Schema(description = "题目顺序")
    private Integer seq;

    @Schema(description = "分值")
    private Integer score;

}