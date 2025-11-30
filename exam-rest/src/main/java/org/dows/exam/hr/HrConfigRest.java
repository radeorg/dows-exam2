package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.hr.ConfigEntityRequest;
import org.dows.exam.hr.ConfigEntityResponse;
import org.dows.exam.hr.ConfigEntityRequest;
import org.dows.exam.hr.ConfigEntityResponse;
import org.dows.exam.hr.ConfigEntityRequest;
import org.dows.exam.hr.ConfigEntityResponse;
import org.dows.exam.hr.ConfigPageRequest;
import org.dows.exam.hr.ConfigPageResponse;
import org.dows.exam.hr.ConfigEntityRequest;
import org.dows.exam.hr.ConfigEntityResponse;

@RequiredArgsConstructor
@Tag(name = "HrConfigRest", description = "配置")
@RestController
public class HrConfigRest{
    @PostMapping("hr/config/entity")
    @Schema(title = "创建配置")
    public ConfigEntityResponse postEntity(@RequestBody ConfigEntityRequest configEntityRequest){
        return null;
    }
    @PutMapping("hr/config/entity")
    @Schema(title = "修改配置")
    public ConfigEntityResponse putEntity(@RequestBody ConfigEntityRequest configEntityRequest){
        return null;
    }
    @DeleteMapping("hr/config/entity")
    @Schema(title = "删除配置")
    public ConfigEntityResponse deleteEntity(@RequestBody ConfigEntityRequest configEntityRequest){
        return null;
    }
    @GetMapping("hr/config/page")
    @Schema(title = "配置分页")
    public ConfigPageResponse getPage( ConfigPageRequest configPageRequest){
        return null;
    }
    @GetMapping("hr/config/entity")
    @Schema(title = "配置详情")
    public ConfigEntityResponse getEntity( ConfigEntityRequest configEntityRequest){
        return null;
    }
}