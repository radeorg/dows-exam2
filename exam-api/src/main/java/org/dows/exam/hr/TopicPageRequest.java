package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "TopicPageRequest 对象")
public class TopicPageRequest {

    @Schema(description = "题目名称")
    private String topic;

    @Schema(description = "题目分值")
    private Integer score;

    @Schema(description = "题型[1:选择题，2:填空题，3:问答题..]")
    private Integer topicType;

    @Schema(description = "页数")
    private Integer pageNum;

    @Schema(description = "页大小")
    private Integer pageSize;

}