package org.dows.exam.user;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.user.ExamEntityRequest;
import org.dows.exam.user.ExamEntityResponse;
import org.dows.exam.user.ExamEntityRequest;
import org.dows.exam.user.ExamEntityResponse;

@RequiredArgsConstructor
@Tag(name = "UserExamRest", description = "考试")
@RestController
public class UserExamRest{

    @GetMapping("user/exam/entity")
    @Schema(title = "考试详情,考试时间&链接等")
    public ExamEntityResponse getEntity( ExamEntityRequest examEntityRequest){
        return null;
    }

    @PostMapping("user/exam/entity")
    @Schema(title = "考试答案，写入试题答案到考试答案表")
    public ExamEntityResponse postEntity(@RequestBody ExamEntityRequest examEntityRequest){
        return null;
    }

}