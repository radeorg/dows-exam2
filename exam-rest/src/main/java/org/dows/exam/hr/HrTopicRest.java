package org.dows.exam.hr;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.hr.TopicEntityRequest;
import org.dows.exam.hr.TopicEntityResponse;
import org.dows.exam.hr.TopicEntityRequest;
import org.dows.exam.hr.TopicEntityResponse;
import org.dows.exam.hr.TopicEntityRequest;
import org.dows.exam.hr.TopicEntityResponse;
import org.dows.exam.hr.TopicEntityRequest;
import org.dows.exam.hr.TopicEntityResponse;
import org.dows.exam.hr.TopicPageRequest;
import org.dows.exam.hr.TopicPageResponse;

@RequiredArgsConstructor
@Tag(name = "HrTopicRest", description = "题目")
@RestController
public class HrTopicRest{
    @PostMapping("hr/topic/entity")
    @Schema(title = "新增题目")
    public TopicEntityResponse postEntity(@RequestBody TopicEntityRequest topicEntityRequest){
        return null;
    }
    @PutMapping("hr/topic/entity")
    @Schema(title = "修改题目")
    public TopicEntityResponse putEntity(@RequestBody TopicEntityRequest topicEntityRequest){
        return null;
    }
    @DeleteMapping("hr/topic/entity")
    @Schema(title = "删除题目")
    public TopicEntityResponse deleteEntity(@RequestBody TopicEntityRequest topicEntityRequest){
        return null;
    }
    @GetMapping("hr/topic/entity")
    @Schema(title = "题目详情")
    public TopicEntityResponse getEntity( TopicEntityRequest topicEntityRequest){
        return null;
    }
    @GetMapping("hr/topic/page")
    @Schema(title = "题目分页")
    public TopicPageResponse getPage( TopicPageRequest topicPageRequest){
        return null;
    }
}