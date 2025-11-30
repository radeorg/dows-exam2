package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "ExamPageRequest 对象")
public class ExamPageRequest {

    @Schema(description = "开始考试时间")
    private Object startTime;

    @Schema(description = "结束考试时间")
    private Object endTime;

}