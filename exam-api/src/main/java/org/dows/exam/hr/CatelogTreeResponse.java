package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "CatelogTreeResponse 对象")
public class CatelogTreeResponse {

    @Schema(description = "考试类目ID")
    private Long examCatelogId;

    @Schema(description = "父ID")
    private Long pid;

    @Schema(description = "知识类目")
    private String name;

    @Schema(description = "code")
    private String code;

}