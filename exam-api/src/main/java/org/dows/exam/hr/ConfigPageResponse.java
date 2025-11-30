package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "ConfigPageResponse 对象")
public class ConfigPageResponse {

    @Schema(description = "考试配置ID")
    private Long examConfigId;

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

    @Schema(description = "策略[0:顺序，1:随机]")
    private Integer strategy;

    @Schema(description = "考试时长")
    private Integer duration;

    @Schema(description = "是否合并分类")
    private Object merged;

    @Schema(description = "试卷数量")
    private Integer paperCount;

    @Schema(description = "是否随机出题")
    private Object random;

    @Schema(description = "归属者")
    private Long accountInstanceId;

}