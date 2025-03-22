package com.auth.checklistservice.checklistcreator.endpoints.response;

import com.auth.checklistservice.checklistcreator.domain.Question;
import com.auth.checklistservice.checklistcreator.domain.valueobj.AnswerId;

import java.util.List;

public record CreateQuestionResponse(
        String questionId,
        String text,
        String subText,
        String questionType,
        List<AnswerId> answers
) {
    public CreateQuestionResponse(Question question) {
        this(question.getId().id().toString() , question.getText(), question.getSubText(),
                question.getQuestionType().id().toString(), question.getAnswers());
    }
}
