package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.hr.ExamEntityRequest;
import org.dows.exam.hr.ExamEntityResponse;
import org.dows.exam.hr.ExamEntityRequest;
import org.dows.exam.hr.ExamEntityResponse;
import org.dows.exam.hr.ExamPageRequest;
import org.dows.exam.hr.ExamPageResponse;

@RequiredArgsConstructor
@Tag(name = "HrexamRest", description = "考试")
@RestController
public class HrexamRest{
    @PostMapping("hr/exam/entity")
    @Schema(title = "创建考试")
    public ExamEntityResponse postEntity(@RequestBody ExamEntityRequest examEntityRequest){
        return null;
    }
    @GetMapping("hr/exam/entity")
    @Schema(title = "考试详情,考试时间&链接等")
    public ExamEntityResponse getEntity( ExamEntityRequest examEntityRequest){
        return null;
    }
    @GetMapping("hr/exam/page")
    @Schema(title = "考试分页")
    public ExamPageResponse getPage( ExamPageRequest examPageRequest){
        return null;
    }
}