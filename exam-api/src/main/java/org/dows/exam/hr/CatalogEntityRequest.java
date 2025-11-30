package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "CatalogEntityRequest 对象")
public class CatalogEntityRequest {

    @Schema(description = "类目ID")
    private Long examCatalogId;

}