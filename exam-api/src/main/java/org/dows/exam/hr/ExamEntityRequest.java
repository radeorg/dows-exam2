package org.dows.exam.hr;

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

}