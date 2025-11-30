package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_topic")
public class ExamTopicEntity extends CrudEntity<ExamTopicEntity> {

    @Schema(title = "试题题目ID")
    private Long examTopicId;
    @Schema(title = "考试类目ID")
    private Long examCatelogId;
    @Schema(title = "题目名称")
    private String topic;
    @Schema(title = "题目描述")
    private String description;
    @Schema(title = "题目答案选项")
    private Object optionJson;
    @Schema(title = "题目答案")
    private String result;
    @Schema(title = "题目分值")
    private Integer score;
    @Schema(title = "生成类型[0:AI,1:人工]")
    private Integer generateType;
    @Schema(title = "题型[1:选择题，2:填空题，3:问答题..]")
    private Integer topicType;
    @Schema(title = "是否可用0-可用，1-不可用")
    private Boolean enabled;
    @Schema(title = "归属者")
    private Long accountInstanceId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "应用ID")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime ct;
    @Schema(title = "时间戳")
    private LocalDateTime ut;
    @Schema(title = "创建账号ID")
    private Long caid;
    @Schema(title = "更新账号ID")
    private Long uaid;
}