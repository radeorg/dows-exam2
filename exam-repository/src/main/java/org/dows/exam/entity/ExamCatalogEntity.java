package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_catalog")
public class ExamCatalogEntity extends CrudEntity<ExamCatalogEntity> {

    @Schema(title = "考试类目ID")
    private Long examCatalogId;
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
    @Schema(title = "时间戳")
    private LocalDateTime ct;
    @Schema(title = "时间戳")
    private LocalDateTime ut;
    @Schema(title = "创建账号ID")
    private Long caid;
    @Schema(title = "更新账号ID")
    private Long uaid;
}