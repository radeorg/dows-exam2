package org.dows.exam.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "ObjectRequest 对象",title = "ObjectRequest")
@NoArgsConstructor
public class ObjectRequest{
    @Schema(title = "试题题目ID")
    private Long examTopicId;
    @Schema(title = "题目名称")
    private String topic;
    @Schema(title = "题目描述")
    private String description;
    @Schema(title = "题目答案选项")
    private String optionJson;
    @Schema(title = "题目答案")
    private String result;
    @Schema(title = "题目分值")
    private Integer score;
    @Schema(title = "题型[1:选择题，2:填空题，3:问答题..]")
    private Integer topicType;

}
