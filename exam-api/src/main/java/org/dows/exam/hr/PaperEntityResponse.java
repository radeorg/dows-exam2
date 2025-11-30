package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "PaperEntityResponse 对象")
public class PaperEntityResponse {

    @Schema(description = "考试配置ID")
    private Long examConfigId;

    @Schema(description = "操作者ID")
    private Long operatorId;

    @Schema(description = "考试时长")
    private Integer examDuration;

    @Schema(description = "试卷内容（freemarker渲染生成）")
    private String content;

    @Schema(description = "试卷链接")
    private String link;

    @Schema(description = "应用ID")
    private String appId;

    @Schema(description = "归属者")
    private Long accountInstanceId;

    @Schema(description = "时间戳 ")
    private Object createTime;

}