package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "TopicPageResponse 对象")
public class TopicPageResponse {

    @Schema(description = "试题题目ID")
    private Long examTopicId;

    @Schema(description = "考试类目ID")
    private Long examCatalogId;

    @Schema(description = "题目名称")
    private String topic;

    @Schema(description = "题目描述")
    private String description;

    @Schema(description = "题目答案选项")
    private String optionJson;

    @Schema(description = "题目答案")
    private String result;

    @Schema(description = "题目分值")
    private Integer score;

    @Schema(description = "生成类型[0:AI,1:人工]")
    private Integer generateType;

    @Schema(description = "题型[1:选择题，2:填空题，3:问答题..]")
    private Integer topicType;

    @Schema(description = "是否可用0-可用，1-不可用")
    private Object enabled;

    @Schema(description = "操作者ID")
    private Long operatorId;

    @Schema(description = "创建时间")
    private Object ts;

}