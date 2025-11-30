package org.dows.exam.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("exam_invite")
public class ExamInviteEntity extends CrudEntity<ExamInviteEntity> {

    @Schema(title = "测试邀约ID")
    private Long examInvite;
    @Schema(title = "邀约序号")
    private Integer inviteSequene;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "考试试卷ID")
    private Long examPaperId;
    @Schema(title = "岗位ID")
    private Long orgPositionId;
    @Schema(title = "考试链接")
    private String examLink;
    @Schema(title = "发送时间")
    private LocalDateTime sendTime;
    @Schema(title = "考试时间")
    private LocalDateTime examTime;
    @Schema(title = "状态")
    private Boolean state;
    @Schema(title = "时间戳")
    private LocalDateTime ct;
    @Schema(title = "时间戳")
    private LocalDateTime ut;
    @Schema(title = "创建账号ID")
    private Long caid;
    @Schema(title = "更新账号ID")
    private Long uaid;
}