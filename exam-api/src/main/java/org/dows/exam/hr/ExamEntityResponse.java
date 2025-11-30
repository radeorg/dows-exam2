package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "ExamEntityResponse 对象")
public class ExamEntityResponse {

    @Schema(description = "考试试卷ID")
    private Long examPaperId;

    @Schema(description = "人才简历ID")
    private Long resumeInstanceId;

    @Schema(description = "归属者")
    private Long accountInstanceId;

    @Schema(description = "用户实例ID")
    private Long userInstanceId;

    @Schema(description = "考试分值")
    private Object examScore;

    @Schema(description = "开始考试时间")
    private Object startTime;

    @Schema(description = "结束考试时间")
    private Object endTime;

    @Schema(description = "完成时间")
    private Object finishTime;

    @Schema(description = "是否可用0-可用，1-不可用")
    private Object enabled;

    @Schema(description = "操作者ID")
    private Long operatorId;

    @Schema(description = "应用ID")
    private String appId;

    @Schema(description = "时间戳")
    private Object createTime;

}