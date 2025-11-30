package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.hr.CatalogEntityRequest;
import org.dows.exam.hr.CatalogEntityResponse;
import org.dows.exam.hr.CatalogEntityRequest;
import org.dows.exam.hr.CatalogEntityResponse;
import org.dows.exam.hr.CatalogEntityRequest;
import org.dows.exam.hr.CatalogEntityResponse;
import org.dows.exam.hr.CatalogTreeRequest;
import org.dows.exam.hr.CatalogTreeResponse;

@RequiredArgsConstructor
@Tag(name = "HrCatalogRest", description = "类目")
@RestController
public class HrCatalogRest{
    @PostMapping("hr/catalog/entity")
    @Schema(title = "新增类目")
    public CatalogEntityResponse postEntity(@RequestBody CatalogEntityRequest catalogEntityRequest){
        return null;
    }
    @PutMapping("hr/catalog/entity")
    @Schema(title = "修改类目")
    public CatalogEntityResponse putEntity(@RequestBody CatalogEntityRequest catalogEntityRequest){
        return null;
    }
    @DeleteMapping("hr/catalog/entity")
    @Schema(title = "删除类目")
    public CatalogEntityResponse deleteEntity(@RequestBody CatalogEntityRequest catalogEntityRequest){
        return null;
    }
    @GetMapping("hr/catalog/tree")
    @Schema(title = "获取类目树")
    public CatalogTreeResponse getTree( CatalogTreeRequest catalogTreeRequest){
        return null;
    }
}