package com.auth.checklistservice.checklistcreator.endpoints.request;
import org.springframework.util.Assert;

import java.util.List;

public record CreateQuestionRequest(
        String text,
        String subText,
        String questionType,
        List<String> answers
) {
    public CreateQuestionRequest {
        Assert.notNull(text, "text must be not null.");
        Assert.notNull(questionType, "Question must have a type");
        Assert.notEmpty(answers, "Question must have at least 1 answer");
    }
}
