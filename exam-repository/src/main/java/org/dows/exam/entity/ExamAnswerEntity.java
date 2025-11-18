package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_answer")
public class ExamAnswerEntity extends CrudEntity<ExamAnswerEntity> {

    @Schema(title = "考试答题ID")
    private Long examAnswerId;
    @Schema(title = "考试实例ID")
    private Long examInstanceId;
    @Schema(title = "考试问题ID")
    private Long examQuestionId;
    @Schema(title = "考得分值")
    private Integer examScore;
    @Schema(title = "答案")
    private String answerContent;
    @Schema(title = "归属者")
    private Long accountInstanceId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "应用ID")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
}