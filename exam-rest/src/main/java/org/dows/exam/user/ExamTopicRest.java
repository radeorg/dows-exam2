package org.dows.exam.user;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.user.ObjectRequest;
import org.dows.exam.user.BigintResponse;
import org.dows.exam.user.ObjectRequest;
import org.dows.exam.user.BooleanResponse;
import org.dows.exam.user.BigintRequest;
import org.dows.exam.user.BooleanResponse;
import org.dows.exam.user.BigintRequest;
import org.dows.exam.user.BooleanResponse;
import org.dows.exam.user.BigintRequest;
import org.dows.exam.user.BooleanResponse;
import org.dows.exam.user.BigintRequest;
import org.dows.exam.user.ObjectResponse;
import org.dows.exam.user.BigintRequest;
import org.dows.exam.user.ObjectResponse;

@RequiredArgsConstructor
@Tag(name = "ExamTopicRest", description = "会员实例")
@RestController
public class ExamTopicRest{
    @PostMapping("user/ExamTopic/save")
    @Schema(title = "新建考试题目")
    public BigintResponse postSave(@RequestBody ObjectRequest objectRequest){
        return null;
    }
    @PostMapping("user/ExamTopic/update")
    @Schema(title = "修改考试题目")
    public BooleanResponse postUpdate(@RequestBody ObjectRequest objectRequest){
        return null;
    }
    @PostMapping("user/ExamTopic/disable")
    @Schema(title = "禁用考试题目")
    public BooleanResponse postDisable(@RequestBody BigintRequest bigintRequest){
        return null;
    }
    @PostMapping("user/ExamTopic/enable")
    @Schema(title = "启用考试题目")
    public BooleanResponse postEnable(@RequestBody BigintRequest bigintRequest){
        return null;
    }
    @PostMapping("user/ExamTopic/delete")
    @Schema(title = "删除考试题目")
    public BooleanResponse postDelete(@RequestBody BigintRequest bigintRequest){
        return null;
    }
    @GetMapping("user/ExamTopic/get")
    @Schema(title = "查询考试题目详情")
    public ObjectResponse getGet( BigintRequest bigintRequest){
        return null;
    }
    @GetMapping("user/ExamTopic/catelog")
    @Schema(title = "listAll")
    public ObjectResponse getCatelog( BigintRequest bigintRequest){
        return null;
    }
}