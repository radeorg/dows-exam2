package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_config")
public class ExamConfigEntity extends CrudEntity<ExamConfigEntity> {

    @Schema(title = "考试配置ID")
    private Long examConfigId;
    @Schema(title = "组织根ID")
    private Long orgRootId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "岗位描述ID")
    private Long orgJdId;
    @Schema(title = "题目配置[{examCategoryId:11,percent:20%,examTopicIds:[1,2,3]}]")
    private Object topicConfig;
    @Schema(title = "总题数")
    private Integer total;
    @Schema(title = "数据来源表")
    private String dataTable;
    @Schema(title = "试卷模板")
    private String template;
    @Schema(title = "总分")
    private Integer score;
    @Schema(title = "策略[0:顺序，1:随机]")
    private Integer strategy;
    @Schema(title = "考试时长")
    private Integer duration;
    @Schema(title = "是否合并分类")
    private Boolean merged;
    @Schema(title = "试卷数量")
    private Integer paperCount;
    @Schema(title = "是否随机出题")
    private Boolean random;
    @Schema(title = "归属者")
    private Long accountInstanceId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "应用ID")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
    @Schema(title = "操作者ID")
    private Long operatorId;
}