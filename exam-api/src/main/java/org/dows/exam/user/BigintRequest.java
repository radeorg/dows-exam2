package org.dows.exam.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "BigintRequest 对象",title = "BigintRequest")
@NoArgsConstructor
public class BigintRequest{
    @Schema(title = "考试类目ID")
    private Long examCatelogId;

}
