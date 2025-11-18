package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_catelog")
public class ExamCatelogEntity extends CrudEntity<ExamCatelogEntity> {

    @Schema(title = "考试类目ID")
    private Long examCatelogId;
    @Schema(title = "父ID")
    private Long pid;
    @Schema(title = "知识类目")
    private String name;
    @Schema(title = "code")
    private String code;
    @Schema(title = "应用ID")
    private String appId;
    @Schema(title = "出题提示词，如多维度[{性格,价值观,心理},{java,mysql,ai}]")
    private String prompt;
    @Schema(title = "归属者")
    private Long accountInstanceId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
}