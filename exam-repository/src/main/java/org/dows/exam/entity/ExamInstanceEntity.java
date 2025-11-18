package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_instance")
public class ExamInstanceEntity extends CrudEntity<ExamInstanceEntity> {

    @Schema(title = "考试实例ID")
    private Long examInstanceId;
    @Schema(title = "考试试卷ID")
    private Long examPaperId;
    @Schema(title = "人才简历ID")
    private Long resumeInstanceId;
    @Schema(title = "账号实例ID")
    private Long accountInstanceId;
    @Schema(title = "用户实例ID")
    private Long userInstanceId;
    @Schema(title = "考试分值")
    private Object examScore;
    @Schema(title = "开始考试时间")
    private LocalDateTime startTime;
    @Schema(title = "结束考试时间")
    private LocalDateTime endTime;
    @Schema(title = "完成时间")
    private LocalDateTime finishTime;
    @Schema(title = "是否可用0-可用，1-不可用")
    private Boolean enabled;
    @Schema(title = "归属者")
    private Long accountInstanceId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "应用ID")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
}