package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_question")
public class ExamQuestionEntity extends CrudEntity<ExamQuestionEntity> {

    @Schema(title = "考试问题ID")
    private Long examQuestionId;
    @Schema(title = "考试试卷ID")
    private Long examPaperId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "试题题目ID")
    private Long examTopicId;
    @Schema(title = "题目顺序")
    private Integer seq;
    @Schema(title = "分值")
    private Integer score;
    @Schema(title = "归属者")
    private Long accountInstanceId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "应用ID")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
}