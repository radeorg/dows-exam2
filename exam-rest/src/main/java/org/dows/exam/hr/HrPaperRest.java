package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.hr.PaperEntityRequest;
import org.dows.exam.hr.PaperEntityResponse;
import org.dows.exam.hr.PaperPageRequest;
import org.dows.exam.hr.PaperPageResponse;
import org.dows.exam.hr.PaperEntityRequest;
import org.dows.exam.hr.PaperEntityResponse;

@RequiredArgsConstructor
@Tag(name = "HrPaperRest", description = "试卷")
@RestController
public class HrPaperRest{

    @PostMapping("hr/paper/entity")
    @Schema(title = "生成试卷,通过examConfig对象生成试卷&试题")
    public PaperEntityResponse postEntity(@RequestBody PaperEntityRequest paperEntityRequest){
        return null;
    }

    @GetMapping("hr/paper/page")
    @Schema(title = "试卷分页,分页查询试卷")
    public PaperPageResponse getPage( PaperPageRequest paperPageRequest){
        return null;
    }

    @GetMapping("hr/paper/entity")
    @Schema(title = "试卷详情,列出试卷题目")
    public PaperEntityResponse getEntity( PaperEntityRequest paperEntityRequest){
        return null;
    }

}