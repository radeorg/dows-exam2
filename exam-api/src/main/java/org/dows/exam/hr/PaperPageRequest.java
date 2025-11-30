package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "PaperPageRequest 对象")
public class PaperPageRequest {

    @Schema(description = "考试时长")
    private Integer examDuration;

    @Schema(description = "时间戳 ")
    private Object createTime;

}