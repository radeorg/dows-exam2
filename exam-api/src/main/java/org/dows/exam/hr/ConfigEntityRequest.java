package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "ConfigEntityRequest 对象")
public class ConfigEntityRequest {

    @Schema(description = "考试配置ID")
    private Long examConfigId;

}