package org.dows.exam.user;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.exam.user.PaperEntityRequest;
import org.dows.exam.user.PaperEntityResponse;
import org.dows.exam.user.PaperQuestionRequest;
import org.dows.exam.user.PaperQuestionResponse;

@RequiredArgsConstructor
@Tag(name = "UserpaperRest", description = "试卷")
@RestController
public class UserpaperRest{
    @GetMapping("user/paper/entity")
    @Schema(title = "试卷详情,列出试卷题目")
    public PaperEntityResponse getEntity( PaperEntityRequest paperEntityRequest){
        return null;
    }
    @GetMapping("user/paper/question")
    @Schema(title = "获取试卷中的下一题")
    public PaperQuestionResponse getQuestion( PaperQuestionRequest paperQuestionRequest){
        return null;
    }
}