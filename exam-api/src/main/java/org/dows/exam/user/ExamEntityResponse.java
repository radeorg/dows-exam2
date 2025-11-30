package org.dows.exam.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "ExamEntityResponse 对象")
public class ExamEntityResponse {

    @Schema(description = "考试答题ID")
    private Long examAnswerId;

}