package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "ConfigPageRequest 对象")
public class ConfigPageRequest {

    @Schema(description = "组织根ID")
    private Long orgRootId;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "岗位描述ID")
    private Long orgJdId;

    @Schema(description = "题目配置[{examCategoryId:11,percent:20%,examTopicIds:[1,2,3]}]")
    private Object topicConfig;

    @Schema(description = "总题数")
    private Integer total;

    @Schema(description = "数据来源表")
    private String dataTable;

    @Schema(description = "试卷模板")
    private String template;

    @Schema(description = "总分")
    private Integer score;

    @Schema(description = "页数")
    private Integer pageNum;

    @Schema(description = "页大小")
    private Integer pageSize;

}