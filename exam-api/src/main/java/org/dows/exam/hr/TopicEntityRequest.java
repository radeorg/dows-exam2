package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(description = "TopicEntityRequest 对象")
public class TopicEntityRequest {

    @Schema(description = "试题题目ID")
    private Long examTopicId;

}