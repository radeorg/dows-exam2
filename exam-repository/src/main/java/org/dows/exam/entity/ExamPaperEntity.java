package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_paper")
public class ExamPaperEntity extends CrudEntity<ExamPaperEntity> {

    @Schema(title = "考试试卷ID")
    private Long examPaperId;
    @Schema(title = "考试配置ID")
    private Long examConfigId;
    @Schema(title = "操作者ID")
    private Long operatorId;
    @Schema(title = "考试时长")
    private Integer examDuration;
    @Schema(title = "试卷内容（freemarker渲染生成）")
    private String content;
    @Schema(title = "试卷链接")
    private String link;
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