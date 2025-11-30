package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "TopicEntityResponse 对象")
public class TopicEntityResponse {

    @Schema(description = "试题题目ID")
    private Long examTopicId;

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

    @Schema(description = "题型[1:选择题，2:填空题，3:问答题..]")
    private Integer topicType;

}