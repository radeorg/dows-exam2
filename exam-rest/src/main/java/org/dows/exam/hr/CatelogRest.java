package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.hr.CatelogEntityRequest;
import org.dows.exam.hr.CatelogEntityResponse;
import org.dows.exam.hr.CatelogEntityRequest;
import org.dows.exam.hr.CatelogEntityResponse;
import org.dows.exam.hr.CatelogEntityRequest;
import org.dows.exam.hr.CatelogEntityResponse;
import org.dows.exam.hr.CatelogTreeRequest;
import org.dows.exam.hr.CatelogTreeResponse;

@RequiredArgsConstructor
@Tag(name = "CatelogRest", description = "类目")
@RestController
public class CatelogRest{
    @PostMapping("hr/catelog/entity")
    @Schema(title = "新增类目")
    public CatelogEntityResponse postEntity(@RequestBody CatelogEntityRequest catelogEntityRequest){
        return null;
    }
    @PutMapping("hr/catelog/entity")
    @Schema(title = "修改类目")
    public CatelogEntityResponse putEntity(@RequestBody CatelogEntityRequest catelogEntityRequest){
        return null;
    }
    @DeleteMapping("hr/catelog/entity")
    @Schema(title = "删除类目")
    public CatelogEntityResponse deleteEntity(@RequestBody CatelogEntityRequest catelogEntityRequest){
        return null;
    }
    @GetMapping("hr/catelog/tree")
    @Schema(title = "获取类目树")
    public CatelogTreeResponse getTree( CatelogTreeRequest catelogTreeRequest){
        return null;
    }
}